package sample.string_01;

public class StringBuffer01 {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        System.out.println("StringBuffer01.main [버퍼]");
        buffer.append("제 이름은 ");
        buffer.append("홍길동 ");
        buffer.append("나이는 ");
        buffer.append("17살 입니다");

        System.out.println(buffer);
    }
}
