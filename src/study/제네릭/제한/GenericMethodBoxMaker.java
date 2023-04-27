package study.제네릭.제한;



public class GenericMethodBoxMaker {

    public static class Box<T> {

        public T ob;

        public void set (T o) { ob = o; }

        public T get() { return ob; }
    }

    public static class BoxFactory {

        // 제네릭 메서드
        public static <T> Box<T> makeBox(T o) {
            Box<T> box = new Box<>();
            box.set(o);
            return box;
        }
    }

    public static void main(String[] args) {
        Box<String> sBox = BoxFactory.makeBox("스윗권");
        System.out.println("sBox.get() = " + sBox.get());

        Box<String> ssBox = BoxFactory.<String>makeBox("어카누");
        System.out.println("ssBox.get() = " + ssBox.get());

        Box<Double> dBox = BoxFactory.makeBox(3.14);
        System.out.println("dBox.get() = " + dBox.get());
    }
}
