
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

object renewedIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTATYPE html>
<html>
<head>
    <title>
        Index Renewed
    </title>


        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
<div class = "sidebar">
    <div class="logo_content">
        <div class="logo">
            <i class='bx bxl-c-plus'></i>
            <div class="logo_name">Coding lab</div>
            <i class='bx bx-menu' id="btn"></i>
            <ul class="nav_list">
                <li>
                    <a href="#">
                    <i class='bx bx-grid-alt'></i>
                        <box-icon name='collapse-horizontal' ></box-icon>
                    <span class="links_name"> DashBoard</span>
                    </a>
                        <span class="links_name"> DashBoard </span>
                </li>
            </ul>

        </div>
    </div>
</div>
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
                  SOURCE: app/views/renewedIndex.scala.html
                  HASH: 108c5bc04dd19efacc417bea42b9c700605ced2f
                  MATRIX: 818->1
                  LINES: 26->2
                  -- GENERATED --
              */
          