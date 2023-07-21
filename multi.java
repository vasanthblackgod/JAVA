import java.util.*;
class market
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=1;
while(n>0)
{
x=x*(n%10);
n=n/10;
}
System.out.println(x);
}
}