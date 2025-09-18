public class ScopeEx1 {
    public static void main(String[] args) {
        int x;
        // System.out.println(x);  // 오류 발생! 이유는? 변수를 초기화를 안 함

        if (true) {
            int y = 10;
            System.out.println(y);  // 출력 가능
        }

        // System.out.println(y);  // 오류 발생! 이유는? 지역 변수를 사용했기 때문에.
    }
}
