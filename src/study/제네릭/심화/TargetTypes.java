package study.제네릭.심화;

public class TargetTypes {

    public static class Box<T> {
        private T ob;
        public void set (T o) { ob = o; }
        public T get() { return ob; }
    }

    public static class EmptyBoxFactory {
        public static <T> Box<T> makeBox() {
            Box<T> box = new Box<>();
            return box;
        }
    }

    public static void main(String[] args) {
        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox(); // 컴파일러 유추 기능을 이용하여 Integer를 T에게 넘김
        iBox.set(25);
        System.out.println("iBox.get() = " + iBox.get());

        // Box<Integer> 타겟 타입
        Box<Integer> iBox2 = EmptyBoxFactory.makeBox(); // jdk1.7 부터 이러한 방식 가능, 리턴타입으로 유추

    }

}
