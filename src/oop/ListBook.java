package oop;

import java.util.ArrayList;
import java.util.List;

// * 객체를 List에 담기
public class ListBook {
    public static void main(String[] args) {
        Book javaBook = new Book("자바책", "자바는 타입을 명시해야합니다");
        Book pythonBook = new Book("파이썬책", "파이선은 타입을 명시하지않습니다");

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(javaBook);
        bookList.add(pythonBook);

        for (Book book : bookList) {
            System.out.println(book);
            System.out.println("[제목] " + book.getTitile());
            System.out.println("[내용] " + book.getContent());
            System.out.println();
        }
    }
}
