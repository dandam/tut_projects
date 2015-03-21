// @SOURCE:/Users/dandam/tutProjects/hello-play-backbone/conf/routes
// @HASH:46c1fea2d8e9030cbff804e1c469b5bc666d8036
// @DATE:Tue Mar 03 21:04:18 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers {

// @LINE:6
class ReverseMessageController {
    

// @LINE:6
def getMessage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "message")
}
                                                
    
}
                          

// @LINE:10
class ReverseWebJarAssets {
    

// @LINE:10
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:5
class ReverseMainController {
    

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:6
class ReverseMessageController {
    

// @LINE:6
def getMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.getMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseWebJarAssets {
    

// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:5
class ReverseMainController {
    

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:6
class ReverseMessageController {
    

// @LINE:6
def getMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.getMessage(), HandlerDef(this, "controllers.MessageController", "getMessage", Seq(), "GET", """""", _prefix + """message""")
)
                      
    
}
                          

// @LINE:10
class ReverseWebJarAssets {
    

// @LINE:10
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:5
class ReverseMainController {
    

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.index(), HandlerDef(this, "controllers.MainController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        
    