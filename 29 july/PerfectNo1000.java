// 26. Write a Java Program to print Perfect Numbersbetween 1 to 1000.

class PerfectNo1000
{
public static void main(String[] args)
{
int no=1000;

for(int j=1;j<=no;j++)
{


int sum=0;

for(int i=1;i<j;i++)
{
if(j%i==0)
{
sum=sum+i;
}

}
if(sum==j)
System.out.println(j+" ");

}

}
}