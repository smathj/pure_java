package sample.if_for_while_switch_03;

// * while , do-while
public class while01 {
    public static void main(String[] args) {

        int i = 1;

        // v1. 1-10 출력
//        while (i <= 10) {
//            System.out.print(i + "\t");
//            i++;
//        }
//        System.out.println();


        // v2. 1-5 출력
//        while (i <= 10) {
//            System.out.print(i + "\t");
//            if(i == 5) {
//                break;
//            }
//            i++;
//        }
//        System.out.println();


        // v3. do-while은 일단 첫 1회는 무조건 실행 한다
//        int a = 1;
//        do {
//            System.out.print(a + "\t");
//            a++;
//        } while(a < 10);
//        System.out.println();


        // v4. do-while은 일단 첫 1회는 무조건 실행 한다, 그래서 b는 1 보다 크지만 실행된다
        int b = 10;
        do {
            System.out.print(b + "\t");
            b++;
        } while(b < 1);
        System.out.println();



    }
}
