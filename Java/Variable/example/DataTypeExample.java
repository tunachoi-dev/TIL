public class DataTypeExample {
    public static void main(String[] args){
        // 기본형 (Primitive Type)
        int age = 27;  // 정수 리터럴
        double height = 178.5;  // 실수 리터럴
        boolean isStudent = false;  // 논리 리터럴
        char bloodType = 'A';  // 문자 리터럴

        // 참조형 (Reference Type)
        String name = "tunachoi-dev";  // 문자열 리터럴

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("학생인가요?" + isStudent);
        System.out.println("혈액형: " + bloodType);
    }
}
