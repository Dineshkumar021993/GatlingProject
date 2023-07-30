package api


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class apiperformancetest extends Simulation{
  //  protocol
  val httpProtocol = http.baseUrl("https://reqres.in")

  //scenario
  val scn = scenario("gecall").exec(
    http("getsingleuser")
      .get("/api/users/2")
      .check(
        status.is(200),
        jsonPath("$.data.first_name").is("Janet"),
        jsonPath("$.data.email").is("janet.weaver@reqres.in")
      )
  ).pause(10)

  val scn1 = scenario("post method").exec(
    http("post user details")
      .post("/api/users")
      .header("content-type", "application/json")
      .body(StringBody(
        """
          |{
          |    "name": "morpheus",
          |    "job": "leader"
          |}
          """.stripMargin
      ))
      .check(
        status.is(201),
        jsonPath("$.name").is("morpheus"),
        jsonPath("$.job").is("leader")
      )
  )
  val scn2 = scenario("update method").exec(
    http("update details")
      .post("/api/users/2")
      .header("content-type", "application/json")
      .body(StringBody(
        """
          |{
          |    "name": "dinesh",
          |    "job": "employee"
          |}
          """.stripMargin
      ))
      .check(
        status.is(201),
        jsonPath("$.name").is("dinesh"),
        jsonPath("$.job").is("employee")
      )
  )
  val scn3 = scenario("register a new user").exec(
    http("register a new user")
      .post("/api/register")
      .header("content-type", "application/json")
      .body(StringBody(
        """
          |{
          |    "email": "eve.holt@reqres.in",
          |    "password": "pistol"
          |}
          """.stripMargin
      ))
      .check(
        status.is(200),
        //        jsonPath("$.email").is("dineshkumar.pentakota@gmail.com"),
        jsonPath("$.id").is("4"),
        jsonPath("$.token").is("QpwL5tke4Pnpja7X4")

      )
  )


  //setup
  setUp(
    scn.inject(rampUsers(3).during(10)).protocols(httpProtocol),
    scn1.inject(rampUsers(2).during(10)).protocols(httpProtocol),
    scn2.inject(rampUsers(2).during(10)).protocols(httpProtocol),
    scn3.inject(rampUsers(2).during(10)).protocols(httpProtocol)
  )


}
