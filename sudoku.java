import javax.xml.transform.Source;

public class sudoku {

    public static boolean isSafe(int sudoku[][], int row,int col, int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3x3grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row , int col){
        if(row==9){//base case
            return true;
        }

        //recursion
        int nextrow=row, nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextrow, nextcol);
        }
        for (int digit=1;digit<=9;digit++) {
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextrow,nextcol)){
                    return true;
                }sudoku[row][col]=0;

            }   
        }
        return false;
    }

    public static void printsudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]=  {{7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}}; 

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exist");
            printsudoku(sudoku);
        }else{
            System.out.println("soln does not exist");
        }
    }
}
