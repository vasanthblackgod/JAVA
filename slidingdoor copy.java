import java.util.*;

public class slidingdoor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i=0;i<=n-k;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                if (a[j] > max)
                    max = a[j];
            }
            System.out.print(max + " ");
        }
        }
    }
