package generic_extends_10;

// * 가방에는 한개의 책종류만 담을 수 있는 가방 ( 책이기만하면 어떤 책이든 상관없음 )
public class Bag<T extends Book> {
    private T one;

    public Bag(T one) {
        this.one = one;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "one=" + one +
                '}';
    }
}
