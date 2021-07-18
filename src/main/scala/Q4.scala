object Q4 {
  def main(args: Array[String]): Unit = {

    def EvernOdd (n:Int): Unit = {
      if(n==0) println("even")
      else if(n==1) println("odd")
      else EvernOdd (n-2)
    }
    EvernOdd (21)
    EvernOdd (90)
  }
}
