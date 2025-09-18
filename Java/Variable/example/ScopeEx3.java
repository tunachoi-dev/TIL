/*
아래 코드에서 count 변수와 message 변수의 스코프(보이는 범위)를 각각 설명해 보세요.
 */

public class ScopeEx3 {
    public static void main(String[] args) {
        int count = 0;
        if (count == 0) {
            String message = "Hello";
            System.out.println(message);
        }
        // 여기에서 message를 쓸 수 있을까요?
        // message는 if문 안에 선언이 됐기 때문에 스코프를 벗어납니다.
        // 그렇기 때문에 사용할 수 없습니다.
    }
}
