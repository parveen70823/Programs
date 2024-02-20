public class maje_path {
    public static int countPaths(int i,int j, int n, int m){
        if (i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

// for downside movements
        int downpath=countPaths(i+1,j,n,m);


// for right side movements
        int rightpath=countPaths(i,j+1,n,m);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int totalpaths=countPaths(0,0,n,m);
        System.out.println("the total no of path is "+totalpaths);
    }
    
}
