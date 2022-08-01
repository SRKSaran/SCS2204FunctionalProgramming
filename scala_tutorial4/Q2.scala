package Tutorial_04
import scala.io.StdIn.readInt;

object Q2{
    def CheckPositiveNegative(num:Int) : Unit = num match {
      case x if x <= 0 && x % 2 == 0 => println("Number is Negative/Zero + Even")
      case x if x <= 0 && x % 2 != 0 => println("Number is Negative/Zero + Odd")
      case x if x > 0 && x % 2 == 0  => println("Number is Positive + Even")
      case x if x > 0 && x % 2 != 0  => println("Number is Positive + Odd")
    }
    def main(args: Array[String]): Unit = {

      printf("Enter a number to check: ");
      var num = readInt();

      CheckPositiveNegative(num);
    }
  }
