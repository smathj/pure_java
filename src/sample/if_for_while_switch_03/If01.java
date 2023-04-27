package sample.if_for_while_switch_03;

// * if, else, else-if
public class If01 {
    public static void main(String[] args) {

        if(true) {
            System.out.println("ture 이면 항상 실행");
        } else {
            System.out.println("이부분은 절대 도달 할 수 없음");
        }

        if (!false) {
            System.out.println("!false 이면 항상 실행");
        } else {
            System.out.println("이부분은 절대 도달 할 수 없음");
        }

        // v2. else if
        int a = 1;

        if(a == 2) {
            System.out.println("a는 2입니다");
        } else if (a == 3) {
            System.out.println("a는 3입니다");
        } else if (a == 4) {
            System.out.println("a는 4입니다");
        } else if (a == 5) {
            System.out.println("a는 5입니다");
        } else {
            System.out.println("a는 2 or 3 or 4 or 5 가 아닙니다");
        }


    }
}
