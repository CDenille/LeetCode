package Arrays2D.DeleteGreatestValueInEachRow2500;

import java.util.Arrays;

public class deleteGreatestValueInEachRow {
    public static int solution(int[][] grid) {

        // Sort every row in the grid.
        // So that our last value in the row is always the greatest.
        for (int[] rows : grid) {
            Arrays.sort(rows);
        }
        // Variable to hold our final sum
        int answer = 0;

        // Iterate through each col. We "delete" a col for every iteration
        for (int col = grid[0].length - 1; col >= 0; col--) {
            // Variable to hold the max of each colum we deleted.
            // Needs to be reset when we delete a colum
            int maxInCol = 0;
            // Iterate through each row
            // grid[row][col] is the largest value of our sorted row
            for (int row = 0; row < grid.length; row++) {
                // If the largest value of the row os greater than maxInRow,
                // save that value as our maximum of deleted values
                if (grid[row][col] > maxInCol) {
                    maxInCol = grid[row][col];
                }

            }
            // add the max of the deleted colums to our answer after every
            // colum iteration
            answer += maxInCol;
        }
        return answer;
    }
}
