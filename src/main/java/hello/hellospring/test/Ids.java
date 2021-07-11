package hello.hellospring.test;

import java.util.Arrays;

public class Ids {
    // 0부터 시작하는 양수(+)인 ID가 있습니다. 여러 ID를 보고
    // 사용하지 않는 가장 작은 숫자를 찾는 함수를 작성하라

    // 여러 ID를 보고 사용하지 않는 가장 작은 숫자란 뜻은
    // 사용하지 않는 숫자가 2개 이상일 수도 있다는 것인가?

    // 1안 사용하지 않는 숫자가 2개라면?
    // 중복제거, 정렬 후
    // 0 부터 ~ 확인하면 되겠다

    // 2안 사용하지 않는 숫자가 1개라면?
    // 가장 큰 값 (N), 합계 구하고
    // ( N * (N + 1) / 2 ) - 합계

    // 예시에서는 결과값이 2개가 나오지 않았기 때문에
    // 1개만 나온다는 가정으로 풀자

    public int ids(int[] ids) {
        int min;

        // 중복제거
        int[] renewal = Arrays.stream(ids).distinct().toArray();
        // 합계
        int sum = Arrays.stream(renewal).sum();
        // 가장 큰 값
        int max = Arrays.stream(renewal).max().getAsInt();

        min = max * (max + 1) / 2 - sum;

        // 만약, result == 0이 나오면 중간에 비는 수가 없다는 뜻인데
        // 예시에서는 가장 큰 값 + 1이 정답이었으니 예시대로..
        if (min == 0) {
            min = max + 1;
        }

        return min;
    }
}
