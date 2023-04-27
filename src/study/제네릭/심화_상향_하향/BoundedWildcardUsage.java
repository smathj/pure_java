package study.제네릭.심화_상향_하향;

public class BoundedWildcardUsage {
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
        }
        
        // 제네릭쓰면 에러(보장 못함)
//      public static void inBox(Box<? extends Toy> box, Toy n) {
        public static void inBox(Box<Toy> box, Toy n) {
            box.set(n);
        } 
        
    }
    
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
