package main;

public class Vec2 {
    /**
     * Vektoren sind unveränderlich - jede Rechenoperation erzeugt einen neuen Vektor
     * x und y werden also bei Konstruktion einmal gesetzt und sind dann unveränderlich
     */
    public final float x;
    public final float y;

    /**
     * Konstruktor privat - wir nutzen eine einfache Factory-Methode of zur Erzeugung
     */
    private Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Factory-Methode:
     *
     *     Vec2 v = Vec2.of(2,3);
     *
     *  erzeugt den Vektor (2,3)
     */
    public static Vec2 of(float x, float y) {
        return new Vec2(x,y);
    }

    public Vec2 add(Vec2 other) {
        return Vec2.of(x + other.x, y+other.y);
    }

    public Vec2 sub(Vec2 other) {
        return add(other.neg());
    }

    public Vec2 mult(float d) {
        return Vec2.of(d*x, d*y);
    }

    public Vec2 div(float d) {
        return mult(1/d);
    }

    public Vec2 neg() {
        return mult(-1);
    }

    public float length() {
        return (float)Math.sqrt(skalarProd(this));
    }

    public Vec2 unit() {
        return div(length());
    }

    // Skalarprodukt
    public float skalarProd(Vec2 other) {
        return x*other.x + y *other.y;
    }


    /**
     * String-Darstellung für Debug-Ausgabe
     */
    @Override
    public String toString() {
        return "Vec2 {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * wie genau vergleichen wir? Wird in der equals-Methode verwendet
     */
    private static final float EPSILON = 0.0001f;

    /**
     * Vergleich mit anderen Vektoren
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vec2 vec2 = (Vec2) o;

        if (Math.abs(vec2.x -  x) > EPSILON) return false;
        return Math.abs(vec2.y -  y) < EPSILON;
    }
}
