package exception;


public class Exception01 {

    public static void main(String[] args) {

        // 파라미터
        try {
            int age = 1/0;
            System.out.println("나 안나옴");

        } catch (Exception e) {
            System.out.println("일루옴");
            // JVM 에게 예외 던지기
//            throw new RuntimeException(e);
        } finally {
            System.out.println("나도 나와요");
        }
    }



}
