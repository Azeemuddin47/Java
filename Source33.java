// Sort Nearly Sorted Array
// Description
// Given a k-sorted array of n elements, where each element is at most k steps away from its target position as it would have been in an array that is sorted in ascending order. Write a program to sort the array in O(n log k) time.

 

// For example, an element at index i in an array that was sorted in ascending order can be found at indexes i - 3, i - 2, i - 1, i, i + 1, i + 2 and i + 3 in the given k-sorted array.

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.*;

public class Source33 {

    private static void sortArray(int[] arr, int n, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k + 1; i++){
            priorityQueue.add(arr[i]);
        }
        int index = 0;
        for(int i = k + 1; i < n; i++){
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }
        Iterator<Integer> itr = priorityQueue.iterator();
        while(itr.hasNext()){
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, n, k);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}