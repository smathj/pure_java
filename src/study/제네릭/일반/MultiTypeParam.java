package study.제네릭.일반;



public class MultiTypeParam {
    public static class DBox<L,R> {
        private L left;
        private R right;

        public void set(L l, R r) {
            this.left = l;
            this.right = r;
        }

        @Override
        public String toString() {
            return left + "&" + right;
        }
    }

    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<>();
        box.set("시발", 119);
        System.out.println("box = " + box);

    }
}
