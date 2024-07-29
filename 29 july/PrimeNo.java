// 22. Write a Java Program to print Prime Numbers from 1 to N. 

class PrimeNo
{
public static void main(String[] args)
{
int n=100;


for(int i=1;i<=n;i++)
{
int c=0;

for(int j=2;j<i;j++)
{
if(i%j==0)
{
c=1;
break;
}
}

if(c==0)
System.out.print(i+" ");
}


}
}