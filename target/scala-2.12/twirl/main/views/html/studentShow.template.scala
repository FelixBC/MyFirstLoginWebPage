
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

object studentShow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <title>Title</title>
</head>
<body>
<label>Students</label>
<div id="app">
    <form v-on:submit.prevent="onSubmit">
        <br>
        <label> Name: </label>
        <input type="text" id="firstName" name="firstName" v-model="form.firstName" placeholder="John">
        <br>
        <label> Last Name: </label>
        <input type="text" id="lastName" name="lastName" v-model="form.lastName" placeholder="Doe">
        <br>
        <label> Career: </label>
        <input type="text" id="career" name="career" v-model="form.career" placeholder="Ingenieria en sistemas">
        <br>
        <label> Sex: </label>
        <input type="text" id="sex" name="sex" v-model="form.sex" placeholder="Masculino">

        <p>What's your opinion about the way the university use their resources to improve learning?</p>
        <textarea id="survey" name="survey" v-model="form.survey"
                  placeholder="Insert your opinion here, insecto"></textarea>
        <button>Submit</button>
    </form>
</div>

<script>
    let app = new Vue("""),format.raw/*34.23*/("""{"""),format.raw/*34.24*/("""
        """),format.raw/*35.9*/("""el: '#app',
        data: """),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""
            """),format.raw/*37.13*/("""form: """),format.raw/*37.19*/("""{"""),format.raw/*37.20*/("""
                """),format.raw/*38.17*/("""firstName: '',
                lastName: '',
                career: '',
                sex: '',
                survey: ''
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/(""",
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""",
        methods: """),format.raw/*45.18*/("""{"""),format.raw/*45.19*/("""
            """),format.raw/*46.13*/("""onSubmit() """),format.raw/*46.24*/("""{"""),format.raw/*46.25*/("""
                """),format.raw/*47.17*/("""axios.get('/add-student', this.form).then(response => """),format.raw/*47.71*/("""{"""),format.raw/*47.72*/("""
                    """),format.raw/*48.21*/("""console.log(response)
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""")
                    .then(function (response) """),format.raw/*50.47*/("""{"""),format.raw/*50.48*/("""
                        """),format.raw/*51.25*/("""console.log(response);
                    """),format.raw/*52.21*/("""}"""),format.raw/*52.22*/(""")
                    .catch(function (error) """),format.raw/*53.45*/("""{"""),format.raw/*53.46*/("""
                        """),format.raw/*54.25*/("""console.log(error);
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""");
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""


        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""",
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/(""")
</script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/studentShow.scala.html
                  HASH: e1a5d5c32514818b38cf955afc1c6418e9e18451
                  MATRIX: 817->0|2112->1268|2141->1269|2177->1278|2231->1304|2260->1305|2301->1318|2335->1324|2364->1325|2409->1342|2574->1479|2603->1480|2640->1490|2669->1491|2716->1510|2745->1511|2786->1524|2825->1535|2854->1536|2899->1553|2981->1607|3010->1608|3059->1629|3125->1667|3154->1668|3230->1716|3259->1717|3312->1742|3383->1785|3412->1786|3486->1832|3515->1833|3568->1858|3636->1898|3665->1899|3708->1914|3737->1915|3775->1926|3804->1927|3837->1933|3865->1934
                  LINES: 26->1|59->34|59->34|60->35|61->36|61->36|62->37|62->37|62->37|63->38|68->43|68->43|69->44|69->44|70->45|70->45|71->46|71->46|71->46|72->47|72->47|72->47|73->48|74->49|74->49|75->50|75->50|76->51|77->52|77->52|78->53|78->53|79->54|80->55|80->55|81->56|81->56|84->59|84->59|85->60|85->60
                  -- GENERATED --
              */
          