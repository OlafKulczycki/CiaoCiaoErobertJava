package Kapitel2;

//Das Programm fragt, wie viele Rumflaschen erbeutet wurden und wie großm die Crew ist.
// Der Captain bekommt immer die Hälfte der Flaschen und der Rest wird unter der Crew aufgeteilt.

public class Aufgabe2_3_2 {
    //Methoden

    public static void main(String[] args) {
        //Variablen
        boolean fair = false;

        //Befehle
        System.out.printf("Aye du Landratte, wie viele Flaschen Rum habt Ihr erbeutet ?\n");
        int bottles = new java.util.Scanner(System.in).nextInt();
        System.out.printf("Wie viele Mitglieder hat unsere Crew gerade ?\n");
        int crew = new java.util.Scanner(System.in).nextInt();
        System.out.printf("ARRRR..... " + bottles + " Flaschen Rum, nicht schlecht.\nDer Captain bekommt demnach " +
                (bottles / 2) + " Pullen Rum.");
        System.out.printf("\nBei der " + crew + " Mann starken Crew bekommt demnach jeder " + ((bottles / 2) / crew) +
                " Pullen Rum.");


    }
}