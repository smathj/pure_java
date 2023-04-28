package study.제네릭.심화_상향_하향;

// 제네릭 인터페이스

public class GetableGenericInterface2 {

    interface Getable<T> {
        T get();
    }

    public static class Box<T> implements Getable<String> {
        private T ob;
        public void set(T o) {
            ob = o;
        }

        @Override
        public String get() {
            return ob.toString();
        }
    }

    public static class Toy {
        @Override
        public String toString() {
            return "I am a Toy";
        }
    }

    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        box.set(new Toy());

        Getable<String> gt = box;
        System.out.println(gt.get());

    }

}
