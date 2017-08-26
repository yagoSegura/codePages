import scala.io.StdIn

object SumMult35 extends App{

    def sumValues(topValue:Int):Long = {
    	
    	def performSum(mult:Int):Long = {
    		val size = ((topValue - 1) / mult).toLong
    		return mult * size * (size + 1) / 2 
    	}

    	performSum(3) + performSum(5) - performSum(3*5)


    }

    for(iter <- 1 to StdIn.readInt()){
        println(sumValues(StdIn.readInt()));
    }
    
}