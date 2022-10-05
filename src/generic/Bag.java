package generic;

// * 가방에는 두개의 물건을 담을 수 있다는 설정
public class Bag<T,N> {
    private T one;
    private N two;


    @Override
    public String toString() {
        return "Bag{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }

    public Bag(T one, N two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public N getTwo() {
        return two;
    }

    public void setTwo(N two) {
        this.two = two;
    }
}
