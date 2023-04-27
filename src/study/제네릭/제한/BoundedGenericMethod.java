package study.제네릭.제한;

public class BoundedGenericMethod {
    public static class Box<T> {

        public T ob;

        public void set (T o) { ob = o; }

        public T get() { return ob; }
    }

    public static class BoxFactory {

        public static <T extends Number> Box<T> makeBox(T o) {
            Box<T> box = new Box<>();
            box.set(o);

            System.out.println("Boxed data: " + o.intValue());
            return box;
        }
    }

    public static class Unboxer {
        public static <T extends Number> T openBox(Box<T> box) {
            System.out.println("Unboxed data: " + box.get().intValue());
            return box.get();
        }
    }

    public static void main(String[] args) {
        Box<Integer> sBox = BoxFactory.makeBox(5689);
        int n = Unboxer.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}
