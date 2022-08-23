package scala_tutorial5

object Q1 {
  def main(args: Array[String]): Unit ={
    println(isPrime(10));
  }
  def isPrime(n:Int,i:Int=2): Boolean ={
    if(n<=2){return true}
    if(n%i==0) {return false}
    if(i*i > n) {return true}

    return isPrime(n,i+1);
  }
}
