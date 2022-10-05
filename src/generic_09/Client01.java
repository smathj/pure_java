package generic_09;

public class Client01 {
    public static void main(String[] args) {
        Book book = new Book("이것이 자바다", "우재남");
        Card card = new Card("우리체크카드", "체크카드");

        // 가방에 담기
        Bag<Book, Card> bag = new Bag<>(book, card);

        // v1.
//        System.out.println(bag.getOne()); // 내부적으로 bag.getOne().toString() 이 호출된다
//        System.out.println(bag.getTwo()); // 내부적으로 bag.getTwo().toString() 이 호출된다

        // v2.
        System.out.println("[Book] : " +bag.getOne().getTitle());
        System.out.println("[Book] : " +bag.getOne().getWriter());

        System.out.println("[Card] : " +bag.getTwo().getName());
        System.out.println("[Card] : " +bag.getTwo().getType());



    }
}
