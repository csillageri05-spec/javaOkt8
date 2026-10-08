package sikidomok;

public class Kor {

    private double r;

    public Kor(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public double terulet() {
        return Math.pow(r, 2) * Math.PI;
    }

    public double kerulet() {
        return 2 * r * Math.PI;
    }
}
