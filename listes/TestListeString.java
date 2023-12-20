package listes;

import java.util.Arrays;
import java.util.List;

public class TestListeString {

    public static void main(String[] args) {
        List<String> villes = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille",
                "Tarbes");

        String villeMax = "";
        for (String v : villes) {
            if (v.length() > villeMax.length()) {
                villeMax = v;
            }
        }
        System.out.println(villeMax);

        System.out.println("*************************");

        for (String string : villes) {
            System.out.println(string.toUpperCase());

        }

//		for (int i = 0; i < villes.size(); i++) {
//			if (villes.get(i).startsWith("N")) {
//				villes.remove(i);
//				i--;
//			}
//		}
//		System.out.println(villes);

//		Iterator<String> iter = villes.iterator();
//		while (iter.hasNext()) {
//			String v = iter.next();
//			if (v.startsWith("N")) {
//				iter.remove();
//			}
//		}
        System.out.println(villes);
    }

}