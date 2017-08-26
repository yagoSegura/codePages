import scala.io.StdIn

object SumMult35NoEfficient extends App{

    def sumValues(topValue:Int):Int = (1 until topValue).view.
    									filter(number => (number%3==0 || number%5==0)).
    									sum

    for(iter <- 1 to StdIn.readInt()){
        println(sumValues(StdIn.readInt()));
    }
    
}
