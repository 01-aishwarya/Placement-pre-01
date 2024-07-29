// 4. Swap two numberswithout using third variable approach 1

class _SwapNoWithoutThird_1
{
public static void main(String[] args)
{
int a=3,fact=1;
fact=recur(a);
System.out.println("fact : "+fact);
}

static int recur(int a)
{
if(a==0)
return 1;
else
return  a*recur(a-1);
}

}