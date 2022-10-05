package oop_extends_05;

public class Iphone extends SmartPhone {

    // 자식 클래스인 Iphone 만의 메서드 ( 부모꺼를 수정도 할 수 있다 )
    public void isMe() {
        System.out.println("저는 아이폰 입니다");
    }

    // 부모꺼 수정
    @Override
    public void usbType() {
        System.out.println("충전기 타입 8핀");
    }

    @Override
    public void isSmartPhone() {
        super.isSmartPhone();
    }

    @Override
    public void doCall() {
        super.doCall();
    }

    @Override
    public void doKakao() {
        super.doKakao();
    }
}
