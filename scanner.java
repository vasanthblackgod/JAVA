import java.util.Scanner;
class sum
{
public static void main (String[]args)
{
int n1,n2,sum;
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
n1=s.nextInt();
System.out.println("enter second number");
n2=s.nextInt();
sum=n1/n2;
System.out.println("sum="+sum);
}
}