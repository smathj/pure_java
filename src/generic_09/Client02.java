package generic_09;

// Bag<T,N> 의 T,N 자리는 모든타입이 올 수 있다
public class Client02 {
    public static void main(String[] args) {
        Book book = new Book("이것이 자바다", "우재남");

        // 가방에 담기
        Bag<Book, String> bag = new Bag<>(book, "아무거나 다 들어갈 수 있음");

        // v1.
//        System.out.println(bag.getOne());
//        System.out.println(bag.getTwo());

        // v2.
        System.out.println("[Book] : " +bag.getOne().getTitle());
        System.out.println("[Book] : " +bag.getOne().getWriter());

        System.out.println("[String] : " +bag.getTwo());



    }
}
