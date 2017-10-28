# Dreiecke rastern
Eine kurze Aufgabe für die Vorlesung Computergrafik I - dies ist eine IntelliJ-Projekt, Sie können dieses Repository entweder mit

    git clone https://github.com/n0c1urne/cg_aufgabe2.git

klonen und dann in IntelliJ öffnen. Wenn Sie git nicht installiert haben, dann können Sie es stattdessen auch als Archiv runterladen und lokal entpacken.

Für die grafische Ausgabe verwendet dieses Projekt die Java-Libraries von Processing (diese finden sich im Ordner `lib/`). Wenn Sie lieber Eclipse verwenden, findet sich hier ein Tutorial zur Einrichtung von den Processing-Libraries unter Eclipse: https://processing.org/tutorials/eclipse/

In dieser Aufgabe soll eine Methode `rasterTriangle` vervollständigt werden, diese soll die Pixel eines Dreiecks in einer gegebenen Farbe rastern.

Gehen Sie dabei wie folgt vor:

- berechnen Sie die _bounding box_ des Dreiecks (ein Rechteck, welches das Dreieck umschliesst)

- Iterieren Sie über alle Pixel der _bounding box_.

- entscheiden Sie für jeden Pixel innerhalb der _bounding box_: Gehört der Pixel zum Dreieck? Wenn ja, zeichnen Sie den Pixel in der übergebenen Farbe. Wie diese Entscheidung getroffen werden kann, wurde im Chat gezeigt. Die bereits gegebene Methode `edgeFunction` muss dabei verwendet werden.

Für Vektorrechnung ist eine Klasse `Vec2` gegeben (diese sollte in der vorherigen Aufgabe implementiert werden, die Methoden sind hier alle implementiert), allerdings werden Sie diese kaum selbst benötigen - sie wird aber im gegebenen Code benutzt. 

Viel Spass, bei Fragen können Sie sich gern im Forum an mich wenden.