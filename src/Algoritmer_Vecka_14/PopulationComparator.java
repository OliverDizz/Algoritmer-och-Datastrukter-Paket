package Algoritmer_Vecka_14;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Land> {
    @Override
    public int compare(Land o1, Land o2) {
        return o1.getInvanare() - o2.getInvanare();
    }
}
