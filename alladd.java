package nightclass;
import java.util.*;
class alladd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] arr1=new int[]{1,2,5,4,0,2};
int[] arr2=new int[]{2,4,5,0};
if(Arrays.equals(arr1,arr2))
{
System.out.print("YES");
}
else
{
System.out.print("NO");
}
}
}