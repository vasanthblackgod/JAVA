import java.util.*;
public class smallenumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int arrsize = s.nextInt();
        int arr[];
        arr = new int[arrsize];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arrsize; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();
        int smallest = arr[0];
        for (int i = 0; i < arrsize - 1; i++)
        {
            if (smallest > arr[i + 1]) {
                smallest = arr[i + 1];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);
    }
}