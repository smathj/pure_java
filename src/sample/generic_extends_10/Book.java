package sample.generic_extends_10;

// * 책 ( 제목, 저자 )
public class Book {

    private String title;
    private String writer;

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
