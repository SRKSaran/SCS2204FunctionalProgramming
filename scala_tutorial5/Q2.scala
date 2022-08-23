package scala_tutorial5

object Q2 {
  def main(args: Array[String]): Unit = {
    var i = 0;
    for (i<-2 until 11) {
      if (isPrime(i)) {
        println(i);
      }
    }
  };

  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {return true}
    if (n % i == 0) {return false}
    if (i * i > n) {return true}

    return isPrime(n, i + 1);
  }
}
