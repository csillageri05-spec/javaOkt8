package sikidomok;

public class Teglalap extends Sikidom{

    private int a;
    private int b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double terulet() {
        return a * b;
    }

    public double kerulet() {
        return 2 * a + 2 * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
