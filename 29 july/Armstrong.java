// 24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000.

class Armstrong
{
public static void main(String[] args)
{
int no=1000;

for(int i=1;i<=no;i++)
{

int t1=i;
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

if(sum==i)
System.out.print(i+" ");

}
}

}