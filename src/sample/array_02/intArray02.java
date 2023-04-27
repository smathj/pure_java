package sample.array_02;

public class intArray02 {
    public static void main(String[] args) {
        int[] intArr = new int[10]; // 사이즈가 10인 int형 배열 
        
        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 3;
        intArr[4] = 4;
        intArr[5] = 5;
        intArr[6] = 6;
        intArr[7] = 7;
        intArr[8] = 8;
        intArr[9] = 9;
        
        // intArr[10] = 10;    // <-------------- 주석을 풀면 에러가 발생

        for (int i : intArr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        


    }
}
