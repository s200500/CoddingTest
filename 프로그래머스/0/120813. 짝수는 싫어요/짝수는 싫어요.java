class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n % 2 == 0) ? n / 2 : n / 2 + 1];

        int count = 0;

        for (int i = 1; i < n + 1; i += 2) {
            if (i < n + 1) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}