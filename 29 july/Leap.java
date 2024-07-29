// 10. Write a Java Program to print the digits of a Given Number. 

class Leap
{
public static void main(String[] args)
{
int yr=2002;

if((yr%400==0) || (yr%100!=0 && yr%4==0))
{
System.out.println("leap yr");
}
else
{
System.out.println("not leap yr");
} 
}



}