package oop_interface_06;

public interface NoteBook {

    // * 속성
    // public final
    String name = "노트북";

    // * 동작 (미완성)
    void power();
    void os();


    // * 완성인 메서드로 가질 수 있음
    default void myMethod() {
        System.out.println("저는 default Method 입니다");
    }






}
