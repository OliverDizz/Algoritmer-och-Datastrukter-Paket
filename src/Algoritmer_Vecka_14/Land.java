package Algoritmer_Vecka_14;

public class Land {
    private String namn;
    private int invanare;
    private int yta;
    private String huvudstad;

    public Land(String initNamn, int initInvanare, int initYta, String initHuvudstad) {
        namn = initNamn;
        invanare = initInvanare;
        yta = initYta;
        huvudstad = initHuvudstad;
    }

    public String toString(){
        return namn +  " " + invanare + " " + yta + " " + huvudstad;
    }

    public String getNamn(){
        return namn;
    }

    public int getInvanare(){
        return invanare;
    }

    public int getYta(){
        return yta;
    }
}


