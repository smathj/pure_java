package study.제네릭.일반;

public class BoxInBox {

    public static class Box<T> {
        private T obj;

        public void set(T o) {
            obj = o;
        }

        public T get() {
            return obj;
        }
    }


    public static void main(String[] args) {

        Box<String> sBox = new Box<>();
        sBox.set("기분이가 ㅈ같다");

        Box<Box<String>> wBox = new Box<>();
        wBox.set(sBox);

        Box<Box<Box<String>>> zBox = new Box<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());

    }

}
