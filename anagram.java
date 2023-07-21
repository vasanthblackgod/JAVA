import java.util.*;
class anagram
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
String str1=obj.nextLine();
String str2=obj.nextLine();
char[] a=str1.toCharArray();
char[] b=str2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
if(Arrays.equals(a,b)==true)
{
System.out.print("anagram");
}
else
{
System.out.print(" not a anagram");
}
}
}
