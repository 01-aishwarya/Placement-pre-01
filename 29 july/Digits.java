// 10. Write a Java Program to print the digits of a Given Number. 

class Digits
{
public static void main(String[] args)
{
int no=2302;

while(no!=0)
{
int rem=no%10;
System.out.println(rem);
no=no/10;
}


}
}