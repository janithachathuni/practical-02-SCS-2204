object obj{
    var k, i, j=2
    var m, n=5
    var f=12.0f
    var g=4.0f
    var c='X'

    def main(args:Array[String]):Unit={
        Console.println(k+12*m)
        Console.println(m/j)
        Console.println(n%j)
        Console.println(m/j*j)
        Console.println(f+10*5+g)
        Console.println((i+1)*n) //++ operator does not exist in scala
    }
}