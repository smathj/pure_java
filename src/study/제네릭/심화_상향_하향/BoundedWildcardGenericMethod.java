package study.제네릭.심화_상향_하향;

public class BoundedWildcardGenericMethod {
    public static class Box<T> {
        private T ob;
        public void set (T o) { ob = o; }
        public T get() { return ob; }

        @Override
        public String toString() {
            return ob.toString();

        }
    }

    public static class Toy {
        @Override
        public String toString() {
            return "I am a Toy";
        }
    }
    public static class Robot {
        @Override
        public String toString() {
            return "I am a Robot";
        }
    }

    public static class BoxHandler {
        public static <T> void outBox(Box<? extends T> box) {
            T t = box.get();
            System.out.println(t);
        }
        public static <T> void inBox(Box<? super T> box, T n) {
            box.set(n);
        }
    }

    public static void main(String[] args) {
        Box<Toy> tBox = new Box<>();
        BoxHandler.inBox(tBox, new Toy());
        BoxHandler.outBox(tBox);

        Box<Robot> rBox = new Box<>();
        BoxHandler.inBox(rBox, new Robot());
        BoxHandler.outBox(rBox);

    }
}
