// import java.util.*;

// import javax.sound.sampled.SourceDataLine;

// public class array {

    // ARRAY DECLARATION TYPE
    // int[] aray=new int[size];
    // int array[]=new int[size];
    // int array[]={2,4,5,3,5,3,4};
    // ABOVE ALL DECLARTION TYPE OF ARRAY ARE CORRECT

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int marks[] = new int[4];
    // for (int i = 0; i < 4; i++) {
    // System.out.print("Enter the "+i+ "elements of the marks arry:");
    // marks[i] = sc.nextInt();
    // }
    // for (int i = 0; i < 4; i++) {
    // System.out.print(marks[i]+" ");
    // }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the size of our marks array: ");
//         int size = sc.nextInt();
//         int marks[] = new int[size];
//         for (int i = 0; i < marks.length; i++) {
//             System.out.print("Enter the " + i + " elements of the marks arry:");
//             marks[i] = sc.nextInt();
//         }
//         System.out.print("enter the element which u want to find in the array: ");
//         int x = sc.nextInt();
//         for (int i = 0; i < marks.length; i++) {
//             if (marks[i] == x) {
//                 System.out.println("element found at the index: " + i);
//             }
//             else{
//                 System.out.println("element u choose not founf in our marks array");
//                 break;
//             }
//         }

//     }
// }

import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int x=sc.nextInt();
        int array[]=new int[x];
        System.out.println("enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter the "+i+" element of the array:");
            array[i]=sc.nextInt();
        }
        System.out.println("which element u want to find in the array: ");
        int target=sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target){
                System.out.println("element is found at the index "+i);
            }
            else{
                System.out.println("element is not found in the array:");
                break;
            }
        }
        
    }
    
}
