package study.제네릭.심화_상향_하향;

public class LowerBoundedWildcard {
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

        // Integer ●------>
        // 의미 : 상속한것을 피하기위해서
        // 하향 제한, Integer 또는 Integer가 상속하는 클래스여야한다 (최소가 Integer)
        // 후보 : Box<Integer>, Box<Number>, Box<Object>
        public static void peekBox(Box<? super Integer> box) {
            System.out.println(box.get().getClass());
            System.out.println(box);
        }
    }

    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(123);

        Box<Number> nBox = new Box<>();
        nBox.set(Integer.valueOf("1234"));

        Box<Object> oBox = new Box<>();
        oBox.set("아아아앙아ㅏㅁ낭ㅁ낭");

        Unboxer.peekBox(iBox);
        Unboxer.peekBox(nBox);
        Unboxer.peekBox(oBox);

    }
}
