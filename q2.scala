object obj{
    var a=2;
    var b=3;
    var c=4;
    var d=5;
    var k=4.3f;
    var g=0; 

    def main(args: Array[String]):Unit={
        
        b-=1
        val exp1=b*a+c*d
        Console.println(exp1)
        d-=1

        Console.println(a)
        a+=1

        val exp2= -2*(g-k)+c
        Console.println(exp2)

        Console.println(c)
        c+=1
        c+=1
        c=c*a
        Console.println(c)
        a+=1

    }
}