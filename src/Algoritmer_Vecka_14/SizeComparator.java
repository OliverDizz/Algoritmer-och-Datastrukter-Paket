package Algoritmer_Vecka_14;

import java.util.Comparator;

public class SizeComparator implements Comparator<Land> {
    @Override
    public int compare(Land o1, Land o2) {
        return o1.getYta() - o2.getYta();
    }
}
