public class staircase {

    
    // public static boolean search_staircase(int arr[][], int key) {
    //     int row = 0, col = arr[0].length - 1;
    //     while (row< arr.length &&col >= 0) {
    //         if (key ==arr[row][col] ) {  
    //             System.out.println("element found at (" + row + "," + col + ")");
    //             return true;
    //         } 
    //         else if (key < arr[row][col]) {
    //             col--;
    //         }
    //         else {
    //             row++;
    //         }
    //     }
    //     System.out.println("key not found"); 
    //     return false;

    // }
    public static boolean search_staircase(int arr[][], int key) {
        int row = arr.length-1,col=0;
        while (row>=0 && col <arr[0].length) {
            if (key ==arr[row][col] ) {  
                System.out.println("element found at (" + row + "," + col + ")");
                return true;
            } 
            else if (key > arr[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        System.out.println("key not found"); 
        return false;

    }
    public static void main(String args[]) {
        int arr[][] = {
                { 10,20,30,40 },
                { 15,25,35,45},
                { 27,29,37,48},
                {  32,33,39,50}, };

        int key=50;
        search_staircase(arr, key);
    }

}
