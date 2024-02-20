import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of row and col of the array:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] number=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the element which u want to find in the array:");
        int x= sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(number[i][j]==x){
                    System.out.println("element found at the index at ("+i+","+j+")");
                }
            }
        }
        //FOR OUTPPUT THE ARRAY
        // System.out.println("your 2d matrix(number) is:");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(number[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
    }
}

