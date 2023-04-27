package sample.if_for_while_switch_03;

import java.util.ArrayList;
import java.util.List;

// * for, 향상된 for문
public class for01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("집");
        list.add("가");
        list.add("고");
        list.add("싶");
        list.add("다");

        // v1. "집가고싶다" 출력
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
//        System.out.println();



        // v2. "가고싶다" 출력
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("집")) {
//                continue;
//            }
//            System.out.print(list.get(i));
//        }
//        System.out.println();



        // v3. "집" 출력
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("집")) {
                System.out.print(list.get(i));
                break;
            }
        }
        System.out.println();



        // v4. "집가고싶다" 출력   ( 향상된 for 문 )
//        for (String s : list) {
//            System.out.print(s);
//        }
//        System.out.println();

    }
}
