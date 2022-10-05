package generic_extends;

// * Book 클래스의 메서드는 그대로 다 쓸 수 있다, 필요에 따라서 오버라이딩을 통해 수정하자
public class JavaBook extends Book {

    private String firstCode;
    private String ide = "인텔리제이";

    public JavaBook(String title, String writer, String firstCode) {
        super(title, writer);
        this.firstCode = firstCode;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }
}
