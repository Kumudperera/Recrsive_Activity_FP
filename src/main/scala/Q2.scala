object Q2 {
  def main(args: Array[String]): Unit = {
    def gcd(x:Int, y:Int):Int=y match {
      case 0 => x
      case y if (y>x)=>gcd(y,x)
      case _ =>gcd(y,x%y)
    }

    def prime(p:Int, n:Int=2):Boolean=n match {
      case x if(p==x)=>true
      case x if (gcd(p,x)>1)=>false
      case x=>prime(p,x+1)
    }

    def primeseq (n:Int): Unit = {
      if (prime(n)) println(n)
      if(n>0) primeseq(n-1)
    }
    primeseq(20)
  }
}
