package hello.hellospring.test;

public class N {
    // 각 자리의 숫자를 더한값을 원래 숫자에서 빼고 결과가 하단에
    // 나열한 과일코드가 나올때까지 계산하는 코드를 작성하라

    // 예시가 잘못되어 있는것 아닌가?
    // 예시 : 10 => pineapple ?
    // 10 - ( 1 + 0 ) = 9, apple
    // 아무리 봐도 잘못된것 같다

    // 10 ~ 19 = 9, apple
    // 20 ~ 29 = 18, apple
    // 30 ~ 39 = 27, apple
    // 40 ~ 49 = 36, orange
    // 50 ~ 59 = 45, apple
    // 60 ~ 69 = 54, apple
    // 70 ~ 79 = 63, apple
    // 80 ~ 89 = 72, apple
    // 90 ~ 99 = 81, apple
    // 100 ~ ~ = 99, apple
    public String n(int n) {
        String result;
        if (n >= 40 && n <= 49) {
            result = "orange";
        } else {
            result = "apple";
        }

        return result;
    }
}
