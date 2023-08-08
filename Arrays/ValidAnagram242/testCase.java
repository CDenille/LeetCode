package ValidAnagram242;

public class testCase {
    public static void main(String[] args) {
        String s1 = "anagram"; String t1 = "nagaram";
        String s2 = "rat"; String t2 = "car";

        // returns true
        System.out.println(validAnagram.solution(s1,t1));

        // returns false
        System.out.println(validAnagram.solution(s2,t2));
        
        // returns true
        System.out.println(validAnagramSolution2.solution(s1,t1));

        // returns false
        System.out.println(validAnagramSolution2.solution(s2,t2));

    }
}
