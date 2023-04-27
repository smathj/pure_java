package study.제네릭.일반;






public class FruitAndBox2 {
    public static class Box {
        private Object obj;

        public void set(Object o) {
            obj = o;
        }

        public Object get() {
            return this.obj;
        }
    }

    public static void main(String[] args) {
        Box aBox = new FruitAndBox2.Box();
        Box oBox = new Box();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple apple = (Apple) aBox.get();
        Orange orange = (Orange) oBox.get();

        System.out.println("apple = " + apple);
        System.out.println("orange = " + orange);
    }
}
