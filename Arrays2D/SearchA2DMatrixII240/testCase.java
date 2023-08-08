package Arrays2D.SearchA2DMatrixII240;

public class testCase {
    public static void main (String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;

        // returns true
        System.out.println(searchA2DMatrixII.solution(matrix, target));

        int[][] matrixTwo = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int targetTwo = 13;

        // returns false
        System.out.println(searchA2DMatrixII.solution(matrixTwo, targetTwo));

        int[][] matrixThree = {{1},{3}};
        int targetThree = 3;

        // returns true
        System.out.println(searchA2DMatrixII.solution(matrixThree, targetThree));
    }
}
