package com.Fariz.Modul2.Polimorfisme;

public class Lagu {
    public String judul, pencipta;

    //overloading
    public Lagu(String judul) {
        this.judul = judul;
    }

    //overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t\t: "+judul);
        System.out.println("pencipta\t: "+pencipta);
        System.out.println();
    }
}
