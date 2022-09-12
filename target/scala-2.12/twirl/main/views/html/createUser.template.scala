
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

object createUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
<label>Create User</label>
<div id="app">
    <form v-on:submit.prevent="onSubmit">
        <br>
        <label> Name: </label>
        <input type="text" id="username" name="username" v-model="form.username" placeholder="John_23">
        <br>
        <label> Last Name: </label>
        <input type="password" id="password" name="password" v-model="form.password" placeholder="******">
        <br>
        <button>Create</button>
        <br>
        <br>
    </form>
    <button v-on:click="goToLogin">Go back</button>
</div>
<script>
    let app = new Vue("""),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
        """),format.raw/*28.9*/("""el: '#app',
        data: """),format.raw/*29.15*/("""{"""),format.raw/*29.16*/("""
            """),format.raw/*30.13*/("""form: """),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
                """),format.raw/*31.17*/("""username: '',
                password: '',
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""",
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""",
        methods: """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
            """),format.raw/*36.13*/("""goToLogin()"""),format.raw/*36.24*/("""{"""),format.raw/*36.25*/("""
                """),format.raw/*37.17*/("""window.history.back()
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""",
            onSubmit() """),format.raw/*39.24*/("""{"""),format.raw/*39.25*/("""
                """),format.raw/*40.17*/("""axios.post('/add-user', this.form).then(response => """),format.raw/*40.69*/("""{"""),format.raw/*40.70*/("""
                    """),format.raw/*41.21*/("""console.log(response)
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""")
                    .then(function (response) """),format.raw/*43.47*/("""{"""),format.raw/*43.48*/("""
                        """),format.raw/*44.25*/("""console.log(response);
                    """),format.raw/*45.21*/("""}"""),format.raw/*45.22*/(""")
                    .catch(function (error) """),format.raw/*46.45*/("""{"""),format.raw/*46.46*/("""
                        """),format.raw/*47.25*/("""console.log(error);
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/(""");
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""


        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""",
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""")
</script>
</body>
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
                  SOURCE: app/views/createUser.scala.html
                  HASH: e00d8bcd9c280b8a7cb918783838bedcfba11b00
                  MATRIX: 816->0|1668->825|1697->826|1733->835|1787->861|1816->862|1857->875|1891->881|1920->882|1965->899|2049->955|2078->956|2115->966|2144->967|2191->986|2220->987|2261->1000|2300->1011|2329->1012|2374->1029|2436->1063|2465->1064|2518->1089|2547->1090|2592->1107|2672->1159|2701->1160|2750->1181|2816->1219|2845->1220|2921->1268|2950->1269|3003->1294|3074->1337|3103->1338|3177->1384|3206->1385|3259->1410|3327->1450|3356->1451|3399->1466|3428->1467|3466->1478|3495->1479|3528->1485|3556->1486
                  LINES: 26->1|52->27|52->27|53->28|54->29|54->29|55->30|55->30|55->30|56->31|58->33|58->33|59->34|59->34|60->35|60->35|61->36|61->36|61->36|62->37|63->38|63->38|64->39|64->39|65->40|65->40|65->40|66->41|67->42|67->42|68->43|68->43|69->44|70->45|70->45|71->46|71->46|72->47|73->48|73->48|74->49|74->49|77->52|77->52|78->53|78->53
                  -- GENERATED --
              */
          