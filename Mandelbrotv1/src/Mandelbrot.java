import java.util.Scanner;
import java.lang.Math;

public class Mandelbrot {
    public static void main(String args[]){
        //Variablendeklaration
        double realt;
        double imgt;
        int zaehler = 0;
        double zreal = 0;
        double zimg = 0;
        Scanner input = new Scanner(System.in);

        //Userabfrage -> Eingabe c bestehend aus realt und imgt
        System.out.println("c = Realteil + Imaginaerteil * i");
        System.out.println("Eingabe Realteil:");
        realt = input.nextDouble();
        System.out.println("Eingabe Imaginaerteil ohne i:");
        imgt = input.nextDouble();

        //Zuweisung Zreal, Zimg
        zreal = realt;
        zimg = imgt;

        //Z0 und Z1 als Ausnahmen
        if(zaehler == 0){
            System.out.println(zaehler + "  | 0" );
            zaehler++;
        }
        if(zaehler == 1){
            System.out.println(zaehler + "  | (" + zreal + ") + (" + zimg + ") * i");
            zaehler++;
        }

        //Berechnung Iteratoren
        while(zaehler <= 50){
            //z = Math.pow(realt , imgt);
            double xz = zreal; // Hilfsvariablen für spaetere Berechnung
            double yz = zimg;
            zreal = Math.pow(xz, 2) - Math.pow(yz, 2) + realt;

            zimg = (2.00 * xz * yz) + imgt;

            //Ausgabe
            if(zaehler < 10) {
                System.out.println(zaehler + "  | (" + zreal + ") + (" + zimg + ") * i");
            }
            else {
                System.out.println(zaehler + " | (" + zreal + ") + (" + zimg + ") * i");
            }
            zaehler++;
        }


    }
}
