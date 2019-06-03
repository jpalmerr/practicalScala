import java.time.LocalDateTime

// OO concepts

class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime) {
  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due) // setting defaults

  def this(amount: Double) = this(amount, "GDP", LocalDateTime.now())

  // adding other members

  val settle = due.toLocalDate().plusDays(2) // date at start of "today"
  private lazy val processedAt = LocalDateTime.now() // lazy => only computed when accessed

  def rollForward() =  {
    val retval = new Cashflow(amount, currency, due.plusDays(1))
    // cant change state => return new copy with changes already made
    retval.processedAt // "touch the value"
    retval
  }

}

// companion object
object Cashflow {
  def main(args:Array[String]) = {
    val c1 = new Cashflow(100)
    println(c1.settle)
  }
}