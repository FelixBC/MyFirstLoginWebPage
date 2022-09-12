
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

object addNumbers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(total: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
    </head>
    <body>
        <p>The sum is : """),_display_(/*7.26*/total),format.raw/*7.31*/("""</p>
    </body>
</html>"""))
      }
    }
  }

  def render(total:Int): play.twirl.api.HtmlFormat.Appendable = apply(total)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (total) => apply(total)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/addNumbers.scala.html
                  HASH: 3af87f3b9d2f9492b3b80e55e532ffe7e29cbbc7
                  MATRIX: 731->1|838->13|868->17|964->87|989->92
                  LINES: 21->1|26->1|28->3|32->7|32->7
                  -- GENERATED --
              */
          