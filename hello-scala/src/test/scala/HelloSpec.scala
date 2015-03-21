import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "know who to greet" in {
    Hello.who should be === "Activator"
  }
}
