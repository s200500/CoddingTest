class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] rspIndex = rsp.toCharArray();

        for (char rspIndexChar : rspIndex) {
            if (rspIndexChar == '0')
                answer += "5";
            else if (rspIndexChar == '2')
                answer += "0";
            else if (rspIndexChar == '5')
                answer += "2";
        }

        return answer;
    }
}