package oop_interface;

public class JindoDog implements Dog {

    // 미완성된 메서드를 완성 시켯다 ( 반드시 해야함 )
    @Override
    public void bark(String sound) {
        System.out.println("진돗개는 " + sound + sound +  " 하면서 짖습니다");
    }

    // 이미 완성된 step은 오버라이딩 하지 않아도된다


    public static void main(String[] args) {
        JindoDog jindoDog = new JindoDog();
        jindoDog.bark("워웈-! "); // 진돗개 클래스에서 완성시킨 메서드
        jindoDog.step();                // 완성된 메서드
        System.out.println(jindoDog.legs);  // 다리 갯수
    }
}
