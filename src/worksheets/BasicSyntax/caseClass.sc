import java.time.LocalDateTime

// case class val is implied
case class Cashflow(amount: Double, currency: String, due: LocalDateTime)

// hello world

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, World")
  }
}

