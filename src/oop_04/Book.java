package oop_04;

public class Book {
    private String titile;
    private String content;

    public Book(String titile, String content) {
        this.titile = titile;
        this.content = content;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "titile='" + titile + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
