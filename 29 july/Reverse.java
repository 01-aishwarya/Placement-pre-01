// 15. Write a java program to Reverse a given number.  

class Reverse
{
public static void main(String[] args)
{
int a=5634;
int b=0;

while(a!=0)
{
int r=a%10;
b=b*10+r;
a=a/10;
}

System.out.print(b);
}
}