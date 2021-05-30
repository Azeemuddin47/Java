// Find kth Largest Element in a Stream
// Description
// Given an infinite stream of integers, find the kth largest element at any point in time.

import java.util.*;
import java.io.*;


public class Source32 {

    static PriorityQueue<Integer> min;
    static int k;
    static List<Integer> getAllkthNumber(int arr[]){
        List<Integer> list = new ArrayList<>();
        
        for(int val : arr){
            if(min.size() < k)
                min.add(val);
            else{
                if(val > min.peek()){
                    min.poll();
                    min.add(val);
                }
            }
            if(min.size() >= k)
                list.add(min.peek());
            else
                System.out.println("None");
        }
        return list;
    }
    public static void main(String[] args) {
        min = new PriorityQueue<>();
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        k = sc.nextInt();

        int stream[] = new int[n];

        for (int i = 0; i < n; i++) {

            stream[i] = sc.nextInt();

        }

        List<Integer> res = getAllkthNumber(stream);
        
        for(int x : res)
            System.out.println(k + " largest number is "+ x);

    }
}