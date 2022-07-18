package scala_tutorial3

object Q4 {
  def main( args: Array[String]): Unit = {
    println(Wholesale_cost(60))
  }
  def Total_amount(y:Int): Double = {
    x*y
  }
  def Discount(amount: Double): Double = {
    amount*0.4
  }
  def Shipping_cost(y:Int): Double = {
    if(y>=50){
      3*50+(y-50)*0.75
    }else{
      y*3
    }
  }
  def Wholesale_cost(y :Int ): Double = {
    Total_amount(y) - Discount(Total_amount(y)) + Shipping_cost(y)
  }
}
