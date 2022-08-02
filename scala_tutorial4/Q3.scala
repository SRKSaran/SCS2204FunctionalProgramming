package Tutorial_04

object Q3 {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(indexlist: Int*)(func: String => String): String = {
    if(indexlist.isEmpty)
    {
      return func(name)
    }

    var tmp = ""
    var i = 0
    while(i < name.length())
    {
      if(indexlist.contains(i))
      {
        tmp = tmp + func(name.charAt(i).toString)
      }
      else
      {
        tmp = tmp + name.charAt(i).toString
      }
      i = i + 1
    }
    tmp
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Kumara")(5)(toUpper))
  }
}
