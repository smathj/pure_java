package sample.if_for_while_switch_03;

/**
 * Switch 문
 * 1. if else 보다 빠른 성능
 * 2. 코드가 폭포수처럼 위에서 아래로 흐른다
 * 3. 단, break;를 하지않으면 멈추지 않고 아래의 코드도 동작한다
 *    (break 를 주석하고 써보고 확인)
 * 4. 모든 조건에 안맞을때는 반드시 default 분기를 사용해야함
 */
public class switch01 {
    public static void main(String[] args) {

        // v1. 조건에 일치하는게 반드시 있는 경우
        String score = "D";
        switch (score) {
            case "A" :
                System.out.println("A 학점");
                break;
            case "B" :
                System.out.println("B 학점");
                break;
            case "C" :
                System.out.println("C 학점");
                break;
            case "D" : // <-
                System.out.println("D 학점");
                break;
            case "E" :
                System.out.println("E 학점");
                break;
            case "F" :
                System.out.println("F 학점");
                break;
        }



        // v2. 조건에 일치하는게  없는경우 default 분기 필수
        String newScore = "A++";

        switch (newScore) {
            case "A" :
                System.out.println("A 학점");
                break;
            case "B" :
                System.out.println("B 학점");
                break;
            case "C" :
                System.out.println("C 학점");
                break;
            case "D" :
                System.out.println("D 학점");
                break;
            case "E" :
                System.out.println("E 학점");
                break;
            case "F" :
                System.out.println("F 학점");
                break;
            default : // <-
                System.out.println(newScore + " 는 기존에 없던 새로운 학점 입니다");
                break;
        }


    }
}
