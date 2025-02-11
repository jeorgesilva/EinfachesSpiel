package simplegame;

import java.util.Scanner;

/**
 * In dieser Aufgabe implementieren Sie ein einfaches Spiel. Dieses Spiel bietet 2 Optionen für den Benutzer. Basierend auf der Benutzereingabe kann der Benutzer entweder die Zeit von Sekunden in Stunden, Minuten und Sekunden umrechnen oder die Summe aller Ziffern einer ganzen Zahl berechnen.
 * 
 * Zu Beginn des Spiels wird der Benutzer aufgefordert, entweder 1 oder 2 einzugeben, um anzugeben, welche Option des Spiels er spielen möchte. 1 steht für die Zeitumrechnung, und 2 steht für die Berechnung der Ziffernsumme.
 * 
 * Für die Zeitumrechnung wird der Benutzer aufgefordert, eine Anzahl von Sekunden (als int) einzugeben. Das Programm ruft dann eine Methode auf, die die Sekunden in das Format Stunden:Minuten:Sekunden umrechnet und das Ergebnis ausgibt. Zum Beispiel: Wenn der Benutzer 6734 eingibt, gibt das Programm die Zeit 1:52:14 aus. Ein weiteres Beispiel: Wenn der Benutzer 10.000 eingibt, sollte das Programm 2:46:39 ausgeben.
 * 
 * Für die Berechnung der Ziffernsumme wird der Benutzer aufgefordert, eine Zahl (als nicht-negative Ganzzahl) einzugeben. Das Programm ruft dann eine Methode auf, um die Summe der Ziffern dieser Zahl zu berechnen und das Ergebnis auszugeben. Zum Beispiel: Wenn der Benutzer 321 eingibt, gibt das Programm die Summe 6 aus, weil die einzelnen Ziffern in der Zahl 6 ergeben. 3 + 2 + 1 = 6.
 */
public class EinfachesSpiel {

	/**
	 * Methode zur Umrechnung der gegebenen Sekunden in Stunden:Minuten:Sekunden.
	 * @param sekunden zu konvertierende Sekunden
	 * @return String für die konvertierte Zeit im Format: 23:59:59
	 * 
	 * Beispiel(e):
	 * - Wenn die eingegebenen Sekunden 1432 sind, wird die Ausgabe im Format 0:23:52 zurückgegeben.
	 * - Wenn die eingegebenen Sekunden 0 sind, wird die Ausgabe im Format 0:0:0 zurückgegeben.
	 * - Wenn die eingegebenen Sekunden ungültig sind (negativ), wird -1:-1:-1 zurückgegeben.
	 */
	public String zeitUmrechnen(int sekunden) {
		if (sekunden < 0) {
			return "-1:-1:-1";
		}
		int stunden = sekunden / 3600;
		int minuten = (sekunden % 3600) / 60;
		int sekundenRest = sekunden % 60;
		return stunden + ":" + minuten + ":" + sekundenRest;
	}

	/**
	 * Methode zur Berechnung der Summe aller Ziffern der gegebenen nicht-negativen Ganzzahl.
	 * @param zahl die Zahl, deren Ziffern summiert werden sollen
	 * @return die Summe aller Ziffern der Zahl
	 * 
	 * Beispiel(e):
	 * - Wenn die Eingabe 565 ist, wird 16 zurückgegeben.
	 * - Wenn die Eingabe 7 ist, wird 7 zurückgegeben.
	 * - Wenn die Eingabe 0 ist, wird 0 zurückgegeben.
	 */
	public int ziffernSumme(int zahl) {
		int summe = 0;
		while (zahl > 0) {
			summe += zahl % 10;
			zahl /= 10;
		}
		return summe;
	}

	public static void main(String[] args) {
		EinfachesSpiel spiel = new EinfachesSpiel();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie 1 ein, um die Zeit umzurechnen, oder 2, um die Ziffernsumme zu berechnen:");
		int auswahl = scanner.nextInt();

		if (auswahl == 1) {
			System.out.println("Geben Sie die Anzahl der Sekunden ein:");
			int sekunden = scanner.nextInt();
			System.out.println("Umgerechnete Zeit: " + spiel.zeitUmrechnen(sekunden));
		} else if (auswahl == 2) {
			System.out.println("Geben Sie eine nicht-negative Ganzzahl ein:");
			int zahl = scanner.nextInt();
			System.out.println("Summe der Ziffern: " + spiel.ziffernSumme(zahl));
		} else {
			System.out.println("Ungültige Auswahl.");
		}

		scanner.close();
	}
}
