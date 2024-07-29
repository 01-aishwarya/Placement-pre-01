// 12. Write a Java Program to find sum of the digits of a given number

class SumOfDigits
{
public static void main(String[] args)
{
int no=1603;
int sum=0;

while(no!=0)
{
int rem=no%10;
sum=sum+rem;
no=no/10;
}

System.out.print(sum);
}
}