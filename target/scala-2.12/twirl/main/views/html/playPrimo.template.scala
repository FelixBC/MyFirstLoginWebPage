
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

object playPrimo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(total: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*5.1*/("""<html>
<head>
</head>
<body>
<p>It is : """),_display_(/*9.13*/total),format.raw/*9.18*/("""</p>
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
                  SOURCE: app/views/playPrimo.scala.html
                  HASH: 6d4ef49fc6260f676bb7413d02561436eece9134
                  MATRIX: 730->1|836->14|865->17|932->58|957->63
                  LINES: 21->1|26->2|29->5|33->9|33->9
                  -- GENERATED --
              */
          