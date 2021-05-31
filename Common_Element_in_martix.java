// Find All Common Element in Each Row of Matrix
// Description
// Given an M x N matrix of integers, find all the common elements that are present in all rows of the given matrix in O(M * N) time.

import java.util.*;

public class Source {
    static int row;
    static int col;

    public static void printElementInAllRows(int mat[][]) {

        Map<Integer,Integer> mp = new HashMap<>();
     
    // initalize 1st row elements with value 1
    for (int j = 0; j < col; j++)
        mp.put(mat[0][j],1);
         
    // traverse the matrix
    for (int i = 1; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            // If element is present in the map and
            // is not duplicated in current row.
            if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
            {
                // we increment count of the element
                // in map by 1
                mp.put(mat[i][j], i + 1);
 
                // If this is last row
                if (i == row - 1)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}