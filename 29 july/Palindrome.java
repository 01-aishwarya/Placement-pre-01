// 19. Check whether the Given Numberis a Palindrome or NOT.

class Palindrome
{
public static void main(String[] args)
{
int a=7667;
int rev=0;
int b=a;

while(a!=0)
{
int r=a%10;
rev=rev*10+r;
a=a/10;
}
if(rev==b)
System.out.print("palindrome");
else
System.out.print("not palindrome");
}
}