import java.util.*;

public class sum_of_n {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        int n = 15;

        int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}