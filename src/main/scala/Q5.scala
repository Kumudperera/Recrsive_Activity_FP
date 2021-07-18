object Q5 {
  def main(args: Array[String]): Unit = {
    def addEven(n:Int, i:Int, sum:Int): Int = {
      if(i >= n){
        return sum;
      }
      return addEven(n, i+2, sum+i);
    }
    println(addEven(10,0,0));
  }
}
