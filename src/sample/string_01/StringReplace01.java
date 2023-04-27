package sample.string_01;

public class StringReplace01 {
    public static void main(String[] args) {
        // replace(문자열) replaceAll (문자열 or 정규식)

        String str = "010@2073@5689";
        String newStr = str.replaceAll("@", "-");
        System.out.println(newStr);

        String email = "smathj@naver.com";
        String id = email.replace("@naver.com", "");
        System.out.println(id);


    }
}
