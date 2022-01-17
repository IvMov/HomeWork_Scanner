package com.company;

public enum Diena {
    PIRMADIENIS(1, "P"),
    ANTRADIENIS(2, "A"),
    TRECIADIENIS(3, "T"),
    KETVIRTADIENIS(4, "K"),
    PENKTADIENIS(5, "Pt"),
    SESTADIENIS(6, "Š"),
    SEKMADIENIS(7, "S");

    private int kelintadienis;
    private String trumpasPavadinimas;

    Diena(int dienaNr, String trumpinis) {
        kelintadienis = dienaNr;
        trumpasPavadinimas = trumpinis;
    }

    public int getKelintadienis() {
        return kelintadienis;
    }

    public String getTrumpasPavadinimas() {
        return trumpasPavadinimas;
    }
}
