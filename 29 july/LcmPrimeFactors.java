// 18. Write a java program to LCM of TWO given numberusing Prime Factors method. 

class LcmPrimeFactors
{
public static void main(String[] args)
{
int a=7,b=30;
int lcm=0;
int c=1;

c=(a>b)?a:b;

while(c!=0)
{
if(c%a==0 && c%b==0)
{
lcm=c;
c=0;
}
else
c++;
}


System.out.print(lcm);
}
}