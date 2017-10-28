package main;

import processing.core.PApplet;

public class ExampleTriangle extends PApplet {

    public static final int SCREEN_X = 1024;
    public static final int SCREEN_Y = 768;

    public static void main(String[] args) {
        PApplet.main("main.ExampleTriangle");
    }

    @Override
    public void settings() {
        size(SCREEN_X,SCREEN_Y, "processing.opengl.PGraphics2D");
    }

    /**
     *
     * Hilfsfunktion -  diese Funktion testet, ob der Punkt c rechts oder links von der durch
     * die Punkte a und b definierten Geraden liegt (um links und rechts definieren zu können,
     * muss die Gerade natürlich eine Richtung haben - hier ist die Richtung von a nach b)
     *
     * Ergebnis:
     *
     * - ein negativer Wert, falls c rechts von (a...b) liegt
     * - ein positiver Wert, falls c links von (a...b) liegt
     *
     */
    float edgeFunction(Vec2 a, Vec2 b, Vec2 c) {
        Vec2 ab = b.sub(a);
        Vec2 ac = c.sub(a);

        return ac.x * ab.y - ac.y * ab.x;
    }

    /**
     * Diese Methode soll ein Dreieck in der Farbe color zeichnen, v0, v1 und v2 sind die
     * Eckpunkte des Dreiecks.
     */
    public void rasterTriangle(Vec2 v0, Vec2 v1, Vec2 v2, int col) {
        // Zeichnet das Dreieck mit Linien - diesen Code können Sie später auskommentieren
        line(v0.x, v0.y, v1.x, v1.y);
        line(v1.x, v1.y, v2.x, v2.y);
        line(v2.x, v2.y, v0.x, v0.y);


        // TODO: Berechnen Sie die bounding box des Dreiecks
        int minx = 0; // TODO kleinester x-Wert aller Punkte
        int miny = 0; // TODO kleinster y-Wert ...
        int maxx = 0; // TODO ...
        int maxy = 0; // TODO ...

        // TODO jeden Pixel der bounding box besuchen
        // for (int y = ...) {
        //    for (int x = ...) {
        //        TODO Test: gehört der Pixel (x,y) zum Dreieck?
        //        TODO Wenn ja, zeichnen
        //        set(x, y, col);
        //    }
        // }
    }

    @Override
    public void draw() {
        background(255);

        // drei Eckpunkte eines Dreiecks - der dritte Punkt ist die Mausposition
        Vec2 a = Vec2.of(100,100);
        Vec2 b = Vec2.of(100,400);
        Vec2 c = Vec2.of(mouseX, mouseY);

        // Grünes Dreieck rastern
        rasterTriangle(a,b,c, color(0,255,0));
    }

}