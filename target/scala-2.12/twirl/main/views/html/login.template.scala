
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Title</title>
</head>
<body>

<div id="main-container" class="position-absolute  shadow p-3 mb-5 bg-body rounded text-center card-body">
    <div id="app">

        <form v-on:submit.prevent="onSubmit">
            <br>
            <div id="user-info">
                <input class="input-group-text" type="text" id="user" class="form-control" name="user"
                       v-model="form.user" placeholder="User">
                <br>
                <input class="input-group-text" type="password" id="password" name="password" v-model="form.password"
                       placeholder="Password">
                <br>
                <button class="btn btn-primary">Log in</button>
                <br>
                <br>
            </div>
        </form>
    </div>
</div>
<script>
    let app = new Vue("""),format.raw/*34.23*/("""{"""),format.raw/*34.24*/("""
        """),format.raw/*35.9*/("""el: '#app',
        data: """),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""
            """),format.raw/*37.13*/("""form: """),format.raw/*37.19*/("""{"""),format.raw/*37.20*/("""
                """),format.raw/*38.17*/("""user: '',
                password: '',
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""",
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""",
        methods: """),format.raw/*42.18*/("""{"""),format.raw/*42.19*/("""
            """),format.raw/*43.13*/("""goToUserCreate() """),format.raw/*43.30*/("""{"""),format.raw/*43.31*/("""
                """),format.raw/*44.17*/("""this.$router.push('/user-create');
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/(""",
            onSubmit() """),format.raw/*46.24*/("""{"""),format.raw/*46.25*/("""
                """),format.raw/*47.17*/("""axios.get('/login-check', this.form).then(response => """),format.raw/*47.71*/("""{"""),format.raw/*47.72*/("""
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
<style>
    div """),format.raw/*63.9*/("""{"""),format.raw/*63.10*/("""
        """),format.raw/*64.9*/("""font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""

    """),format.raw/*67.5*/("""#main-container """),format.raw/*67.21*/("""{"""),format.raw/*67.22*/("""
        """),format.raw/*68.9*/("""align-content: center;
        margin: 18% 25% 20% 45%;
        opacity: 75%;
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""

    """),format.raw/*73.5*/("""body """),format.raw/*73.10*/("""{"""),format.raw/*73.11*/("""
        """),format.raw/*74.9*/("""background: burlywood;
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""
    """),format.raw/*76.5*/("""button """),format.raw/*76.12*/("""{"""),format.raw/*76.13*/("""
        """),format.raw/*77.9*/("""border-radius: 25px;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""
"""),format.raw/*79.1*/("""</style>
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
                  SOURCE: app/views/login.scala.html
                  HASH: ff0de0ce4ed33cf4c0857114e60d47f62195be4a
                  MATRIX: 811->0|2190->1353|2219->1354|2255->1363|2309->1389|2338->1390|2379->1403|2413->1409|2442->1410|2487->1427|2567->1479|2596->1480|2633->1490|2662->1491|2709->1510|2738->1511|2779->1524|2824->1541|2853->1542|2898->1559|2973->1606|3002->1607|3055->1632|3084->1633|3129->1650|3211->1704|3240->1705|3289->1726|3355->1764|3384->1765|3460->1813|3489->1814|3542->1839|3613->1882|3642->1883|3716->1929|3745->1930|3798->1955|3866->1995|3895->1996|3938->2011|3967->2012|4005->2023|4034->2024|4067->2030|4095->2031|4150->2059|4179->2060|4215->2069|4442->2269|4470->2270|4503->2276|4547->2292|4576->2293|4612->2302|4721->2384|4749->2385|4782->2391|4815->2396|4844->2397|4880->2406|4934->2433|4962->2434|4994->2439|5029->2446|5058->2447|5094->2456|5146->2481|5174->2482|5202->2483
                  LINES: 26->1|59->34|59->34|60->35|61->36|61->36|62->37|62->37|62->37|63->38|65->40|65->40|66->41|66->41|67->42|67->42|68->43|68->43|68->43|69->44|70->45|70->45|71->46|71->46|72->47|72->47|72->47|73->48|74->49|74->49|75->50|75->50|76->51|77->52|77->52|78->53|78->53|79->54|80->55|80->55|81->56|81->56|84->59|84->59|85->60|85->60|88->63|88->63|89->64|90->65|90->65|92->67|92->67|92->67|93->68|96->71|96->71|98->73|98->73|98->73|99->74|100->75|100->75|101->76|101->76|101->76|102->77|103->78|103->78|104->79
                  -- GENERATED --
              */
          