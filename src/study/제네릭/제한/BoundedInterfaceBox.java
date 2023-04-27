package study.제네릭.제한;

interface Eatable {

    String eat();
}

class Apple implements Eatable {

    public String toString() {
        return "I am an apple";
    }

    @Override
    public String eat() {
        return "It tastes so good!";
    }
}



public class BoundedInterfaceBox {

    // 상향제한 And 조건으로 교집합 나타낼 수 있다
//    public static class Box<T extends Number & Eatable> {
    public static class Box<T extends Eatable> {

        public T ob;

        public void set (T o) {
            ob = o;
        }

        public T get() {
            System.out.println(ob.eat());   // <-
            return ob;
        }
    }

    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple());

        Apple apple = box.get();
        System.out.println("apple = " + apple);
    }
}
