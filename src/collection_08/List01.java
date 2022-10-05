package collection_08;

import java.util.ArrayList;
import java.util.List;

// ! List 계열
// 1 - 중복 가능
// 2 - 순서 존재
public class List01 {
    public static void main(String[] args) {

        // * 1. or 2. 를 주석하여 결과 확인

        // 1. List 사용
        List<String> aList = new ArrayList<String>();             // new ArrayList<>()     축약 가능

        // 2. ArrayList 사용
//        ArrayList<String> aList = new ArrayList<String>();   // new ArrayList<>()     축약 가능


        aList.add("첫번째");
        aList.add("두번째");
        aList.add("세번째");
        aList.add("첫번째");


        System.out.println("aList.get(0) :" + aList.get(0));
        System.out.println("aList.get(1) :" + aList.get(1));
        System.out.println("aList.get(2) :" + aList.get(2));
        System.out.println("aList.get(3) :" + aList.get(3));
        System.out.println("aList.size() :" + aList.size());


        // * 순서가 보장되는 확인
        // v1
        for (String str : aList) {
            System.out.println(str);
        }


        // v2.
        // * v1, v2 둘중 하나의방법으로 값 꺼내기
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }




    }
}
