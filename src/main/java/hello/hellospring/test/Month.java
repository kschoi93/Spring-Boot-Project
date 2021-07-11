package hello.hellospring.test;

import org.springframework.stereotype.Component;

@Component
public class Month {
    // 1 ~ 12월중에 숫자를 입력받고 1분기, 2분기, 3분기, 4분기를
    // 리턴하는 함수를 작성하라

    // 1~3 : 1분기 , 4~6 : 2분기 , 7~9 : 3분기 , 10~12 : 4분기
    // 나눠서 반올림 하면 되겠다

    // 1 ~ 12까지 테스트
    // int[] x = new int[num.length];
    // int index = 0;

    // for (int i : num) {
    // x[index++] = (int) Math.ceil(i / 3.0);
    // }
    public int month(int month) {
        int x;

        x = (int) Math.ceil(month / 3.0);

        return x;
    }

}
