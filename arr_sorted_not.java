public class arr_sorted_not {
    public static boolean isarrSort(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return isarrSort(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={2,23};
        System.out.println(isarrSort(arr,0));
    }    
}
