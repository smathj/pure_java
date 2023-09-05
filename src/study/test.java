package study;


import java.io.File;

public class test {

    public static void main(String[] args) {


//        File file = new File("\\\\192.168.10.35\\qr");
        File file = new File("\\qr");
        if (!file.exists()) {
            System.out.println("폴더를 생성합니다");
            boolean mkdirs = file.mkdirs();
            System.out.println("mkdirs = " + mkdirs);
        }


    }
}
