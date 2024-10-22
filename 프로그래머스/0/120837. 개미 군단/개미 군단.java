class Solution {
    public int solution(int hp) {
        int answer = 0;
        int generalAnt = 0;
        int soldierAnt = 0;
        int ergate = 0;

        generalAnt = hp / 5;
        soldierAnt = (hp % 5) / 3;
        ergate = hp - (generalAnt * 5) - (soldierAnt * 3);

        answer = generalAnt + soldierAnt + ergate;

        return answer;
    }
}