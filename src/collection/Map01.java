package collection;

import java.util.*;

// ! Map 계열
// 1 - 중복된 값이 가능하며
// 2 - 순서 없음
// 3 - Key / Value 형태로 저장
public class Map01 {
    public static void main(String[] args) {

        // * 1. or 2. 를 주석하여 결과 확인

        // 1. Map
        Map<String, String> aMap = new HashMap<>(); // new HashMap<String,String>() 사용 가능

        // 2. HashMap
//        HashMap<String, String> aMap = new HashMap<>(); // new HashMap<String,String>() 사용 가능

        aMap.put("사과박스", "사과");
        aMap.put("귤박스", "귤");
        aMap.put("과자박스", "빼뺴로");


        System.out.println("aMap.get(\"사과박스\") :" + aMap.get("사과박스"));;
        System.out.println("aMap.get(\"귤박스\") :" + aMap.get("귤박스"));;
        System.out.println("aMap.get(\"과자박스\") :" + aMap.get("과자박스"));;
        System.out.println("aMap.size() : " + aMap.size());;
        System.out.println();




        // 반복문을 통해서 값을 꺼내고싶다면 아래처럼 사용해야함
        Set<String> keys = aMap.keySet();
        Iterator<String> itr = keys.iterator();

        // Key 이름만 출력
        System.out.println("[1]");
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("[key] : " + key);                                           // 키만 출력하고 싶다면 , 주석해제 하고 아랫부분 주석
//            System.out.println("[key] : " + key + ", [value] : " + aMap.get(key) + "\t");   // key & value
        }
        System.out.println();


        Collection<String> values = aMap.values();
        Iterator<String> itr2 = values.iterator();

        // Value 값만 출력
        System.out.println("[2]");
        while (itr2.hasNext()) {
            System.out.println("[value] :" +itr2.next());
        }
        System.out.println();

    }
}
