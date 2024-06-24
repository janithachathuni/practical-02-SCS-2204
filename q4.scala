object theatre{
    def attendance(price:Int):Int={
        120 + (15-price)/5*20
    }

    def revenue(price:Int):Int={
        price*attendance(price)
    }

    def cost(price:Int):Int={
        500 + (3*attendance(price))
    }

    def profit(price:Int):Int={
        revenue(price) - cost(price)
    }

    def main(args: Array[String]):Unit={
        println("ticket price: 10    Profit: " + profit(10))
        println("ticket price: 15    Profit: " + profit(15))
        println("ticket price: 20    Profit: " + profit(20))
        println("ticket price: 25    Profit: " + profit(25))
        println("ticket price: 30    Profit: " + profit(30))
    }
}