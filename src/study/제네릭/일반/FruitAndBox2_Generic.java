package study.제네릭.일반;






public class FruitAndBox2_Generic {
    public static class Box<T> {
        private T obj;

        public void set(T o) {
            obj = o;
        }

        public T get() {
            return this.obj;
        }
    }

    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple apple = aBox.get();
        Orange orange = oBox.get();

        System.out.println("apple = " + apple);
        System.out.println("orange = " + orange);
    }
}
