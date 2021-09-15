package Kapitel2;

public class SvgCircle1 {

    //Methoden

    /**
     * Generiert einen randome double , nachdem der Methode zwei double zur Eingrenzung übergeben wurde.
     *
     * @param min für kleinste Zahl
     * @param max für groeßte Zahl
     * @return Zufallszahl zwischen zwei Werten
     * @author Olaf Kulczycki
     */
    public static double gibRadius(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }

    /**
     * Fordert den Nutzer auf einen Wert für cx und cy einzugeben. Die Methode speichert die Variablen für eine spätere
     * Verwendung in Variablen ab.
     *
     * @author Olaf Kulczycki
     */
    public static void getCxCy() {
        System.out.printf("Bitte geben Sie den cx Wert ein.\n");
        int cx = new java.util.Scanner(System.in).nextInt();
        System.out.printf("Bitte geben Sie jetzt den cy Wert ein.\n");
        int cy = new java.util.Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {

        //Variablen deklaration
        int height = 100;
        int width = 1000;
        int cx = 10;
        int cy = 110;
        double min = 0.0;
        double max = 10.0;

        //Befehle
        getCxCy();
        System.out.printf("<svg height=\"" + height + "\"  width=\"" + width + "\" >\n\t<circle cx=\"" + cx +
                "\" cy=\"" + cy + "\" r=\"" + gibRadius(0.0, 10.0) + "\" />\n" + "</svg>");
    }
}
