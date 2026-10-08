package sikidomok;

public abstract class Sikidom {

    public Sikidom() {
    }

    public abstract double kerulet();

    public abstract double terulet();

    public void teruletKiir() {
        System.out.println("terulet: " + terulet());
    }
}
