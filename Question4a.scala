object Question4a {  
        def main(args: Array[String]):Unit = {  

            def basic(normalHours:Int):Int = normalHours*250

            def ot(otHours:Int):Int = otHours*85

            def totalIncome(normalHours:Int,otHours:Int):Int = basic(normalHours) + ot(otHours)

            def tax(totalIncome:Int):Double = totalIncome*0.12

            def takeHomeSalary(normalHours:Int,otHours:Int):Double = totalIncome(normalHours,otHours) - tax(totalIncome(normalHours,otHours))

            print("Enter Normal Working Hours:")
            var normalHours = scala.io.StdIn.readInt()
            print("Enter OT Hours:")
            var otHours = scala.io.StdIn.readInt()

            println("Take Home Salary: "+takeHomeSalary(normalHours,otHours))

    }
          
}
