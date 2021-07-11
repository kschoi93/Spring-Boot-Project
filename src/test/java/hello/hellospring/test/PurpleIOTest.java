package hello.hellospring.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PurpleIOTest {

    private Month month;
    private Ids ids;
    private Games games;
    private N n;
    private Str str;
    private In in;
    private Users users;
    private Numbers numbers;

    @Test
    @DisplayName("분기 숫자 구하기")
    void MonthTest() {
        // given
        month = new Month();
        // int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int num1 = 3;
        int num2 = 8;
        int num3 = 11;

        // when
        // int[] result = month.month(num);
        int result1 = month.month(num1);
        int result2 = month.month(num2);
        int result3 = month.month(num3);

        // then
        // int[] test = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
        // assertArrayEquals(result, test);
        assertEquals(result1, 1);
        assertEquals(result2, 3);
        assertEquals(result3, 4);

    }

    @Test
    @DisplayName("사용하지 않는 가장 작은 숫자 찾기")
    void IdsTest() {
        // given
        ids = new Ids();
        int[] num1 = { 0, 1, 2, 4 };
        int[] num2 = { 0, 1, 2, 3, 4, 5, 6 };
        int[] num3 = { 0, 3, 2, 5, 3, 3, 5, 4, 3, 2, 1, 4, 3, 2, 6, 7, 8, 7, 9, 6, 5, 2, 1, 6, 4, 3, 7 };
        int[] num4 = { 0, 1, 2, 3, 4, 6, 7, 8 };

        // when
        int result1 = ids.ids(num1);
        int result2 = ids.ids(num2);
        int result3 = ids.ids(num3);
        int result4 = ids.ids(num4);

        // then
        assertEquals(result1, 3);
        assertEquals(result2, 7);
        assertEquals(result3, 10);
        assertEquals(result4, 5);
    }

    @Test
    @DisplayName("승점구하기")
    void gamesTest() {
        // given
        games = new Games();
        String[] winWin1 = { "3:1", "2:2", "1:3" };
        String[] winWin2 = { "4:4", "3:2", "1:5", "6:0", "1:3", "1:1", "2:2", "2:3", "2:5" };
        // when
        int result1 = games.games(winWin1);
        int result2 = games.games(winWin2);

        // then
        assertEquals(result1, 4);
        assertEquals(result2, 9);
    }

    @Test
    @DisplayName("더하고 빼기")
    void nTest() {
        // given
        n = new N();
        int num1 = 10;
        int num2 = 325;
        int num3 = 10000;
        int num4 = 44;
        int num5 = 40;
        int num6 = 49;
        int num7 = 25;

        // when
        String result1 = n.n(num1);
        String result2 = n.n(num2);
        String result3 = n.n(num3);
        String result4 = n.n(num4);
        String result5 = n.n(num5);
        String result6 = n.n(num6);
        String result7 = n.n(num7);

        // then
        assertEquals(result1, "apple");
        assertEquals(result2, "apple");
        assertEquals(result3, "apple");
        assertEquals(result4, "orange");
        assertEquals(result5, "orange");
        assertEquals(result6, "orange");
        assertEquals(result7, "apple");
    }

    @Test
    @DisplayName("모음 찾기")
    void strTest() {
        // given
        str = new Str();
        String data1 = "abracadabra";
        String data2 = "dkcbdkenfjekd";

        // when
        int result1 = str.str(data1);
        int result2 = str.str(data2);

        // then
        assertEquals(result1, 5);
        assertEquals(result2, 2);
    }

    @Test
    @DisplayName("중간 숫자 찾기")
    void inTest() {
        // given
        in = new In();
        int[] num1 = { 0, 1, 2 };
        int[] num2 = { 5, 1, 2 };

        // when
        int result1 = in.in(num1);
        int result2 = in.in(num2);

        // then
        assertEquals(result1, 1);
        assertEquals(result2, 2);
    }

    @Test
    @DisplayName("친구 찾기")
    void usersTest() {
        // given
        users = new Users();
        String[] str1 = { "Ryan", "Kieran", "Mark" };
        String[] str2 = { "Kyung", "Mike", "Lily" };
        String[] str3 = { "aa", "test", "bbb" };
        String[] str4 = { "hell", "b", "line", "a", "rich" };
        // when
        List<String> result1 = users.users(str1);
        Object[] result11 = result1.toArray();

        List<String> result2 = users.users(str2);
        Object[] result22 = result2.toArray();

        List<String> result3 = users.users(str3);
        Object[] result33 = result3.toArray();

        List<String> result4 = users.users(str4);
        Object[] result44 = result4.toArray();

        // then
        Object[] test1 = { "Ryan", "Mark" };
        Object[] test2 = { "Mike", "Lily" };
        Object[] test3 = { "test" };
        Object[] test4 = { "hell", "line", "rich" };
        assertArrayEquals(result11, test1);
        assertArrayEquals(result22, test2);
        assertArrayEquals(result33, test3);
        assertArrayEquals(result44, test4);
    }

    @Test
    @DisplayName("아이큐 테스트")
    void numbersTest() {
        // given
        numbers = new Numbers();
        int[] num1 = { 2, 4, 7, 8, 10 };
        int[] num2 = { 1, 2, 1, 1 };
        int[] num3 = { 5, 3, 1, 7, 10 };
        int[] num4 = { 1, 4, 6, 8, 10 };

        // when
        String result1 = numbers.numbers(num1);
        String result2 = numbers.numbers(num2);
        String result3 = numbers.numbers(num3);
        String result4 = numbers.numbers(num4);

        // then
        assertEquals(result1, "3 # 7만 홀수");
        assertEquals(result2, "2 # 2만 짝수");
        assertEquals(result3, "5 # 10만 짝수");
        assertEquals(result4, "1 # 1만 홀수");
    }

}
