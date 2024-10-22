class Solution {
    public int solution(String message) {
        int answer = 0;

        char[] messageToIndex = message.toCharArray();
        answer = messageToIndex.length*2;

        return answer;
    }
}