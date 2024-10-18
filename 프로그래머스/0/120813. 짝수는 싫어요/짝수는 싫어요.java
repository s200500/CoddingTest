class Solution {
    public int[] solution(int n) {
        boolean numEvenOddCheck;

        if (n % 2 == 0)
            numEvenOddCheck = true;
        else
            numEvenOddCheck = false;

        int[] answer = new int[numEvenOddCheck ? n / 2 : n / 2 + 1];

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