package Kapitel2;

/**
 * Aufgabe 2.3.4 aus dem Buch.
 * Aufgaben:
 * - Lege eine neue Klasse CoinMachine an.
 * - Das Programm soll eine Fließkommerzahl für einen Geldbetrag fordern.
 * - Gib aus wie viele jeweilige münzen verwendet werden.
 */
public class CoinMachine {

    public static void main(String[] args) {
        System.out.printf("Bitte geben sie Ihren Betrag an.\n");
        double input = new java.util.Scanner(System.in).nextDouble();
        int geldBetrag = (int) (input * 100);

        System.out.printf(geldBetrag / 200 + " x 2 €\n");
        geldBetrag %= 200;

        System.out.printf(geldBetrag / 100 + " x 1 €\n");
        geldBetrag %= 100;

        System.out.printf(geldBetrag / 50 + " x 50 Cent\n");
        geldBetrag %= 50;

        System.out.printf(geldBetrag / 20 + " x 20 Cent\n");
        geldBetrag %= 20;

        System.out.printf(geldBetrag / 10 + " x 10 Cent\n");
        geldBetrag %= 10;

        System.out.printf(geldBetrag / 5 + " x 5 Cent\n");
        geldBetrag %= 5;

        System.out.printf(geldBetrag / 2 + " x 2 Cent\n");
        geldBetrag %= 2;

        System.out.printf(geldBetrag + " x 1 Cent");
    }
}
