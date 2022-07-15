
object MainObject {  
        def main(args: Array[String]):Unit = {  

        def audiance(price:Int):Int = 120 + (15 - price)/5*20

        def income(price:Int):Int = audiance(price)*price

        def cost(price:Int):Int = 500 + audiance(price)*3

        def profit(price:Int):Int = income(price) - cost(price)
    
    }  
}  