import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerLists = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0)
                answerLists.add(i);
        }
        int[] answer = new int[answerLists.size()];

        int size = 0;
        for (int i : answerLists) {
            answer[size++] = i;
        }
        return answer;
    }
}