public class backtrack {

    // Q1. SUBTRACTING THE 2 FROM THE EACH ELEMRNT IN THE ARRAY
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);// fix call step
        arr[i] = arr[i] - 2;// backtrackimg step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q2. PRINT ALL THE SUBSTRING OF THE GIVEN STRING

    public static void findSubset(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findSubset(str, ans + str.charAt(i), i + 1);

        // NO CHOICE
        findSubset(str, ans, i + 1);
    }

    // Q3.PERMUTATION OF THE STRINGS
    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"="ab"+"de"
            // String newstr=str.substring(0, i)+str.substring(i+1, str.length());
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutation(newstr, ans + curr);
        }
    }

    // Q4. N- queens
    public static void nQueens(char board[][],int row){
        //base
        if(row==board.length){
            // printBoard(board);
            count ++;
            return; 
        }
        // column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);//function call
                board[row][j]='X';//backtracking step
            }
           
        }
    }
    static int count=0;
    public static boolean isSafe(char board[][],int row ,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal up left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true; 


    }

    public static void printBoard(char board[][]) {
        System.out.println("---------Chess Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q5.Grid ways
    public static int gridWays(int i, int j,int n, int m){
        if(i==n-1&&j==m-1){//cond for last ceell
            return 1;
        }else if(i==n || j==m){//boundry creoss cond
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2 =gridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changeArr(arr,0,1);
        // printArr(arr);

        // findSubset("abc","",0);

        // permutation("abc", ""); 

        // int n = 4;
        // char board[][] = new char[n][n];
        // // initialize
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         board[i][j] = 'X';
        //     }
        // }
        // nQueens(board, 0);
        // System.out.println("total no of ways of the queens palcement is ="+count);
         

        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}
