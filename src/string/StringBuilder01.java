package string;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        System.out.println("StringBuilder01.main [빌더]");
        builder.append("제 이름은 ");
        builder.append("홍길동 ");
        builder.append("나이는 ");
        builder.append("17살 입니다");

        System.out.println(builder);
    }
}
