public class CastingExample {
    public static void main(String[] args){
        // 자동 형변환(Widening Casting)
        int a = 10;
        double b = a;  // int -> double 자동 변환
        System.out.println("자동 형변환: " + b);

        // 명시적 형변환 (Narrowing Casting)
        double c = 9.7;
        int d = (int) c;  // double -> int 강제 변환 (소수점 손실)
        System.out.println("명시적 형변환: " + d);

        // 오버플로
        byte e = 127;
        e++;
        System.out.println("오버플로: " + e);

        // 정밀도 문제
        double x = 0.1;
        double y = 0.2;
        System.out.println("0.1 + 0.2 = " + (x + y));
    }
}
