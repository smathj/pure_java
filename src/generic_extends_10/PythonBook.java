package generic_extends_10;

public class PythonBook extends Book {
    private String firstCode;
    private String ide = "파이참";

    public PythonBook(String title, String writer, String firstCode) {
        super(title, writer);
        this.firstCode = firstCode;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "PythonBook{" +
                "firstCode='" + firstCode + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}
