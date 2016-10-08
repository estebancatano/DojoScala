
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/aux10/Documentos/DojoScala/scala/conf/routes
// @DATE:Sat Oct 08 11:51:05 COT 2016


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
