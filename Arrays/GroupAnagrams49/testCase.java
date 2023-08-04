package GroupAnagrams49;

public class testCase {
    public static void main(String[] args) {
        String[] caseOne = new String[] {"eat","tea","tan","ate","nat","bat"};
        String[] caseTwo = new String[] {""};
        String[] caseThree = new String[] {"a"};

        // returns [[eat, tea, ate], [bat], [tan, nat]]
        System.out.println(groupAnagrams.solution(caseOne));

        // returns [[]]
        System.out.println(groupAnagrams.solution(caseTwo));

        // returns [[a]]
        System.out.println(groupAnagrams.solution(caseThree));
    }
}
