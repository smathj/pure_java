package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> copyFromA = List.copyOf(a);


        a.remove(0);

        System.out.println("a = " + a);

        System.out.println("copyFromA = " + copyFromA);




    }
}
