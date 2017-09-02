import scala.io.StdIn

object Solution extends App{

    def sumFiboEven(topValue:Int):BigInt = {
    	var f1:BigInt = 2
        var f2:BigInt = 0
        var f:BigInt = 0
        var sum:BigInt = 0

        while(f1 < topValue){
            sum += f1
            f = (4 * f1) + f2
            f2 = f1
            f1 = f
        }

        return sum
    }

    for(iter <- 1 to StdIn.readInt()){
        println(sumFiboEven(StdIn.readInt()));
    }
    
}