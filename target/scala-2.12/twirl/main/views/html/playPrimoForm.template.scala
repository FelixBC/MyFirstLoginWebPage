
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

object playPrimoForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<div id="app">
    <p> -Just playing around- </p>
    <form v-on:submit.prevent>
        <label for="number1">Number 1 </label>
        <input id="number1" name="number1" type="number" v-model.number="form.number1"
               v-on:keyup.prevent.enter="checkNumber"/>
        <br/>
        <input type="button" value="Hide" v-on:click="hideResponse">
        <br/>
        <input type="button" value="Check" v-on:click="checkNumber">
        <br/>
        <p v-if="result !== null"> The number is: """),format.raw/*22.51*/("""{"""),format.raw/*22.52*/("""{"""),format.raw/*22.53*/("""result"""),format.raw/*22.59*/("""}"""),format.raw/*22.60*/("""}"""),format.raw/*22.61*/(""" """),format.raw/*22.62*/("""</p>
        <div v-if="result == 'odd'">
            <p> - Calculator - </p>
            <label>Number 2: </label>
            <label> """),format.raw/*26.21*/("""{"""),format.raw/*26.22*/("""{"""),format.raw/*26.23*/("""form.number2"""),format.raw/*26.35*/("""}"""),format.raw/*26.36*/("""}"""),format.raw/*26.37*/(""" """),format.raw/*26.38*/("""</label>
            <label v-if="result2 !== ''"> """),format.raw/*27.43*/("""{"""),format.raw/*27.44*/("""{"""),format.raw/*27.45*/("""result2"""),format.raw/*27.52*/("""}"""),format.raw/*27.53*/("""}"""),format.raw/*27.54*/("""</label>
            <br/>
            <br/>
            <br/>
            <input type="button" value="+" v-on:click="signManager">
            <input type="button" value="-" v-on:click="signManager">
            <input type="button" value="/" v-on:click="signManager">
            <input type="button" value="*" v-on:click="signManager">
            <br/>
            <input type="button" value="9" v-on:click="writeNumber">
            <input type="button" value="8" v-on:click="writeNumber">
            <input type="button" value="7" v-on:click="writeNumber">
            <input type="button" value="Delete" v-on:click="doDelete">
            <br/>
            <input type="button" value="4" v-on:click="writeNumber">
            <input type="button" value="5" v-on:click="writeNumber">
            <input type="button" value="6" v-on:click="writeNumber">
            <input type="button" value="Clear" v-on:click="doClear">
            <br/>
            <input type="button" value="1" v-on:click="writeNumber">
            <input type="button" value="2" v-on:click="writeNumber">
            <input type="button" value="3" v-on:click="writeNumber">
            <input type="button" value="%" v-on:click="signManager">
            <br/>
            <input type="button" value="0" v-on:click="writeNumber">
            <input type="button" value="." v-on:click="writeNumber">
            <input type="button" value="    Enter   " v-on:click="calculateNumber">
            <br/>
        </div>
    </form>
</div>
<script>
    let app = new Vue("""),format.raw/*59.23*/("""{"""),format.raw/*59.24*/("""
        """),format.raw/*60.9*/("""el: '#app',
        methods: """),format.raw/*61.18*/("""{"""),format.raw/*61.19*/("""
            """),format.raw/*62.13*/("""signManager(event) """),format.raw/*62.32*/("""{"""),format.raw/*62.33*/("""
                """),format.raw/*63.17*/("""const sign = event.target.value;
                this.result2 += sign;
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/(""",
            doClear() """),format.raw/*66.23*/("""{"""),format.raw/*66.24*/("""
                """),format.raw/*67.17*/("""this.result2 = ""
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/(""",
            writeNumber(event) """),format.raw/*69.32*/("""{"""),format.raw/*69.33*/("""

                """),format.raw/*71.17*/("""const value = event.target.value;
                this.result2 += value;

            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/(""",
            onEnter() """),format.raw/*75.23*/("""{"""),format.raw/*75.24*/("""
                """),format.raw/*76.17*/("""console.log("enterPressed")
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/(""",
            doDelete() """),format.raw/*78.24*/("""{"""),format.raw/*78.25*/("""
                """),format.raw/*79.17*/("""axios.get('/calculator-delete', """),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""
                    """),format.raw/*80.21*/("""params: this.form
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/(""")
                    .then((response) => """),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""
                        """),format.raw/*83.25*/("""this.result2 = response.data.result;
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/(""")
                    .catch((error) => """),format.raw/*85.39*/("""{"""),format.raw/*85.40*/("""
                        """),format.raw/*86.25*/("""console.error(error)
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/(""")
                    .then(() => """),format.raw/*88.33*/("""{"""),format.raw/*88.34*/("""
                        """),format.raw/*89.25*/("""//always executed
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/(""");
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""",
            checkNumber() """),format.raw/*92.27*/("""{"""),format.raw/*92.28*/("""
                """),format.raw/*93.17*/("""// Make a request for a user with a given ID
                axios.get('/play-primo', """),format.raw/*94.42*/("""{"""),format.raw/*94.43*/("""
                    """),format.raw/*95.21*/("""params: this.form
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""")
                    .then((response) => """),format.raw/*97.41*/("""{"""),format.raw/*97.42*/("""
                        """),format.raw/*98.25*/("""this.result = response.data.result;
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/(""")
                    .catch((error) => """),format.raw/*100.39*/("""{"""),format.raw/*100.40*/("""
                        """),format.raw/*101.25*/("""// handle error
                        console.error(error);
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/(""")
                    .then(() => """),format.raw/*104.33*/("""{"""),format.raw/*104.34*/("""
                        """),format.raw/*105.25*/("""// always executed
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/(""");
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/(""",
            calculateNumber() """),format.raw/*108.31*/("""{"""),format.raw/*108.32*/("""
                """),format.raw/*109.17*/("""axios.get('/play-primo-calculate', """),format.raw/*109.52*/("""{"""),format.raw/*109.53*/("""
                    """),format.raw/*110.21*/("""params: this.form
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/(""")
                    .then((response) => """),format.raw/*112.41*/("""{"""),format.raw/*112.42*/("""
                        """),format.raw/*113.25*/("""this.result2 = response.data.result;
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/(""")
                    .catch((error) => """),format.raw/*115.39*/("""{"""),format.raw/*115.40*/("""
                        """),format.raw/*116.25*/("""console.error(error)
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/(""")
                    .then(() => """),format.raw/*118.33*/("""{"""),format.raw/*118.34*/("""
                        """),format.raw/*119.25*/("""//always executed
                    """),format.raw/*120.21*/("""}"""),format.raw/*120.22*/(""");
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/(""",

            hideResponse() """),format.raw/*123.28*/("""{"""),format.raw/*123.29*/("""
                """),format.raw/*124.17*/("""this.result = null
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/(""",
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/(""",
        data: """),format.raw/*127.15*/("""{"""),format.raw/*127.16*/("""
            """),format.raw/*128.13*/("""form: """),format.raw/*128.19*/("""{"""),format.raw/*128.20*/("""
                """),format.raw/*129.17*/("""number1: null,
                number2: '',
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/(""",
            result: null,
            result2: '',
            sign: "+",
            one: "1",
            Two: "2",
            three: "3",
            four: "4",
            five: "5",
            six: "6",
            seven: "7",
            eight: "8",
            nine: "9",
            dot: "."


        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/("""

    """),format.raw/*149.5*/("""}"""),format.raw/*149.6*/(""");

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
                  SOURCE: app/views/playPrimoForm.scala.html
                  HASH: 13a001c818d45143169a6b83005aa79a7d1a7818
                  MATRIX: 730->1|826->4|853->5|1629->754|1658->755|1687->756|1721->762|1750->763|1779->764|1808->765|1972->901|2001->902|2030->903|2070->915|2099->916|2128->917|2157->918|2236->969|2265->970|2294->971|2329->978|2358->979|2387->980|3961->2526|3990->2527|4026->2536|4083->2565|4112->2566|4153->2579|4200->2598|4229->2599|4274->2616|4385->2699|4414->2700|4466->2724|4495->2725|4540->2742|4598->2772|4627->2773|4688->2806|4717->2807|4763->2825|4877->2911|4906->2912|4958->2936|4987->2937|5032->2954|5100->2994|5129->2995|5182->3020|5211->3021|5256->3038|5316->3070|5345->3071|5394->3092|5456->3126|5485->3127|5555->3169|5584->3170|5637->3195|5722->3252|5751->3253|5819->3293|5848->3294|5901->3319|5970->3360|5999->3361|6061->3395|6090->3396|6143->3421|6209->3459|6238->3460|6281->3475|6310->3476|6366->3504|6395->3505|6440->3522|6554->3608|6583->3609|6632->3630|6694->3664|6723->3665|6793->3707|6822->3708|6875->3733|6959->3789|6988->3790|7057->3830|7087->3831|7141->3856|7252->3938|7282->3939|7345->3973|7375->3974|7429->3999|7497->4038|7527->4039|7571->4054|7601->4055|7662->4087|7692->4088|7738->4105|7802->4140|7832->4141|7882->4162|7945->4196|7975->4197|8046->4239|8076->4240|8130->4265|8216->4322|8246->4323|8315->4363|8345->4364|8399->4389|8469->4430|8499->4431|8562->4465|8592->4466|8646->4491|8713->4529|8743->4530|8787->4545|8817->4546|8876->4576|8906->4577|8952->4594|9012->4625|9042->4626|9080->4636|9110->4637|9155->4653|9185->4654|9227->4667|9262->4673|9292->4674|9338->4691|9423->4747|9453->4748|9795->5062|9825->5063|9859->5069|9888->5070
                  LINES: 21->1|26->2|27->3|46->22|46->22|46->22|46->22|46->22|46->22|46->22|50->26|50->26|50->26|50->26|50->26|50->26|50->26|51->27|51->27|51->27|51->27|51->27|51->27|83->59|83->59|84->60|85->61|85->61|86->62|86->62|86->62|87->63|89->65|89->65|90->66|90->66|91->67|92->68|92->68|93->69|93->69|95->71|98->74|98->74|99->75|99->75|100->76|101->77|101->77|102->78|102->78|103->79|103->79|103->79|104->80|105->81|105->81|106->82|106->82|107->83|108->84|108->84|109->85|109->85|110->86|111->87|111->87|112->88|112->88|113->89|114->90|114->90|115->91|115->91|116->92|116->92|117->93|118->94|118->94|119->95|120->96|120->96|121->97|121->97|122->98|123->99|123->99|124->100|124->100|125->101|127->103|127->103|128->104|128->104|129->105|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109|133->109|134->110|135->111|135->111|136->112|136->112|137->113|138->114|138->114|139->115|139->115|140->116|141->117|141->117|142->118|142->118|143->119|144->120|144->120|145->121|145->121|147->123|147->123|148->124|149->125|149->125|150->126|150->126|151->127|151->127|152->128|152->128|152->128|153->129|155->131|155->131|171->147|171->147|173->149|173->149
                  -- GENERATED --
              */
          