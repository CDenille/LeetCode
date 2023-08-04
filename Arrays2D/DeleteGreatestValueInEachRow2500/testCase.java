package Arrays2D.DeleteGreatestValueInEachRow2500;

public class testCase {
    public static void main(String[] args) {
        int[][] gridOne = new int[][] {{1,2,4},{3,3,1}};
        int[][] gridTwo = new int[][] {{10}};

        // returns 8
        System.out.println(deleteGreatestValueInEachRow.solution(gridOne));

        // returns 10
        System.out.println(deleteGreatestValueInEachRow.solution(gridTwo));
    }

}
