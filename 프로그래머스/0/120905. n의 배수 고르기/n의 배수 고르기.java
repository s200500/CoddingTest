import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i : numlist) {
            if (i % n == 0)
                answerList.add(i);
        }
        int[] answer = new int[answerList.size()];

        int size = 0;
        for (int i : answerList) {
            answer[size++] = i;
        }

        return answer;
    }
}