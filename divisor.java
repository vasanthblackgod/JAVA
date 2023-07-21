import java.util.*;
class divisor
{
public static void main(String[]args)
{
int i,n;
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
System.out.print(i+" ");
}
}
}
}