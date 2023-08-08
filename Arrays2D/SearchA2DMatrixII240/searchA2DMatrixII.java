package Arrays2D.SearchA2DMatrixII240;

public class searchA2DMatrixII {
    public static boolean solution(int[][] matrix, int target) {
        // Recursion 
        return BinarySearch(matrix, target,0, matrix[0].length-1, 0);
    }
    
    public static boolean BinarySearch(int[][] matrix, int target, int start, int end, int row) {   
        // if we've iterated through each row and haven't found target, 
        // the matrix does not contain the target
        if( row > matrix.length-1 ) {
            return false;
        }
        // Perform a BinarySearch on each row of our matrix
        // Reset start and end for each new row
        if(start > end) {
            return BinarySearch(matrix, target, 0, matrix[0].length-1, row+1);
        }
        
        // Calculate the middle of the row  
        int m = start + (end - start) / 2;

        // If we find the target return true
        if(matrix[row][m] == target) {
            return true;
        }

        // If target less than middle, move end 
        if(target < matrix[row][m]) {
            return BinarySearch(matrix, target, start, m-1, row);
        }
        // else move start - target greater than middle
        return BinarySearch(matrix, target, m+1, end, row);
    }
}
