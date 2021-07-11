package hello.hellospring.test;

public class Str {
    // a, e, i, o, u가 몇개 들어 있는지 출력하는 함수를 작성해주세요
    String[] col = { "a", "e", "i", "o", "u" };

    public int str(String str) {
        // 총 글자수
        int count = str.length();

        int index = 0;
        for (String i : col) {
            // replaceAll로 해당되는 문자 제거
            str = str.replaceAll(i, "");

            index++;
            // 제거 한 최종값을 총 글자수 셌던 변수에서 뺀다
            if (col.length == index)
                count = count - str.length();
        }

        return count;
    }
}
