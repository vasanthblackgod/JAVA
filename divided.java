import java.util.Scanner;
class divided
{
public static void main(String[] args)
{
int a,f;
Scanner s=new Scanner(System.in);
a=s.nextInt();
f=a%3;
if(f!=0)     
{
System.out.println("not divided by 3");
}
else
{
System.out.println("divided by 3");     
}
}
}