// 20. Write a Java Program to print all the Prime Factorsof the Given Number. 

class PrimeFactors
{
public static void main(String[] args)
{
int a=88;
int c=0;

for(int i=2;i<=76;i++)
{
if(a%i==0)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
c=2;
break;
}else
c=0;
}
if(c==0)
System.out.print(i+ " " );
}

}

}
}