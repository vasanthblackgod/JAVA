import java.util.*;
class sorry
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int count=0;
for(int i=0;i<n;i++)
{
if(i=='1')
{
count++;
}
}
if(count%2==0)
{
System.out.println("Good luck!");
}
else
{
System.out.println("Sorry,sorry!");
}
}
}