// 13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

class SmallestOfThree
{
public static void main(String[] args)
{
int a=44,b=55,c=33;
int sm=0;

while(a!=0 && b!=0 && c!=0)
{
a--;
b--;
c--;
sm++;
}


System.out.print(sm);
}
}