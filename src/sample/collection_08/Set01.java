package sample.collection_08;

import java.util.HashSet;
import java.util.Set;

// ! Set 계열
// 1 - 중복 불가능
// 2 - 순서 X
public class Set01 {
    public static void main(String[] args) {

        // * 1. or 2. 를 주석하여 결과 확인

        // 1. Set
        Set<String> aSet = new HashSet<>(); // new HashSet<String>() 와 같음


        // 2. HashSet
//        HashSet<String> aSet = new HashSet<String>(); // new HashSet<String>() 와 같음
        aSet.add("사과");
        aSet.add("배");
        aSet.add("귤");
        aSet.add("사과");

        // size는 4가아닌 3이 나온다
        System.out.println("aSet.size() : " + aSet.size()); // 3

        // 값 확인
        for (String str : aSet) {
            System.out.println(str);
        }



    }
}
