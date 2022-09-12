
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

object person extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*5.1*/("""<html>
<head>
</head>
<body>
<p>It is : """),_display_(/*9.13*/response),format.raw/*9.21*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(response:String): play.twirl.api.HtmlFormat.Appendable = apply(response)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (response) => apply(response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/person.scala.html
                  HASH: 2b813cc9be094c218babaa8732f7f3bc4c8f97be
                  MATRIX: 730->1|842->20|871->23|938->64|966->72
                  LINES: 21->1|26->2|29->5|33->9|33->9
                  -- GENERATED --
              */
          