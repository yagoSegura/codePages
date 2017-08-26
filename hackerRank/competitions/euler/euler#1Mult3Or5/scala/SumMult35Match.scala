import scala.io.StdIn

object SumMult35Match extends App{

    def sumValues(topValue:Int):Int = {
    	
    	def performSum(actualValue:Int,acc:Int):Int = {
    		actualValue match{
    			case `topValue` => acc
    			case _ =>{ 
    				if(actualValue % 3 == 0 || actualValue % 5 == 0){
    					performSum(actualValue + 1, acc + actualValue)
    				}else{
						performSum(actualValue + 1, acc)
					}	
    			}
    		}
    	}
    	performSum(1,0)
    }

    for(iter <- 1 to StdIn.readInt()){
        println(sumValues(StdIn.readInt()));
    }
    
}