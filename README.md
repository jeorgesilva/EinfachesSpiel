# EinfachesSpiel - Zwei Minispiele in Java

Dieses Projekt implementiert zwei einfache Minispiele in Java:

1.  **Zeitumrechnung:** Umrechnung einer gegebenen Anzahl von Sekunden in das Format Stunden:Minuten:Sekunden.
2.  **Ziffernsumme:** Berechnung der Summe der Ziffern einer nicht-negativen Ganzzahl.

## Spielauswahl

Beim Start des Programms wird der Benutzer aufgefordert, auszuwählen, welches Minispiel er spielen möchte (1 für Zeitumrechnung, 2 für Ziffernsumme).

## Zeitumrechnung

Der Benutzer gibt eine Anzahl von Sekunden ein, und das Programm gibt die entsprechende Zeit im Format HH:MM:SS aus.

### Beispiel

Eingabe: 6734
Ausgabe: 1:52:14

## Ziffernsumme

Der Benutzer gibt eine nicht-negative Ganzzahl ein, und das Programm berechnet die Summe ihrer Ziffern.

### Beispiel

Eingabe: 321
Ausgabe: 6 (weil 3 + 2 + 1 = 6)

## Wie man das Projekt ausführt

1.  Klonen Sie das Repository:

    ```bash
    git clone [https://github.com/ihr-benutzername/EinfachesSpiel.git](https://github.com/ihr-benutzername/EinfachesSpiel.git)
    ```

2.  Öffnen Sie das Projekt in Ihrer bevorzugten Java-IDE (z.B. IntelliJ, Eclipse).

3.  Kompilieren und führen Sie die Datei `EinfachesSpiel.java` aus.

## Hinweise

-   Das Projekt verwendet die Standardeingabe (`Scanner`) für die Benutzerinteraktion.
-   Die Zeitumrechnungshandhabt ungültige Eingaben (negative Sekunden) durch die Rückgabe von "-1:-1:-1".

## Mögliche Erweiterungen

-   **Benutzerfreundlichere Oberfläche:** z.B. durch Verwendung von Swing oder JavaFX statt der Konsoleneingabe.
-   **Weitere Minispiele:** z.B. ein Zahlenratespiel, ein kleines Quiz, etc.
-   **OOP-Design:** z.B. durch die Erstellung von Klassen für die einzelnen Minispiele.
-   **Fehlerbehandlung:** z.B. durch die Validierung der Benutzereingaben, um unerwartete Fehler zu vermeiden.
