
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object studentsForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" xmlns:v-on="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>

</head>
<body>
<div>

</div>
<div id="app">
    <div>
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Student</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#"> </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Printers info</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link disabled">Users</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>

    <div class="w3-sidebar w3-bar-block" style="width:10%">
        <a id="sidebarHome" href="#" class="w3-bar-item w3-button">Home</a>
        <a href="#" class="w3-bar-item w3-button">Users</a>
        <a href="#" class="w3-bar-item w3-button">Play Primo</a>
         <a href="#" class="w3-bar-item w3-button">SandBox</a>
         <a href="#" class="w3-bar-item w3-button">Calculator</a>
         <a href="#" class="w3-bar-item w3-button">404 Not found</a>
    </div>
<div id="mainForm" class="container">
    <form v-on:submit.prevent="onSubmit">
        <div class="col-md-2">
            <label class="form-label"> Name: </label>
            <input type="text" class="form-control"
                   :class=""""),format.raw/*63.28*/("""{"""),format.raw/*63.29*/("""'is-valid': form.firstName.length >= 5, 'is-invalid': (form.firstName.length <= 4 && form.firstName.length >= 1) === true"""),format.raw/*63.150*/("""}"""),format.raw/*63.151*/(""""
                   id="firstName" name="firstName" v-model="form.firstName"
                   placeholder="Jhonny">
            <div v-if="form.firstName.length >= 5" class="valid-feedback">
                Looks great!
            </div>
            <div v-if="(form.firstName.length <= 4 && form.firstName.length >= 1) === true" class="invalid-feedback">
                invalid!
            </div>
        </div>

        <div class="col-md-2">

            <label class="form-label"> Last Name: </label>
            <input type="text" class="form-control"
                   :class=""""),format.raw/*78.28*/("""{"""),format.raw/*78.29*/("""'is-valid': form.lastName.length >= 5, 'is-invalid': (form.lastName.length <= 4 && form.lastName.length >= 1) === true"""),format.raw/*78.147*/("""}"""),format.raw/*78.148*/(""""
                   id="lastName" name="lastName" v-model="form.lastName"
                   placeholder="Doe">
            <div v-if="form.lastName.length >= 5 " class="valid-feedback">
                Looks great!
            </div>
            <div v-if="(form.lastName.length <= 4 && form.lastName.length >= 1) === true" class="invalid-feedback">
                invalid!
            </div>
        </div>

        <br>
        <div class="col-md-2">
            <label> Career: </label>

            <input type="text" class="form-control"
                   id="career"
                   name="career" v-model="form.career"
                   placeholder="Ingenieria en sistemas">
        </div>
        <br>
        <div class="col-md-1">

            <label> Sex: </label>
            <input type="text" class="form-control"
                   :class=""""),format.raw/*103.28*/("""{"""),format.raw/*103.29*/("""'is-valid': form.sex.length === 1, 'is-invalid': form.sex.length >= 2"""),format.raw/*103.98*/("""}"""),format.raw/*103.99*/("""" id="sex"
                   name="sex" v-model="form.sex"
                   placeholder="M">
            <div v-if="form.sex.length === 1" class="valid-feedback">
                Looks great!
            </div>
            <div v-if="form.sex.length >= 2" class="invalid-feedback">
                invalid!
            </div>
        </div>
        <p>What's your opinion about the way the university use their resources to improve learning?</p>
        <textarea id="survey" name="survey" v-model="form.survey"
                  placeholder="Insert your opinion here, insecto"></textarea>
        <div class="col-mg-4">
            <button class="btn btn-outline-success me-2" type="button">Submit</button>
        </div>

    </form>
</div>
</div>
</div>

<script>
    let app = new Vue("""),format.raw/*126.23*/("""{"""),format.raw/*126.24*/("""
        """),format.raw/*127.9*/("""el: '#app',
        data: """),format.raw/*128.15*/("""{"""),format.raw/*128.16*/("""
            """),format.raw/*129.13*/("""form: """),format.raw/*129.19*/("""{"""),format.raw/*129.20*/("""
                """),format.raw/*130.17*/("""firstName: '',
                lastName: '',
                career: '',
                sex: '',
                survey: ''
            """),format.raw/*135.13*/("""}"""),format.raw/*135.14*/(""",
        """),format.raw/*136.9*/("""}"""),format.raw/*136.10*/(""",
        methods: """),format.raw/*137.18*/("""{"""),format.raw/*137.19*/("""
            """),format.raw/*138.13*/("""onSubmit() """),format.raw/*138.24*/("""{"""),format.raw/*138.25*/("""
                """),format.raw/*139.17*/("""axios.post('/add-student', this.form).then(response => """),format.raw/*139.72*/("""{"""),format.raw/*139.73*/("""
                    """),format.raw/*140.21*/("""console.log(response)
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/(""")
                    .then(function (response) """),format.raw/*142.47*/("""{"""),format.raw/*142.48*/("""
                        """),format.raw/*143.25*/("""console.log(response);
                    """),format.raw/*144.21*/("""}"""),format.raw/*144.22*/(""")
                    .catch(function (error) """),format.raw/*145.45*/("""{"""),format.raw/*145.46*/("""
                        """),format.raw/*146.25*/("""console.log(error);
                    """),format.raw/*147.21*/("""}"""),format.raw/*147.22*/(""");
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""


        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""",
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""")

</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
<style>
   #mainForm"""),format.raw/*159.13*/("""{"""),format.raw/*159.14*/("""
       """),format.raw/*160.8*/("""margin-left: 10%;
       margin-top: 2%;

   """),format.raw/*163.4*/("""}"""),format.raw/*163.5*/("""
   """),format.raw/*164.4*/("""#sidebarHome"""),format.raw/*164.16*/("""{"""),format.raw/*164.17*/("""
       """),format.raw/*165.8*/("""font-size:150% ;
   """),format.raw/*166.4*/("""}"""),format.raw/*166.5*/("""
   """),format.raw/*167.4*/("""body"""),format.raw/*167.8*/("""{"""),format.raw/*167.9*/("""
      """),format.raw/*168.7*/("""font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
   """),format.raw/*169.4*/("""}"""),format.raw/*169.5*/("""

"""),format.raw/*171.1*/("""</style>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/studentsForm.scala.html
                  HASH: 13b5ab8ac59544dcf4ccf5c5c786803d8dfa03cb
                  MATRIX: 818->0|3709->2865|3738->2866|3888->2987|3918->2988|4536->3578|4565->3579|4712->3697|4742->3698|5633->4560|5663->4561|5761->4630|5791->4631|6612->5423|6642->5424|6679->5433|6734->5459|6764->5460|6806->5473|6841->5479|6871->5480|6917->5497|7083->5634|7113->5635|7151->5645|7181->5646|7229->5665|7259->5666|7301->5679|7341->5690|7371->5691|7417->5708|7501->5763|7531->5764|7581->5785|7648->5823|7678->5824|7755->5872|7785->5873|7839->5898|7911->5941|7941->5942|8016->5988|8046->5989|8100->6014|8169->6054|8199->6055|8243->6070|8273->6071|8312->6082|8342->6083|8376->6089|8405->6090|8692->6349|8722->6350|8758->6358|8831->6403|8860->6404|8892->6408|8933->6420|8963->6421|8999->6429|9047->6449|9076->6450|9108->6454|9140->6458|9169->6459|9204->6466|9431->6665|9460->6666|9490->6668
                  LINES: 26->1|88->63|88->63|88->63|88->63|103->78|103->78|103->78|103->78|128->103|128->103|128->103|128->103|151->126|151->126|152->127|153->128|153->128|154->129|154->129|154->129|155->130|160->135|160->135|161->136|161->136|162->137|162->137|163->138|163->138|163->138|164->139|164->139|164->139|165->140|166->141|166->141|167->142|167->142|168->143|169->144|169->144|170->145|170->145|171->146|172->147|172->147|173->148|173->148|176->151|176->151|177->152|177->152|184->159|184->159|185->160|188->163|188->163|189->164|189->164|189->164|190->165|191->166|191->166|192->167|192->167|192->167|193->168|194->169|194->169|196->171
                  -- GENERATED --
              */
          