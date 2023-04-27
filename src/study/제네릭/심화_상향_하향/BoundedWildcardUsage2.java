package study.제네릭.심화_상향_하향;

public class BoundedWildcardUsage2 {
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

    public static class BoxHandler {
        public static void outBox(Box<? extends Toy> box) {
            Toy t = box.get();
            System.out.println(t);
            // ! Error
            //  box.set(new Toy());
        }
        
        public static void inBox(Box<? super Toy> box, Toy n) {
            box.set(n);
            // ! Error
            // Object object = box.get();
        } 
        
    }
    
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
