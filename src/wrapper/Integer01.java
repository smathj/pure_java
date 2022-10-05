package wrapper;

public class Integer01 {
    public static void main(String[] args) {

        // 기본 자료형의 int
        int[] intArr = new int[]{1,2,3,4,5,6,7,8};

        // Wrapper Class인 Integer ( 간단하게, null 이 가능한 타입임 )
        Integer[] first = new Integer[2];
        first[0] = 1;
        first[1] = 2;

        // v1.
        for (Integer integer : first) {
            System.out.print(integer.intValue() + "\t");
        }


        Integer[] second = {3,4,5, null};   // null이 들어감

        // v2.
        for (Integer integer : second) {
//            System.out.print(integer.intValue() + "\t");    // 5 출력후 null이 나와서 "null.intValue()" 를 호출하여 에러가 발생하면 정상 ( 정확하게 int 로 출력 )
                                                            // ! [Error Message] Exception in thread "main" java.lang.NullPointerException
            System.out.print(integer);                          // 이걸 사용하면 null 그자체도 출력된다
        }


        /**
         * String 도 null을 대입할 수 있으며,
         * 기본 타입은 long  - 랩퍼 클래스 Long
         *            float - 랩퍼 클래스 Float
         *            ....
         *  모든 기본 자료형에 대하여 대문자형태 비슷하게 존재한다
         */


        /**
         * * 다음 두개의 형태의 변환 (형변환)을 박싱/언박싱이라고 말한다 (근데 개발자가 쓸대는 막써도 저절로 알아서 잘 변환된다 "오토박싱" 이 이루어진다) 자세한건 책을 보는게 나음
         * int -> Integer 박싱
         * int <- Integer 언박싱
         */

    }
}
