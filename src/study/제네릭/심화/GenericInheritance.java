package study.제네릭.심화;

public class GenericInheritance {
    public static class Box<T> {
        protected T ob;
        public void set (T o) { ob = o; }
        public T get() { return ob; }
    }

    public static class SteelBox<T> extends Box<T> {
        public SteelBox(T o) {
            super.ob = o;
        }
    }

    public static void main(String[] args) {
        SteelBox<Integer> iBox = new SteelBox<>(5689);
        SteelBox<String> sBox = new SteelBox<String>("스틸");

        System.out.println("iBox.get() = " + iBox.get());
        System.out.println("sBox.get() = " + sBox.get());
    }

}
