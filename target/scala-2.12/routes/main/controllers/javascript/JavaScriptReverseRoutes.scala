// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-user"})
        }
      """
    )
  
    // @LINE:10
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:12
    def addNumbers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addNumbers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-numbers"})
        }
      """
    )
  
    // @LINE:15
    def playPrimo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.playPrimo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-primo"})
        }
      """
    )
  
    // @LINE:13
    def sandbox: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sandbox",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sandbox"})
        }
      """
    )
  
    // @LINE:22
    def createUserView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createUserView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user-view"})
        }
      """
    )
  
    // @LINE:19
    def addStudents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addStudents",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-student"})
        }
      """
    )
  
    // @LINE:21
    def loginView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login-view"})
        }
      """
    )
  
    // @LINE:24
    def dashboardView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.dashboardView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:16
    def calculateOperations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.calculateOperations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-primo-calculate"})
        }
      """
    )
  
    // @LINE:23
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login-check"})
        }
      """
    )
  
    // @LINE:9
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:17
    def calculatorDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.calculatorDelete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calculator-delete"})
        }
      """
    )
  
    // @LINE:11
    def addNumbersForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addNumbersForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-numbers-form"})
        }
      """
    )
  
    // @LINE:14
    def playPrimoForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.playPrimoForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-primoForm"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:18
    def studentView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.studentView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
