package study.제네릭.심화_상향_하향;



public class UpperBoundedWildcard {
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

        // ------>● Number
        // 상향 제한
        public static void peekBox(Box<? extends Number> box) {
            System.out.println(box);
        }
    }


    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(2000);
        Unboxer.peekBox(iBox);

        Box<String> sBox = new Box<>();
        sBox.set("2000");
        // Unboxer.peekBox(sBox);  // 에러
    }
}
