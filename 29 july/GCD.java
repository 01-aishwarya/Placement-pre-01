// 16. Write a Java Program to find GCD of two given numbers. 

class GCD
{
public static void main(String[] args)
{
int a=60,b=25;
int gcd=0;

if(a>b)
{
for(int i=1;i<=b;i++)
{
if(b%i==0 && a%i==0)
{
gcd=i;
//System.out.print(gcd+" " );
}
}
}
else
{
for(int i=1;i<=a;i++)
{
if(b%i==0 && a%i==0)
{
gcd=i;
//System.out.print(gcd+" " );
}
}
}

System.out.print(gcd);
}
}