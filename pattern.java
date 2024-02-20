import java.util.*;

public class pattern {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        int n= 8;
        int m=8;
        // System.out.print("enter no. of rows: ");
        // int n = sc.nextInt();
        // System.out.print("enter no. of coloumn: ");
        // int m = sc.nextInt();
        // SOLID rectangle pattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // HOLLOW rectangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // invert half pyramid
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // INVERT half pyramid roated by 180
        // for (int i = 1; i <= n; i++) {

        // innner loop->space print
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // star print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 1 12 123 1234 pattern
        
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // 12345 1234 123 12 pattern
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // another method of above
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // 1 23 456 78910 FLOYD's triangle
        // int num=1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 1 01 101 0101 10101 pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}
