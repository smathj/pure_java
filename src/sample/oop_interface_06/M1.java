package sample.oop_interface_06;

public class M1 extends MacBook {

    public String me = "저는 m1 입니다";

    public M1() {
        super();

    }

    public void m1Introduce() {
        System.out.println("안녕하세요 저는 비싼 m1 입니다");
    }


    public static void main(String[] args) {
        M1 m1 = new M1();
        m1.m1Introduce();
        m1.myMethod();
        m1.os();
        m1.power();
        System.out.println(m1.me);
        System.out.println(MacBook.name);


    }
}
