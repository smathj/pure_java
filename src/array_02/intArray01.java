package array_02;

public class intArray01 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};

        int[] intArr2 = {6,7,8,9};

        // 1 ~ 5
        for (int i : intArr) {
            System.out.println(i);
        }

        // 6 ~ 9
        for (int i : intArr2) {
            System.out.println(i);
        }

    }
}
