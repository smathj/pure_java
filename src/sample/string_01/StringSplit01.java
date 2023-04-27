package sample.string_01;

import java.util.Arrays;
import java.util.List;

public class StringSplit01 {
    public static void main(String[] args) {
        String phone = "010-2073-5689";
        String[] onlyNum = phone.split("-");    // ["010", "2073", "5689"]

        // 구분자로 나눈걸 다시 이어붙일때 사용하는 방법
        String phoneNumberString = String.join("", phone.split("-"));
        int phoneNumberInt = Integer.parseInt(String.join("", phone.split("-")));

        System.out.println("phoneNumberInt = " + phoneNumberInt);
        System.out.println("phoneNumberString = " + phoneNumberString);

        // 값 옳은지 확인
        System.out.println(onlyNum[0].equals("010"));   // true
        System.out.println(onlyNum[1].equals("2073"));  // true
        System.out.println(onlyNum[2].equals("5689"));  // true


        // 반복문으로 확인
        for (String str : onlyNum) {
            System.out.println(str);
        }




        // List로 형변환
        List<String> list = Arrays.asList(onlyNum);
        for (String s : list) {
            System.out.println(s);
        }





    }
}
