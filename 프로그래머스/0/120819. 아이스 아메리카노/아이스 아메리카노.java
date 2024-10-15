class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];

        int coffie=5500;

        answer[0]=money/coffie;

        answer[1]=money%coffie;

        return answer;
    }
}