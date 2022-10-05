package collection_08;

import java.util.Arrays;
import java.util.List;

// * Array 를 List로 바꾸는 간단한 API
public class List02 {
    public static void main(String[] args) {

        String[] strArr = new String[]{"사과","배", "귤"};
        List<String> list = Arrays.asList(strArr);  // 배열을 List로 바꾸는 API

        for (String str : list) {
            System.out.println(str);
        }

    }
}
