package hello.hellospring.test;

import java.util.ArrayList;
import java.util.List;

public class Users {
    // 이름이 4글자면 친구입니다. 친구를 찾는 함수를 작성해주세요

    // Stream으로 하는 방법 테스트
    // Object[] streamTest
    // = Arrays.stream(users).filter(c -> c.length() == 4).toArray();

    public List<String> users(String[] users) {
        List<String> friends = new ArrayList<String>();

        for (String str : users) {
            if (str.length() == 4)
                friends.add(str);
        }

        return friends;
    }
}
