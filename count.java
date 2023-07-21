import java.util.*;
class count
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
int arr[]=new int[value];
int count=0,i,j;
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
for(j=arr.length-1;j<i;j--)
{
if(arr[i]==arr[j])
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}
}