package oop_extends_05;

public class Client {
    public static void main(String[] args) {

        System.out.println("[갤럭시] ---------------------");
        Galaxy galaxy = new Galaxy();

        galaxy.doCall();
        galaxy.isSmartPhone();
        galaxy.isMe();
        galaxy.doKakao();
        galaxy.usbType();

        System.out.println();
        System.out.println("[아이폰] ---------------------");
        Iphone iphone = new Iphone();

        iphone.doCall();
        iphone.isSmartPhone();
        iphone.isMe();
        iphone.doKakao();
        iphone.usbType();

        System.out.println();
    }
}
