//Question 1
object  Question {
    def interest(deposit:Int) : Double = deposit match {
        case amount if amount<=20000 => amount*0.02
        case amount if amount<=200000 => amount*0.04
        case amount if amount<=2000000 => amount*0.035
        case amount if amount>2000000 => amount*0.065
    }
    def main(args: Array[String]): Unit = {
        println(interest(10000));
    }
}