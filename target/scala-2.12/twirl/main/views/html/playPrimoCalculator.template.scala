
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

object playPrimoCalculator extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(result: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
<head>
</head>
<body>
<p>It is: """),_display_(/*6.12*/result),format.raw/*6.18*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(result:Int): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/playPrimoCalculator.scala.html
                  HASH: f8ad72b498ccbd05426594254947f94f1057e3f4
                  MATRIX: 740->1|847->15|913->55|939->61
                  LINES: 21->1|26->2|30->6|30->6
                  -- GENERATED --
              */
          