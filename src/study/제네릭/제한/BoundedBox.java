package study.제네릭.제한;

public class BoundedBox {
    // 상향 제한
    public static class Box<T extends Number> {

        private T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            return ob;
        }

        public int getIntValue() {
            return ob.intValue();
        }

        public double getDoubleValue() {
            return ob.doubleValue();
        }

    }

    public static void main(String[] args) {
        Integer num = 1;
        System.out.println(num.getClass().getName());

        if (num instanceof Number) {
            System.out.println("num은 Number 인스턴스이다");
        }

        Box<Integer> iBox = new Box<>();
        iBox.set(24);

        Box<Double> dBox = new Box<>();
        dBox.set(3.14);

        System.out.println("iBox.get() = " + iBox.get());
        System.out.println("dBox.get() = " + dBox.get());

        System.out.println(iBox.getIntValue());
        System.out.println(iBox.getDoubleValue());

    }

}
