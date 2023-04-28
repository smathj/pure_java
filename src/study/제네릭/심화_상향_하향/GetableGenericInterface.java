package study.제네릭.심화_상향_하향;

// 제네릭 인터페이스

public class GetableGenericInterface {

    interface Getable<T> {
        T get();
    }

    public static class Box<T> implements Getable<T> {
        private T ob;
        public void set(T o) {
            ob = o;
        }

        @Override
        public T get() {
            return ob;
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

        // Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy> gt = box;
        System.out.println(gt.get());
    }

}
