// 24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000.

class Armstrong1000
{
public static void main(String[] args)
{
int no=1000;

for(int j=1;j<=no;j++)
{

int t1=j;
String s=Integer.toString(t1);
int l=s.length();

int sum=0;
while(t1!=0)
{
int r=t1%10;
int mul=1;
for(int i=1;i<=l;i++)
{
mul=mul*r;
}

sum=sum+mul;
t1=t1/10;

}

if(sum==j)
System.out.print(j+" ");

}
}

}