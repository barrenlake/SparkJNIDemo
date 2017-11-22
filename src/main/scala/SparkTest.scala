import org.apache.spark.{SparkConf, SparkContext}

class SparkTest {

}

object SparkTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("chen-test")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(Seq(1,2,3,4,5,6), 2).mapPartitions(p => {
      System.loadLibrary("plus")
      val plusJNI = new PlusJNI
      p.map(plusJNI.plus(_, 10))
    })
    rdd.collect().foreach(println(_))
  }
}
