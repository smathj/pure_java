package string_01;



public class String01 {
    public static void main(String[] args) {

        String s1 = "안녕";
        s1 += "하세요";    // = s1 = s1 + "하세요";

        String s2 = new String("hi");
        String s3 = s1 + s2;
        String[] s4 = new String[]{"Hello", "World"};


        System.out.println(s1);                     // 안녕하세요
        System.out.println(s2);                     // hi
        System.out.println(s3);                     // 안녕hi
        System.out.println(s4[0] + s4[1]);          // HelloWorld



    }

}
