import java.util.*;
public class matrices {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("element foud at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("element not found in this matrix");
        return false;
    }
    public static void main(String args[]){
        
        // int matrix[][]=new int[3][3];
        // int n=matrix.length,m=matrix[0].length;
        int [][] matrix={{12,23,33},{32,58,66},{45,86,99}};
        
        // Scanner sc= new Scanner(System.in);
        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,58);
    }
}
