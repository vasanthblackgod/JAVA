class panlindrome

{
public static void main(String args[])
{
int rem,sum=0,temp,n=121;
temp=n;
while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(sum==temp)
{
System.out.print("number is panlindrom");
}
else
{
System.out.print("number is not panlindrom");
}
}
}
