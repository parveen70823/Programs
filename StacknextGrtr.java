import java.util.*;
public class StacknextGrtr {
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]={6,3,2,9,1};
        int nextGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            
        // for(int i=0;i<arr.length;i++){--->for nxt grtr right

            // while(!s.isEmpty() && arr[s.peek()]>=arr[i]){--->next smaller right
                
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }

            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }

    }
}
