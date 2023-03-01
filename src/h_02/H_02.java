package h_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Tóth Milán
 */
public class H_02 {

    public static void main(String[] args) {
        /*
        int[] szamtomb = new int[4];
        System.out.println(szamtomb);
        System.out.println(Arrays.toString(szamtomb));
        System.out.println(szamtomb[2]);

        szamtomb[2] = 8;
        System.out.println(Arrays.toString(szamtomb));

        for (int i = 0; i < szamtomb.length; i++) {
            System.out.print(szamtomb[i] + " ");
        }

        int[][][] haromd = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        int[][] tombd = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(tombd[1][1]);

        ArrayList<String> gyumolcsok = new ArrayList<>();
        LinkedList<String> gyumolcsok2 = new LinkedList<>();

        gyumolcsok.add("Eper");
        gyumolcsok.add("Alma");

        System.out.println(gyumolcsok);

        gyumolcsok.add(0, "Dinnye");
        System.out.println(gyumolcsok);

        gyumolcsok.add(1, "Banán");
        System.out.println(gyumolcsok);

        gyumolcsok.remove(0);
        System.out.println(gyumolcsok);
        System.out.println(gyumolcsok.get(0));
        System.out.println(gyumolcsok.get(1));
         */

        // Gyakorlás
        LinkedList<Double> lancolt = new LinkedList<>();

        // Ha nem sorrendben adom meg IndexOutOfBoundsException-t kapok
        /*
        lancolt.add(2, 4.4);
        lancolt.add(3, 6.5);
        lancolt.add(1, 2.3);
        lancolt.add(0, 8.8);
        lancolt.add(4, 1.34);
        */
        lancolt.add(0, 8.8);
        lancolt.add(1, 2.3);
        lancolt.add(2, 4.4);
        lancolt.add(3, 6.5);
        lancolt.add(4, 1.34);

        double osszeg = 0;
        for (Double elem : lancolt) {
            osszeg += elem;
        }

        System.out.println("Összeg: " + osszeg);

        lancolt.forEach((elem) -> {
            System.out.println(elem);
        });

        lancolt.remove(3);
        lancolt.set(3, 12.74);

        lancolt.forEach((elem) -> {
            System.out.println(elem);
        });

    }

}
