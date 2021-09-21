package Kapitel2;

//Das Programm liest zwei Zahlen ein. Wenn diese über 100 liegen, so wird die Zahl auf die letzten beiden Ziffern gekürzt
// (bspw. 122 --> 22). Dannach werden die zwei Zahlen in vier aufgeteilt (jeweils vordere und hintere Zahl). Anschließend
//wird geprüft, ob die beiden Zahlen eine gemeinsame Ziffer haben.

public class Aufgabe2_3_3 {

    public static void main(String[] args) {
        System.out.printf("Bitte geben sie zwei Zahlen zwischen 0 und 99 ein.\n");
        int zahl1 = new java.util.Scanner(System.in).nextInt() % 100;// bspw. eingabe 355 ---> Ergebniss 55
        int zahl2 = new java.util.Scanner(System.in).nextInt() % 100;// Gibt also den Rest wieder der nicht durch Hundert teilbar ist.

        int zahl1Version1 = zahl1 / 10;// Vordere Zahl als Ergebniss bspw. 12 ---> 1
        int zahl1Version2 = zahl1 % 10;// Hintere Zahl als Ergebniss bspw. 45 ---> 5
        int zahl2Version1 = zahl2 / 10;
        int zahl2Version2 = zahl2 % 10;

        if (zahl1Version1 == zahl2Version1 || zahl1Version1 == zahl2Version2)
            System.out.println("Die erste Zahl " + zahl1 + " hat eine gemeinsame Ziffer mit " + zahl2);
        else if (zahl1Version2 == zahl2Version1 || zahl1Version2 == zahl2Version2)
            System.out.println("Die erste Zahl " + zahl1 + " hat eine gemeinsame Ziffer mit " + zahl2);
        else
            System.out.printf("Die beiden Zahlen haben keine gemeinsame Ziffer.");
    }
}

