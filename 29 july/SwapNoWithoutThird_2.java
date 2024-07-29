// 6. Swap two numberswithout using third variable approach 3.

class SwapNoWithoutThird_2
{
public static void main(String[] args)
{
int a=3,b=5;
a=a^b;
b=a^b;
a=a^b;
System.out.println("a :"+a);
System.out.println("b :"+b);
}



}