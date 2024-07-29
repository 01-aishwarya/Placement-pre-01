// 2. Write a Java Program to find the Factorialof given number. 

class Factorial
{
public static void main(String[] args)
{
int a=5,fact=1;
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("fact : "+fact);
}
}