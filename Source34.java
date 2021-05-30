// Find Sum Between pth and qth Smallest Element
// Description
// Given an array and two numbers p and q, find the sum of all the elements of the array such that the range of the elements is between the pth and qth smallest elements of the array.

// It may be assumed that (1 <= p < q <= n) and all elements of the array are distinct.

import java.util.*;
import java.util.Arrays.*;

public class Source34 {

    public static int sumBetweenPthToQthSmallestElement(int[] arr, int p, int q) {

       Arrays.sort(arr);
       
       int result = 0;
       for(int i = p; i < q - 1; i++)
        result += arr[i];
       return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(sumBetweenPthToQthSmallestElement(arr, p, q));
    }
}