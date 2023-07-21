import java.util.Scanner;

public class hand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String fingerName = getFingerName(number);
        System.out.println("Finger Name: " + fingerName);
    }
    
    public static String getFingerName(int number) {
        String fingerName;
        
        switch (number) {
            case 1:
                fingerName = "Thumb";
                break;
            case 2:
                fingerName = "Index";
                break;
            case 3:
                fingerName = "Middle";
                break;
            case 4:
                fingerName = "Ring";
                break;
            case 5:
                fingerName = "Little";
                break;
            default:
                fingerName = "Invalid";
                break;
        }
        
        return fingerName;
    }
}
