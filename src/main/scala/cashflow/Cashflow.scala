import java.time.LocalDateTime

case class Cashflow(amount: Double, currency: String, due: LocalDateTime)

val cf = Cashflow(100.0, "USD", LocalDateTime.now())

