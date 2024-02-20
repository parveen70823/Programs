public class diagonalsum {
    public static int diagonal_sum(int arr[][]){ 
        int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         } 
        //     }
        // }
        // return sum; 

        for(int i=0;i<arr.length;i++){
            // primary diagonal
            sum+=arr[i][i];

            // secondary diagonal
            if(i!=arr.length-1-i)
            sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][]={
            {23,4,5,24,6},
            {8,7,5,11,9},
            {4,9,53,0,3},
            {8,12,43,54,6},
            {4,3,2,165,6}};

        int sum=diagonal_sum(arr);
        System.out.println(sum);
            
    }
    
}
