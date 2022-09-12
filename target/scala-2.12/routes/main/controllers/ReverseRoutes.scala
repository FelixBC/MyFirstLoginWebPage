// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add-user")
    }
  
    // @LINE:10
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:12
    def addNumbers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add-numbers")
    }
  
    // @LINE:15
    def playPrimo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play-primo")
    }
  
    // @LINE:13
    def sandbox(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sandbox")
    }
  
    // @LINE:22
    def createUserView(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user-view")
    }
  
    // @LINE:19
    def addStudents(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add-student")
    }
  
    // @LINE:21
    def loginView(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login-view")
    }
  
    // @LINE:24
    def dashboardView(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:16
    def calculateOperations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play-primo-calculate")
    }
  
    // @LINE:23
    def getUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login-check")
    }
  
    // @LINE:9
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:17
    def calculatorDelete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calculator-delete")
    }
  
    // @LINE:11
    def addNumbersForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add-numbers-form")
    }
  
    // @LINE:14
    def playPrimoForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play-primoForm")
    }
  
    // @LINE:7
    def index(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:18
    def studentView(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "student")
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
