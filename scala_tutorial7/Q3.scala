package scala_tutorial7

class Account(ac: Int, bal: Int){
    var acNo: Int = ac
    var balance: Int = bal

    def transferTo(ac: Account, bal: Int) = {
      this.balance = this.balance - bal
      ac.deposit(bal)
    }

    def deposit(bal: Int) = {
      this.balance = this.balance + bal
    }

    override def toString(): String = acNo + "\t" + balance
  }

  def main(args: Array[String]) = {
    var A = new Account(98765, 20000)
    var B = new Account(45612, 25000)

    A.transferTo(B, 5000)
    println(A)
    println(B)
  }
}
