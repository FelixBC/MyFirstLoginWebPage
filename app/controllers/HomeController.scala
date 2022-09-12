package controllers

import math.Numeric.Implicits.infixNumericOps
import javax.inject._
import play.api._
import play.api.mvc._
import responses.{AddNumbersResponse, CalculateOperationsResponse, CalculatorDeleteResponse, PlayPrimoResponse}
import services.GsonService
import org.squeryl.{PrimitiveTypeMode, SessionFactory}
import play.api.data.Form
import play.api.data.Forms._
import models.ApplicationSchema.{studentSurveys, userNames}
import models.{StudentSurvey, UserName}
import org.squeryl
import org.squeryl.PrimitiveTypeMode.__thisDsl
import org.squeryl.adapters.PostgreSqlAdapter
import play.api.libs.json.{JsValue, __}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents,
                               gsonService: GsonService) extends AbstractController(cc) {

  private val gson = gsonService.getGson()

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def sandbox() = Action { implicit request =>
    if (isAuthorized(request)) {
      Ok("{someNumber: 6,\"anotherNumber\": 9,\"one more number\": 10,theBool: false,aNullProperty: null,someArray: [1,2,3],nestedObject: {aNestedNumber: 25,aNestedString: \"theNestedString\"}}").as(JSON)
    } else {
      NotFound
    }
  }

  def addNumbersForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.addNumbersForm())
  }

  def addNumbers() = Action { implicit request: Request[AnyContent] =>
    val parametersMap: Map[String, Seq[String]] = request.queryString
    val number1 = parametersMap.apply("number1").head.toInt
    val number2 = parametersMap.apply("number2").head.toInt
    val total: Int = number1 + number2
    val response = AddNumbersResponse(total)
    Ok(gson.toJson(response)).as(JSON)
  }

  def renewedIndex() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.renewedIndex())
  }

  def playPrimoForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.playPrimoForm())
  }

  def playPrimo() = Action { implicit request: Request[AnyContent] =>
    val parametersMap: Map[String, Seq[String]] = request.queryString
    val number = parametersMap.apply("number1").head.toInt

    val result = if (number == 0) {
      "N/A"
    } else if (number % 2 == 0) {
      "even"
    } else {
      "odd"
    }
    val response = PlayPrimoResponse(result = result)
    Ok(gson.toJson(response)).as(JSON)
  }

  def calculateOperations() = Action { implicit request: Request[AnyContent] =>
    val parametersMap: Map[String, Seq[String]] = request.queryString
    val numbersParameter: String = parametersMap.apply("number2").head
    val operands = List('+', '-', '/', '*', '%')
    val List(a, b) = numbersParameter.split(operands.toArray).map(_.toFloat).toList
    val result = if (numbersParameter.contains("+")) {
      a + b
    } else if (numbersParameter.contains("-")) {
      a - b
    } else if (numbersParameter.contains("/")) {
      a / b
    } else if (numbersParameter.contains("*")) {
      a * b
    } else if (numbersParameter.contains("%")) {
      a % b
    } else {
      1
    }
    val response = CalculateOperationsResponse(result)
    Ok(gson.toJson(response)).as(JSON)
  }

  def studentView() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.studentsForm())
  }

  def addStudents() = Action { implicit request: Request[AnyContent] =>
    initializeDatabase();
    val value = request.body.asJson.get.toString()
    val survey = gson.fromJson(value, classOf[StudentSurvey])
    val createdId = PrimitiveTypeMode.inTransaction {
      studentSurveys.insert(survey).id
    }
    Ok(gson.toJson(survey)).as(JSON)
  }

  def getUser() = Action { implicit request: Request[AnyContent] =>
    Ok(s"").as(JSON)
  }

  def getStudents() = Action { implicit request: Request[AnyContent] =>

    Ok(s"").as(JSON)
  }

  def createUserView() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.createUser())
  }

  def checkIfUserExists() = Action { implicit request: Request[AnyContent] =>
    initializeDatabase()

    val parametersMap: Map[String, Seq[String]] = request.queryString
    val formUsername: String = parametersMap.apply("username").head
 //   def username = userNames.where('')
    val value = request.body.asJson.get.toString()
    val formData = gson.fromJson(value, classOf[UserName])
    Ok
  }

  def dashboardView() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.dashBoard())
  }

  def loginView() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.login())
  }

  def addUser() = Action { implicit request: Request[AnyContent] =>
    initializeDatabase();

    val value = request.body.asJson.get.toString()
    val formData = gson.fromJson(value, classOf[UserName])
    //Just for testing or debuggin purposes
    val createdId = PrimitiveTypeMode.inTransaction {
      userNames.insert(formData).id

    }

    Ok(gson.toJson(formData)).as(JSON)

  }

  def calculatorDelete() = Action { implicit request: Request[AnyContent] =>
    val parametersMap: Map[String, Seq[String]] = request.queryString
    val numbersParameter: String = parametersMap.apply("number2").head
    val result = numbersParameter.dropRight(1)
    val response = CalculatorDeleteResponse(result = result)
    Ok(gson.toJson(response)).as(JSON)

  }

  private def initializeDatabase(): Unit = {
    val DB_URL = "jdbc:postgresql://localhost/student"
    SessionFactory.concreteFactory = Some(() =>
      squeryl.Session.create(java.sql.DriverManager.getConnection(DB_URL, "postgres", "111111"), new PostgreSqlAdapter)
    )
  }

  private def isAuthorized(request: Request[_]): Boolean = {
    true
  }

}
