import java.util.*;

public class advance_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of which size butterfly will print:");
        int n = sc.nextInt();

//BUTTERFLY PATTERN
    //FOR UPPPER HALF 
        for (int i = 1; i <= n; i++) {
            //for printing left half pattern *
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            //for printing spaces
            int spaces=2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            //for printing right most * pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //FOR LOWER HALF
        for (int i = n; i>=1; i--) {
            //for printing left half pattern *
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            //for printing spaces
            int spaces=2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            //for printing right most * pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
