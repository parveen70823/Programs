public class spiralMatrix {
    public static void printspiral(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            // top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(arr[startrow][j]+" ");
            }

            // right
            for(int i=startrow+1;i<=endrow;i++ ){ 
                System.out.print(arr[i][endcol]+" ");
            }

            // bottom 
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                
                System.out.print(arr[endrow][j]+" ");
            }

            // left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
             startrow++;
             startcol++;
             endcol--; 
             endrow--;
        }
    }
    public static void main(String args[]){
        int arr[][]={
            {23,4,5,24,6},
            {8,7,5,11,9},
            {4,9,43,0,3},
            {8,12,43,54,6},
            {4,3,2,165,6}};
            printspiral(arr);
    }
}
