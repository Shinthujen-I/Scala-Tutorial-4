//Question 2
import scala.io.StdIn.readInt;

object  Question {
    def PositiveNegative(num:Int) : Unit = num match {
        case x if x <= 0 && x % 2 == 0 => println("Negative/Zero + Even")
        case x if x <= 0 && x % 2 != 0 => println("Negative/Zero + Odd")
        case x if x > 0 && x % 2 == 0  => println("Positive + Even")
        case x if x > 0 && x % 2 != 0  => println("Positive + Odd")
    }
    def main(args: Array[String]): Unit = {

        printf("Enter a number to check: ");
        var num = readInt();
        
        PositiveNegative(num);
    }
}