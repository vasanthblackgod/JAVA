class prime
{
public static void main(String args[])
{
int n=29,count=0;
for(int i=1;i<=n/2;i++)
if(n%i==0)
{
count++;
}
{
if(count>1)
{
System.out.print("the number is not prime");
}
else
{
System.out.print("the number is prime");
}
}
}
}
