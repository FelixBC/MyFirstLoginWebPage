// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:27
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:27
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-numbers-form""", """controllers.HomeController.addNumbersForm()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-numbers""", """controllers.HomeController.addNumbers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sandbox""", """controllers.HomeController.sandbox()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play-primoForm""", """controllers.HomeController.playPrimoForm()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play-primo""", """controllers.HomeController.playPrimo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play-primo-calculate""", """controllers.HomeController.calculateOperations()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calculator-delete""", """controllers.HomeController.calculatorDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student""", """controllers.HomeController.studentView()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-student""", """controllers.HomeController.addStudents()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-user""", """controllers.HomeController.addUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login-view""", """controllers.HomeController.loginView()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user-view""", """controllers.HomeController.createUserView()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login-check""", """controllers.HomeController.getUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.dashboardView()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_explore2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore2_invoker = createInvoker(
    HomeController_0.explore(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_tutorial3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial3_invoker = createInvoker(
    HomeController_0.tutorial(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addNumbersForm4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-numbers-form")))
  )
  private[this] lazy val controllers_HomeController_addNumbersForm4_invoker = createInvoker(
    HomeController_0.addNumbersForm(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addNumbersForm",
      Nil,
      "GET",
      this.prefix + """add-numbers-form""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addNumbers5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-numbers")))
  )
  private[this] lazy val controllers_HomeController_addNumbers5_invoker = createInvoker(
    HomeController_0.addNumbers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addNumbers",
      Nil,
      "GET",
      this.prefix + """add-numbers""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_sandbox6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sandbox")))
  )
  private[this] lazy val controllers_HomeController_sandbox6_invoker = createInvoker(
    HomeController_0.sandbox(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sandbox",
      Nil,
      "GET",
      this.prefix + """sandbox""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_playPrimoForm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play-primoForm")))
  )
  private[this] lazy val controllers_HomeController_playPrimoForm7_invoker = createInvoker(
    HomeController_0.playPrimoForm(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "playPrimoForm",
      Nil,
      "GET",
      this.prefix + """play-primoForm""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_playPrimo8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play-primo")))
  )
  private[this] lazy val controllers_HomeController_playPrimo8_invoker = createInvoker(
    HomeController_0.playPrimo(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "playPrimo",
      Nil,
      "GET",
      this.prefix + """play-primo""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_calculateOperations9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play-primo-calculate")))
  )
  private[this] lazy val controllers_HomeController_calculateOperations9_invoker = createInvoker(
    HomeController_0.calculateOperations(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "calculateOperations",
      Nil,
      "GET",
      this.prefix + """play-primo-calculate""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_calculatorDelete10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calculator-delete")))
  )
  private[this] lazy val controllers_HomeController_calculatorDelete10_invoker = createInvoker(
    HomeController_0.calculatorDelete(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "calculatorDelete",
      Nil,
      "GET",
      this.prefix + """calculator-delete""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_studentView11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student")))
  )
  private[this] lazy val controllers_HomeController_studentView11_invoker = createInvoker(
    HomeController_0.studentView(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "studentView",
      Nil,
      "GET",
      this.prefix + """student""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addStudents12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-student")))
  )
  private[this] lazy val controllers_HomeController_addStudents12_invoker = createInvoker(
    HomeController_0.addStudents(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addStudents",
      Nil,
      "POST",
      this.prefix + """add-student""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addUser13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-user")))
  )
  private[this] lazy val controllers_HomeController_addUser13_invoker = createInvoker(
    HomeController_0.addUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """add-user""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_loginView14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login-view")))
  )
  private[this] lazy val controllers_HomeController_loginView14_invoker = createInvoker(
    HomeController_0.loginView(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginView",
      Nil,
      "GET",
      this.prefix + """login-view""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_createUserView15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user-view")))
  )
  private[this] lazy val controllers_HomeController_createUserView15_invoker = createInvoker(
    HomeController_0.createUserView(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createUserView",
      Nil,
      "GET",
      this.prefix + """user-view""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_getUser16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login-check")))
  )
  private[this] lazy val controllers_HomeController_getUser16_invoker = createInvoker(
    HomeController_0.getUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getUser",
      Nil,
      "GET",
      this.prefix + """login-check""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_dashboardView17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_dashboardView17_invoker = createInvoker(
    HomeController_0.dashboardView(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "dashboardView",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:8
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_HomeController_explore2_route(params@_) =>
      call { 
        controllers_HomeController_explore2_invoker.call(HomeController_0.explore())
      }
  
    // @LINE:10
    case controllers_HomeController_tutorial3_route(params@_) =>
      call { 
        controllers_HomeController_tutorial3_invoker.call(HomeController_0.tutorial())
      }
  
    // @LINE:11
    case controllers_HomeController_addNumbersForm4_route(params@_) =>
      call { 
        controllers_HomeController_addNumbersForm4_invoker.call(HomeController_0.addNumbersForm())
      }
  
    // @LINE:12
    case controllers_HomeController_addNumbers5_route(params@_) =>
      call { 
        controllers_HomeController_addNumbers5_invoker.call(HomeController_0.addNumbers())
      }
  
    // @LINE:13
    case controllers_HomeController_sandbox6_route(params@_) =>
      call { 
        controllers_HomeController_sandbox6_invoker.call(HomeController_0.sandbox())
      }
  
    // @LINE:14
    case controllers_HomeController_playPrimoForm7_route(params@_) =>
      call { 
        controllers_HomeController_playPrimoForm7_invoker.call(HomeController_0.playPrimoForm())
      }
  
    // @LINE:15
    case controllers_HomeController_playPrimo8_route(params@_) =>
      call { 
        controllers_HomeController_playPrimo8_invoker.call(HomeController_0.playPrimo())
      }
  
    // @LINE:16
    case controllers_HomeController_calculateOperations9_route(params@_) =>
      call { 
        controllers_HomeController_calculateOperations9_invoker.call(HomeController_0.calculateOperations())
      }
  
    // @LINE:17
    case controllers_HomeController_calculatorDelete10_route(params@_) =>
      call { 
        controllers_HomeController_calculatorDelete10_invoker.call(HomeController_0.calculatorDelete())
      }
  
    // @LINE:18
    case controllers_HomeController_studentView11_route(params@_) =>
      call { 
        controllers_HomeController_studentView11_invoker.call(HomeController_0.studentView())
      }
  
    // @LINE:19
    case controllers_HomeController_addStudents12_route(params@_) =>
      call { 
        controllers_HomeController_addStudents12_invoker.call(HomeController_0.addStudents())
      }
  
    // @LINE:20
    case controllers_HomeController_addUser13_route(params@_) =>
      call { 
        controllers_HomeController_addUser13_invoker.call(HomeController_0.addUser())
      }
  
    // @LINE:21
    case controllers_HomeController_loginView14_route(params@_) =>
      call { 
        controllers_HomeController_loginView14_invoker.call(HomeController_0.loginView())
      }
  
    // @LINE:22
    case controllers_HomeController_createUserView15_route(params@_) =>
      call { 
        controllers_HomeController_createUserView15_invoker.call(HomeController_0.createUserView())
      }
  
    // @LINE:23
    case controllers_HomeController_getUser16_route(params@_) =>
      call { 
        controllers_HomeController_getUser16_invoker.call(HomeController_0.getUser())
      }
  
    // @LINE:24
    case controllers_HomeController_dashboardView17_route(params@_) =>
      call { 
        controllers_HomeController_dashboardView17_invoker.call(HomeController_0.dashboardView())
      }
  
    // @LINE:27
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
