object Q6 {
  def main(args: Array[String]): Unit = {
    def fibonacci(n:Int): Int= n match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    def printFibonacci(a:Int): Unit = {
      if(a>0) printFibonacci(a-1)
      println(fibonacci(a))
    }
    printFibonacci(10)
  }
}
