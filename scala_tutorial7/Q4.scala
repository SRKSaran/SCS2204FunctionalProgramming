package scala_tutorial7

object Q4 {
  class Account(ac: Int, bal: Double){
    var acNo: Int = ac
    var balance: Double = bal

    def checkNeg() = {
      if(balance < 0) println(acNo + "\t" + balance)
    }

    def setBalance(x: Double) = balance = x

    override def toString(): String = acNo + "\t" + balance
  }

  def main(args: Array[String]) = {
    var A = new Account(5623, -15000)
    var B = new Account(7895, 25000)
    var C = new Account(4527, -30000)
    var D = new Account(1578, 10000)

    var acList: Array[Account] = Array(A, B, C, D)
    var acBalList: Array[Double] = Array(A.balance, B.balance, C.balance, D.balance)

    var overdraft: Array[Account] = acList.filter(i => i.balance < 0)
    println("The accounts with negative balance:")
    overdraft.foreach(i => println(i))

    var acSum: Double = acBalList.reduce((x, y) => x + y)
    println("\nTotal Sum of Accounts = " + acSum)

    println("\nThe final balances of all accounts after apply the interest function:")
    acList.map(i => if(i.balance > 0) i.setBalance(i.balance * 1.05) else i.setBalance(i.balance * 1.1))
    acList.foreach(i => println(i))
  }
}
