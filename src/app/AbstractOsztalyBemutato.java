package app;

import allatok.Allat;
import allatok.Kutya;
import allatok.Macska;
import sikidomok.Kor;
import sikidomok.Sikidom;
import sikidomok.Teglalap;

public class AbstractOsztalyBemutato {

    public static void main(String[] args) {
        //AllatosBemutato();

        SikidomokBemutato();

    }

    private static void SikidomokBemutato() {
        Kor kor = new Kor(Math.E);
        double r = kor.getR();
        double k = kor.kerulet();
        double t = kor.terulet();
        System.out.println("Kör adatai:");
        System.out.printf("Kör sugara: %.2f\nKör kerülete: %.2f\nKör területe: %.2f\n", r, k, t);

        Teglalap teglalap = new Teglalap(3, 4);
        int a = teglalap.getA();
        int b = teglalap.getB();
        double tk = teglalap.kerulet();
        double tt = teglalap.terulet();
        System.out.println("tégla adatai:");
        System.out.printf("téglalap a: %d\ntéglalap b: %d\ntéglalap kerülete: %d\ntéglalap területe: %d\n", a, b, tk, tt);

        Sikidom[] sikidomok = {kor, teglalap};
        for (Sikidom sikidom : sikidomok) {
            sikidom.teruletKiir();
        }

    }

    private static void AllatosBemutato() {
        Allat allatAkiKutya = new Kutya("KutyaÁllat");
        Allat allatAkiMacska = new Macska("MacskaÁllat");

        Kutya k1 = new Kutya("Dobby");
        Kutya k2 = new Kutya("Félix");
        k1.eszik();
        k1.hangotAd();
        k2.eszik();
        k2.hangotAd();

        Macska m1 = new Macska("Poppy");
        Macska m2 = new Macska("Feline");
        m1.eszik();
        m1.hangotAd();
        m2.eszik();
        m2.hangotAd();

        Kutya[] kutyak = {k1, k2, new Kutya("Pizsi")};
        Macska[] macskak = {m1, m2, new Macska("Cirmi")};
        Allat[] allatok = {allatAkiKutya, allatAkiMacska, k1, m1, k2, m2};

        System.out.println("Állatok, akik esznek: ");
        for (Allat allat : allatok) {
            allat.eszik();
            allat.hangotAd();
        }

    }
}
