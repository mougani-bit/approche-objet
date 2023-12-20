package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

    public static void main(String[] args) {
        ArrayList<Integer> nombre = new ArrayList<>();
        nombre.add(-1);
        nombre.add(5);
        nombre.add(7);
        nombre.add(3);
        nombre.add(-2);
        nombre.add(4);
        nombre.add(8);
        nombre.add(5);
        for (Integer e : nombre) {
            System.out.println(e);
        }
        System.out.println("****************************************");
        System.out.println(nombre.size());
        System.out.println("****************************************");
        System.out.println(Collections.max(nombre));
        System.out.println("****************************************");

        Iterator<Integer> iter = nombre.iterator();
        while (iter.hasNext()) {
            Integer n = iter.next();
            if (n == Collections.min(nombre)) {
                System.out.println(n);
                iter.remove();
            }
        }
        System.out.println(nombre);

        System.out.println("****************************************");
        for (int i = 0; i < nombre.size(); i++) {
            nombre.set(i, Math.abs(nombre.get(i))); // num devient sa valeur absolue ex. valeur absolu |-4| = 4; |-99| =
            // 99, |2| = 2
        }
        System.out.println(nombre);

        System.out.println("****************************************");
        for (Integer n : nombre) {
            System.out.println(n);
        }
    }

}