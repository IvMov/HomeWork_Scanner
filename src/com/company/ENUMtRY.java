package com.company;

public class ENUMtRY {
    public static void main(String[] args) {
        float atstumas = 5.0f;

        System.out.println(SysCi.METRAS.getKiekMetruInside() * atstumas + SysCi.METRAS.getTrumpasPavadinimas());
        System.out.println(SysCi.CENTIMETRAS.getKiekMetruInside() * atstumas + SysCi.CENTIMETRAS.getTrumpasPavadinimas());
        System.out.println(SysCi.KILOMETRAS.getKiekMetruInside() * atstumas + SysCi.KILOMETRAS.getTrumpasPavadinimas());
    }
}
