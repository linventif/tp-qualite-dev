package fr.but3;

public class Boule extends Bloc {
    protected double r;

    public Boule(double mv, double r) {
        super(mv);
        this.r = r;
    }

    public double volume() {
        return Math.PI * r * r * r * 4 / 3;
    }
}