package scala_tutorial5

object Q5 {
  def main(args: Array[String]): Unit = {
    println(sum_of_even(5));
  }

  def sum_of_even(n:Int):Int = {
    if(n==0){return 0}
    else if(n%2==1){return sum_of_even(n-1);}
    else {return n + sum_of_even(n-1);}
  }

}
