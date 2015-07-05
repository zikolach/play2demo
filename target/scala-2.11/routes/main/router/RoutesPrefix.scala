
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/zikolach/catalysts/src/sug/play2demo/conf/routes
// @DATE:Sun Jul 05 15:07:46 CEST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
