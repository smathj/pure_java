package generic_extends;

public class Client {
    public static void main(String[] args) {
        System.out.println();

        JavaBook javaBook = new JavaBook("처음하는 자바프로그래밍", "오정임", "sout('hello world')");
        Bag<JavaBook> bag = new Bag<>(javaBook);    // new Bag<JavaBook>(javaBook) 를 생략 한 것임

        System.out.println(bag.getOne());               // 내부적으로 bag.getOne().toString() 이 호출된다
        System.out.println(bag.getOne().getTitle());        // Book 클래스의 상속받은 메서드
        System.out.println(bag.getOne().getWriter());       // Book 클래스의 상속받은 메서드
        System.out.println(bag.getOne().getFirstCode());    // JavaBook 클래스만의 메서드


        System.out.println();

        PythonBook pythonbook = new PythonBook("Do It 파이썬", "홍길동", "print('hello world'");
        Bag<PythonBook> bag2 = new Bag<>(pythonbook);

        System.out.println(bag2.getOne());               // 내부적으로 bag.getOne().toString() 이 호출된다
        System.out.println(bag2.getOne().getTitle());        // Book 클래스의 상속받은 메서드
        System.out.println(bag2.getOne().getWriter());       // Book 클래스의 상속받은 메서드
        System.out.println(bag2.getOne().getFirstCode());    // PythonBook 클래스만의 메서드

        System.out.println();


        String str = "아래코드 주석풀면 에러발생 이유는 Book의 자식(상속관계)가 아니라서";
        // Bag<String> bag3 = new Bag<>(str);
        //       ↑
        // ! String 클래스는 Book 클래스의 자식이 아니다.
    }
}
