package Algoritmer_Vecka_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionOps {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Oliver");
        list.add("Alex");
        list.add("Igor");

        print(list);
        list = reverse(list);
        print(list);
    }

    /*---metoder---*/

    public static <T> void print(Collection<T> l) {
        Iterator iterator = l.iterator();
        System.out.print("[");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static <T> List<T> reverse(List<T> list){
        int lastelement = list.size() - 1;
        T temp;

        for (int i = 0; i < lastelement; i++) {
            temp = list.get(lastelement);
            list.remove(lastelement);
            list.add(i, temp);
        }
        return list;
    }

}

