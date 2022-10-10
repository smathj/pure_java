package oop_interface_06;

public class MacBook implements NoteBook {
    @Override
    public void power() {
        System.out.println("MacBook 전원 버튼 동작");
    }

    @Override
    public void os() {
        System.out.println("MacBook의 OS 동작중");
    }


    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        // 미완성을 완성시킨 내꺼
        macBook.power();
        macBook.os();

        // 부모꺼
        macBook.myMethod();
        String notebookName = macBook.name;
        System.out.println(notebookName);


    }
}
