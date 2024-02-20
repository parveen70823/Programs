// public class Bubble {

//     public static void printArray(int array[]){
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int array[]={3,93,9,18,7};
//         for(int i=0;i<array.length-1;i++){
//             for(int j=0;j<array.length-i-1;j++){
//                 if(array[j]>array[j+1])
//                 {
//                     //swap
//                     int temp=array[j];
//                     array[j]=array[j+1];
//                     array[j+1]=temp;
//                 }
//             }
//         }
//         printArray(array);
//     }
// }

public class Bubble {
    
        public static void printarr(int arr[]) {
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        int[] arr = { 3, 32, 53, 213, 553 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - j - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);

    }
}
