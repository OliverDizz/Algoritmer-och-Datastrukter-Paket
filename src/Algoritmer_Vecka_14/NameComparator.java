package Algoritmer_Vecka_14;

import java.util.Comparator;

public class NameComparator implements Comparator<Land> {
    @Override
    public int compare(Land o1, Land o2) {
        return ((int) o1.getNamn().charAt(0)) - ((int) o2.getNamn().charAt(0));
    }
}
