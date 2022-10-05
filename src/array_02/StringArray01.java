package array_02;

public class StringArray01 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"1", "2", "3", "4"};

        for (String s : strArr) {
            System.out.print(s + "\t");
        }


        String[] strArrSizeFive = new String[5];
        strArrSizeFive[0] = "하나";
        strArrSizeFive[1] = "둘";
        strArrSizeFive[2] = "셋";
        strArrSizeFive[3] = "넷";
        strArrSizeFive[4] = "다섯";
        // strArrSizeFive[0] = "여섯"; // 주석을 풀면 에러 발생

        for (String s : strArrSizeFive) {
            System.out.print(s + "\t");
        }
    }
}
