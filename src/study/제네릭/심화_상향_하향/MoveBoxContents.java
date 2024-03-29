package study.제네릭.심화_상향_하향;

public class MoveBoxContents {
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

    public static class BoxContentsMover {
        // from -> to
        public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
            to.set(from.get());
            // ! Error
            // from.set(to.get());
        }
    }

    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        box1.set(new Toy());
        Box<Toy> box2 = new Box<>();

        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());


    }
}
