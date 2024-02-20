// package java.heap;
import java.util.*;
public class riority {
    static class student implements Comparable<student>{
        String name;
        int rank;
        public student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(student s2){
            return this.rank- s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<student> pq= new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(4);
        // pq.add(3);
        // pq.add(2);
        // pq.add(10);


        pq.add(new student("A",2));
        pq.add(new student("B",30));
        pq.add(new student("C",12));
        pq.add(new student("D",5));
       
        while(!pq.isEmpty()){
            System.out.println( pq.peek().name +"->" +pq.peek().rank);
            pq.remove();
        }
    }
}