
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/"></a>
            </div>
        </div>
    </div>
    <div id="content" class="container">
		
    </div>
    <script type="text/template" id="message_content">
        <div class="well">
            <h1><%- value %></h1>
        </div>

        <button id="getMessageButton">Get JSON Message</button>
    </script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*24.42*/routes/*24.48*/.Assets.at("bower_components/jquery/jquery.js"))),format.raw/*24.95*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*25.42*/routes/*25.48*/.Assets.at("bower_components/underscore/underscore.js"))),format.raw/*25.103*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*26.42*/routes/*26.48*/.Assets.at("bower_components/backbone/backbone.js"))),format.raw/*26.99*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*27.42*/routes/*27.48*/.Assets.at("javascript/index.js"))),format.raw/*27.81*/(""""></script>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 03 21:04:18 CST 2015
                    SOURCE: /Users/dandam/tutProjects/hello-play-backbone/app/views/index.scala.html
                    HASH: 4dc5352a277ab881f7bd2f6c538e8bb31f505805
                    MATRIX: 637->0|1270->597|1285->603|1354->650|1443->703|1458->709|1536->764|1625->817|1640->823|1713->874|1802->927|1817->933|1872->966
                    LINES: 22->1|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27
                    -- GENERATED --
                */
            