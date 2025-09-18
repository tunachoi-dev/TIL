/*
원의 반지름을 저장하는 final int RADIUS = 5;를 선언하고,
원의 넓이(πr²)를 계산해 출력해 보세요. (Math.PI 사용)
 */

public class ConstantEx1 {
    private static final int RADIUS = 5;

    public static void main(String[] args) {
        double circleArea = Math.PI * RADIUS * RADIUS;

        System.out.println("원의 넓이: " + circleArea);
    }
}
