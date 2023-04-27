package study.제네릭.제한;

public class GenericMethodBoxMaker2 {
    public static class Box<T> {

        public T ob;

        public void set (T o) { ob = o; }

        public T get() { return ob; }
    }

    public static class Unboxer {
        public static <T> T openBox(Box<T> box) {
            return box.get();
        }
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("ㅈ같다");

        String str = Unboxer.openBox(box);              // 일반적으로 생략함
        String str2 = Unboxer.<String>openBox(box);     // 생략안한 버전
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
