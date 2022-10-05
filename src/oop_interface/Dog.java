package oop_interface;

// * 강아지과 동물을 명시한 인터페이스
// ! 인터페이스로는 인스턴스 ( new Dog() 불가능 ) 반드시 누군가 이어서 완성 시켜야한다
public interface Dog {

    // 필드
    int legs = 4;   // 다리 갯수

    // 추상 메서드 ( 미완성 ) <-------------------------
    void bark(String sound);

    // 온전한 메서드 ( 완성 )
    default void step() {
        System.out.println("저는 걸을 수 있습니다");
    }
}
