// 25. Write a Java Program to check whether the given number is Perfect Numberor NOT. 

class PerfectNo
{
public static void main(String[] args)
{
int no=14;

int sum=0;

for(int i=1;i<no;i++)
{
if(no%i==0)
{
sum=sum+i;
}

}
if(sum==no)
System.out.println("yes ");
else
System.out.println("no");
}
}