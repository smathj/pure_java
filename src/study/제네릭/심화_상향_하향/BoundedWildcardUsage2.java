package study.제네릭.심화_상향_하향;

public class BoundedWildcardUsage2 {
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
            // ! Error
            // Toy를 상속하는 와일드 카드인데,  자손타입이 플라스틱 토이, 스틸 토이 등등 많을것이다
            // 정확히 어떤토이가 들어올지 보장못한다
            //  box.set(new Toy());
        }
        
        public static void inBox(Box<? super Toy> box, Toy n) {
            box.set(n);
            // ! Error
            // 자손이(하향제한) Toy인 와이들 카드인데, 부모타입이 너무많다, 따라서 꺼낼때에는 정확한 타입을 한정할 수 없다 (Object으로 받는거 애매하다)
            // Object object = box.get();
        } 
        
    }
    
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
