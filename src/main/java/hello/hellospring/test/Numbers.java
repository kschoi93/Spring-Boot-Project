package hello.hellospring.test;

public class Numbers {
    // 홀수 또는 짝수중에 하나만 존재하는 값의 순번을 출력하는 함수를 작성하라
    // 수는 3개 이상이라는 전제하에 문제풀이

    // 홀 짝 체크
    public String check(int n) {
        String result;

        if (n % 2 == 0)
            result = "짝수";
        else
            result = "홀수";

        return result;
    }

    // 결과 문자 완성
    public String resultStr(int index, int num) {
        return index + " # " + num + "만 " + check(num);
    }

    // 누가누가 혼자 다를까요~?
    public String calculate(int xIndex, int xNum, int yIndex, int yNum, int zIndex, int zNum) {
        if (xNum % 2 == zNum % 2)
            return resultStr(yIndex, yNum);
        else if (yNum % 2 == zNum % 2)
            return resultStr(xIndex, xNum);
        else
            return resultStr(zIndex, zNum);
    }

    public String numbers(int[] numbers) {
        String pos = "";

        int index = 0;
        int[] x = new int[2];
        int[] y = new int[2];

        for (int i = 0; i < numbers.length - 1; i++) {
            int now = numbers[i] % 2;
            int future = numbers[i + 1] % 2;

            // now : future 두 개의 값을 비교 했을때
            // 값이 다르면 odd, even에 index 번호와 해당 번호를 저장해둔다
            if (now != future && index == 0) {

                x[0] = (i + 1);
                x[1] = numbers[i];
                y[0] = (i + 2);
                y[1] = numbers[i + 1];
                index++;
            } else if (now != future && index == 1) {
                pos = calculate(x[0], x[1], y[0], y[1], (i + 2), numbers[i + 1]);
                break;
            }

            // 만약 마지막까지 값이 밝혀지지 않았다????
            if (numbers.length - 2 == i) {
                // 마지막 값을 비교 했을때 같다? 이런, 첫번째가 다른거네
                if (now == future)
                    pos = "1 # " + numbers[0] + "만 " + check(numbers[0]);
                else
                    // 아니다 마지막 값이 다르다, 이렇게 하자
                    pos = calculate(x[0], x[1], y[0], y[1], i, numbers[i - 1]);

                break;
            }
        }

        return pos;
    }
}
