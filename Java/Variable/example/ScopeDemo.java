public class ScopeDemo {
    // 1) 필드(인스턴스/클래스)
    private int instanceCount = 0;  // 인스턴스 필드 (객체마다 별도)
    private static String appName = "TIL";  // 클래스(static) 필드 (공유됨)

    public void work() {
        // 2) 지역 변수(메서드 스코프)
        int processed = 0;  // 반드시 초기화 후 사용

        if (true) {
            // 3) 블록 스코프
            String step = "parse";
            processed++;
            System.out.println(step + " -> " + processed);
        }
        // System.out.println(step); // 컴파일 오류: step은 블록 밖에서 보이지 않음

        instanceCount += processed;  //필드 접근
    }

    public static void main(String[] args) {
        ScopeDemo d1 = new ScopeDemo();
        ScopeDemo d2 = new ScopeDemo();

        d1.work(); d2.work();
        System.out.println(appName);  // static 필드 접근
        // System.out.println(processed);  // 컴파일 오류: 지역 변수는 main에서 모름
        System.out.println(d1.instanceCount);  // 각 객체마다 값이 다를 수 있음.
        System.out.println(d2.instanceCount);
    }
}
