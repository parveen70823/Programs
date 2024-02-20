// package java.heap;
import java.util.*;
public class kuch {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){

            arr.add(data);
            int x = arr.size()-1;       //child index
            int par = (x-1)/2;      //parent index

            while(arr.get(x)<arr.get(par)){     //O(logn)
                int temp =arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
            } 
        }
        
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left< arr.size() && arr.get(minIdx)> arr.get(left)){
                minIdx=left;
            }
            if(right< arr.size() && arr.get(minIdx)> arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove(){
           
            int data=arr.get(0);

            // s1 swapping first and last
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // s2 dleete last
            arr.remove(arr.size()-1);

            // s3--heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        Heap h= new Heap();
        h.add(4);
        h.add(2);
        h.add(20);
        h.add(10);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
