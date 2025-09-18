public class ConstantExample {
    // 클래스 상수
    private static final double PI = 3.14159;
    private static final String APP_NAME = "TIL";

    public static void main(String[] args) {
        // 지역 상수
        final int MAX_USERS = 100;

        System.out.println("PI 값: " + PI);
        System.out.println("앱 이름: " + APP_NAME);
        System.out.println("최대 사용자 수: " + MAX_USERS);

        // MAX_USERS = 200; // 오류! final 변수는 재할당 불가
    }
}
