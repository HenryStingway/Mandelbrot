import java.util.Scanner;
import java.lang.Math;

public class Mandelbrot {

    private static double RealtSetter(){
        double frealt;
        Scanner input = new Scanner(System.in);
        //Userabfrage -> Eingabe c bestehend aus realt und imgt
        System.out.println("c = Realteil + Imaginaerteil * i");
        System.out.println("Eingabe Realteil:");
        frealt = input.nextDouble();
        return frealt;
    }

    private static double ImgtSetter() {
        double fimgt;
        Scanner input = new Scanner(System.in);
        System.out.println("Eingabe Imaginaerteil ohne i:");
        fimgt = input.nextDouble();
        return fimgt;
    }

    private static void Iteration(double realt, double imgt) {
        double zreal, zimg;
        int zaehler = 0;

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

    public static void main(String[] args) {
        double realt;
        double imgt;

        realt = Mandelbrot.RealtSetter();
        imgt = Mandelbrot.ImgtSetter();
        Mandelbrot.Iteration(realt, imgt);

    }

}
