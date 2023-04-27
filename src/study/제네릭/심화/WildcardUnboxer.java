package study.제네릭.심화;

public class WildcardUnboxer {

    public static class Box<T> {
        private T ob;
        public void set (T o) { ob = o; }
        public T get() { return ob; }

        @Override
        public String toString() {
            return ob.toString();

        }
    }

    public static class Unboxer {
        public static <T> T openBox(Box<T> box) {
            return box.get();
        }

        public static <T> void peekBox(Box<T> box) {
            System.out.println(box);
        }
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("어쩌구 저쩌구");
        Unboxer.peekBox(box);
    }
}
