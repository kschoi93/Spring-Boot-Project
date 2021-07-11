package hello.hellospring.test;

import java.util.Arrays;

public class In {
    // 3개의 숫자 중에 2번째 크기의 숫자 위치를 찾는 함수를 작성하라
    // 정렬해서 가운데거 가져오자

    public int in(int[] in) {
        int pos = Arrays.stream(in).sorted().toArray()[1];

        return pos;
    }
}
