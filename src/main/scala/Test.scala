object Test {
  def main(args: Array[String]): Unit = {
    System.loadLibrary("plus")
   val plus = new PlusJNI()
   println( plus.plus(1, 1))
  }
}
