// 17. Write a java program to LCM of TWO given number. 

class LCM
{
public static void main(String[] args)
{
int a=5,b=25;
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

int lcm=0;
lcm=(a*b)/gcd;

System.out.print(lcm);
}
}