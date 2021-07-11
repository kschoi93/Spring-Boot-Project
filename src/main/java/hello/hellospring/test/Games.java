package hello.hellospring.test;

public class Games {
    // 점수를 보고 이기면 3점,
    // 비기면 1점, 지면 0점으로 계산하여
    // 전체 승점을 구하는 함수를 작성하라

    // 가위바위보는 : 으로 나뉘어 있기 때문에
    // split으로 나눠서 계산한다.

    public int games(String[] games) {
        int score = 0;

        for (String str : games) {
            String[] split = str.split(":");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            if (x > y)
                score += 3;
            else if (x == y)
                score += 1;

        }

        return score;
    }
}
