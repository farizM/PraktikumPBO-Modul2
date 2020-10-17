package com.Fariz.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Smile");
        Lagu lagu2 = new Lagu("Robbery", "Juice WRLD");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
