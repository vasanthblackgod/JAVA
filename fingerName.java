import java.util.Scanner;
public class fingerName
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =sc.nextInt();
        String fingerName=getFingerName(number);
        System.out.println("Finger Nmae: "+fingerName);
    }
    public static String getFingerName (int number)
    {
        String fingerName;
        switch(number)
        {
            case 1:
            fingerName="thumb";
            break;
            case 2:
            fingerName="Index";
            break;
            case 3:
            fingerName="Middle";
            break;
            case 4:
            fingerName="Ring";
            break;
            case 5:
            fingerName="Little";
            break;
        }
    }
    
}
