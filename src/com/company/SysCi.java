package com.company;

public enum SysCi {
    MILIMETRAS(1000, "mm"),
    CENTIMETRAS(100, "cm"),
    METRAS(1, "m"),
    KILOMETRAS(0.001, "km");

    private double kiekMetruInside;
    private String trumpasPavadinimas;

    SysCi(double kiekMetru, String trumpinis) {
        kiekMetruInside = kiekMetru;
        trumpasPavadinimas = trumpinis;
    }

    public double getKiekMetruInside() {
        return kiekMetruInside;
    }

    public String getTrumpasPavadinimas() {
        return trumpasPavadinimas;
    }
}
