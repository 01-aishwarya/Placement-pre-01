// 11. Write a Java Program to print all the Factors of the Given number.

class AllFactors
{
public static void main(String[] args)
{
int no=100;

for(int i=1;i<=no;i++)
{
if(no%i==0)
System.out.print(i+" ");
}

}
}