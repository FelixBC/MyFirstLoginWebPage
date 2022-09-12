
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

object addNumbersForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    </head>
    <body>
        <div id="app">
            <p>Let's add some numbers!</p>
            <form>
                <label for="number1">Number 1 </label><input id="number1" name="numero1" type="number" v-model.number="form.number1"  /><br />
                <label for="number2">Number 2 </label><input id="number2" name="numero2" type="number" v-model.number="form.number2" /><br />
                <input type="button" value="Sumar" v-on:click="addNumbers">
            </form>
            <p v-if="result !== null"> La suma es: """),format.raw/*16.52*/("""{"""),format.raw/*16.53*/("""{"""),format.raw/*16.54*/("""result"""),format.raw/*16.60*/("""}"""),format.raw/*16.61*/("""}"""),format.raw/*16.62*/(""" """),format.raw/*16.63*/("""</p>

        </div>
        <script>
            let app = new Vue("""),format.raw/*20.31*/("""{"""),format.raw/*20.32*/("""
                """),format.raw/*21.17*/("""el: '#app',
                data: """),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""
                    """),format.raw/*23.21*/("""form: """),format.raw/*23.27*/("""{"""),format.raw/*23.28*/("""
                        """),format.raw/*24.25*/("""number1: null,
                        number2: null
                    """),format.raw/*26.21*/("""}"""),format.raw/*26.22*/(""",
                    result: null
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/(""",
                methods: """),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""
                    """),format.raw/*30.21*/("""addNumbers()"""),format.raw/*30.33*/("""{"""),format.raw/*30.34*/("""
                    """),format.raw/*31.21*/("""// Make a request for a user with a given ID
                    let vm = this;
                    axios.get('/add-numbers', """),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""
                                """),format.raw/*34.33*/("""params: this.form
                            """),format.raw/*35.29*/("""}"""),format.raw/*35.30*/(""")
                            .then(function (response) """),format.raw/*36.55*/("""{"""),format.raw/*36.56*/("""
                                """),format.raw/*37.33*/("""vm.result = response.data.total;
                            """),format.raw/*38.29*/("""}"""),format.raw/*38.30*/(""")
                            .catch(function (error) """),format.raw/*39.53*/("""{"""),format.raw/*39.54*/("""
                                """),format.raw/*40.33*/("""// handle error
                                console.log(error);
                            """),format.raw/*42.29*/("""}"""),format.raw/*42.30*/(""")
                            .then(function () """),format.raw/*43.47*/("""{"""),format.raw/*43.48*/("""
                                """),format.raw/*44.33*/("""// always executed
                            """),format.raw/*45.29*/("""}"""),format.raw/*45.30*/(""");
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/("""
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");
        </script>
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
                  SOURCE: app/views/addNumbersForm.scala.html
                  HASH: a3f5a568dded0893febdfd200f33b90b8dad7cc2
                  MATRIX: 731->1|827->3|857->7|1620->743|1649->744|1678->745|1712->751|1741->752|1770->753|1799->754|1899->826|1928->827|1974->845|2037->880|2066->881|2116->903|2150->909|2179->910|2233->936|2336->1011|2365->1012|2446->1065|2475->1066|2531->1094|2560->1095|2610->1117|2650->1129|2679->1130|2729->1152|2885->1280|2914->1281|2976->1315|3051->1362|3080->1363|3165->1420|3194->1421|3256->1455|3346->1517|3375->1518|3458->1573|3487->1574|3549->1608|3675->1706|3704->1707|3781->1756|3810->1757|3872->1791|3948->1839|3977->1840|4029->1864|4058->1865|4104->1883|4133->1884|4175->1898|4204->1899
                  LINES: 21->1|26->1|28->3|41->16|41->16|41->16|41->16|41->16|41->16|41->16|45->20|45->20|46->21|47->22|47->22|48->23|48->23|48->23|49->24|51->26|51->26|53->28|53->28|54->29|54->29|55->30|55->30|55->30|56->31|58->33|58->33|59->34|60->35|60->35|61->36|61->36|62->37|63->38|63->38|64->39|64->39|65->40|67->42|67->42|68->43|68->43|69->44|70->45|70->45|71->46|71->46|72->47|72->47|73->48|73->48
                  -- GENERATED --
              */
          