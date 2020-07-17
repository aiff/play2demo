// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/admin/Downloads/new2/play2demo/conf/routes
// @DATE:Fri Jul 17 15:13:56 CST 2020


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
