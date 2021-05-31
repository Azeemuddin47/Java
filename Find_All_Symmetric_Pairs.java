// Find All Symmetric Pairs in an Array
// Description
// Given an array of pairs of integers, find all the symmetric pairs in it. Two pairs (a, b) and (c, d) are said to be symmetric if b is equivalent to c and a is equivalent to d.

// For example, (10, 20) and (20, 10) are symmetric. It may be assumed that the first element in each pair is distinct. 

 

// Note that in the output, you need to print only the first occurring pair out of the two symmetric pairs in the given array. For example, if (a, b) and (c, d) are symmetric, you will only print the one that occurs first in the given array.
import java.util.*;

public class Source35 {

    public static void symmetricPair(int[][] arr) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
  
       
        for (int i = 0; i < arr.length; i++)
        {
            int first = arr[i][0];
            int sec   = arr[i][1];
            Integer val = hM.get(sec);
            if (val != null && val == first)
               System.out.println( sec + " "  + first);
                
            else 
               hM.put(first, sec);
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}