object calculateSalary{
    def normalHours(h:Int):Double=h*250
    def OTHours(h:Int):Double=h*85
    def total(h1:Int, h2:Int):Double=normalHours(h1)+OTHours(h2)
    def tax(pay:Double):Double=pay*0.12

    def takeHomeSalary(normalHrs:Int, OTHrs:Int):Double={
        total(normalHrs, OTHrs)-tax(total(normalHrs, OTHrs))
    }

    def main(args:Array[String]):Unit={
        printf("%s %.2f", "Take home salary is RS", takeHomeSalary(40, 30))
    }
}