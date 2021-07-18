object Q3 {
  def main(args: Array[String]): Unit = {
    def sum(n:Int):Int=
      if(n==0)  0
      else n+sum(n-1)
    println(sum(5))
  }
}
