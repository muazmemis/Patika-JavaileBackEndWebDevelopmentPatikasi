package Dersler.Bolum6CollectionveMapInterface.Ders7Vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2, "Bolu");

//        System.out.println(vector);
//        System.out.println(vector.contains("Bolu"));

        Iterator<String> itr = vector.iterator();

//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        for (String str : vector) {
            System.out.println(str);
        }
    }
}
