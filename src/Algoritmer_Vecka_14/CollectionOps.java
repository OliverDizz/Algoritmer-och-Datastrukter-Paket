package Algoritmer_Vecka_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionOps {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Oliver");
        list.add("Alex");
        list.add("Igor");

        print(list);
    }

    /*---metoder---*/

    public static <T> void print(Collection<T> l) {
        var iterator = l.iterator();
        System.out.print("[");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext() == true){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static <T> List<T> reverse(List<T> l){
        //TODO: hela denna
        return l;
    }

}

