
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class GoogleLoadTEST extends Simulation {

	val httpConf = http
    .baseURL("http://www.bbc.co.uk")

  val scn = scenario("GoogleLoadTEST")
    .exec(http("Home_page_test")
    .get("/"))
    .pause(2)

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf).assertions(global.responseTime.max.lessThan(1000))

}
