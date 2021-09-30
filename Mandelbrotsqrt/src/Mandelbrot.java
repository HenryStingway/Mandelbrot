import java.util.Scanner;
import java.lang.Math;

public class Mandelbrot {

    private static double RealtSetter(){
        double frealt;
        Scanner input = new Scanner(System.in);
        //Userabfrage -> Eingabe c bestehend aus realt und imgt
        System.out.println("c = Realteil + ImaginaerteilY * i + ImaginaerteilZ * j");
        System.out.println("Eingabe Realteil:");
        frealt = input.nextDouble();
        return frealt;
    }

    private static double ImgtYSetter() {
        double fimgty;
        Scanner input = new Scanner(System.in);
        System.out.println("Eingabe ImaginaerteilY ohne i:");
        fimgty = input.nextDouble();
        return fimgty;
    }

    private static double ImgtZSetter() {
        double fimgtz;
        Scanner input = new Scanner(System.in);
        System.out.println("Eingabe ImaginaerteilZ ohne j:");
        fimgtz = input.nextDouble();
        return fimgtz;
    }

    private static void Iteration(double realt, double imgty, double imgtz) {
        double zreal, zimgy, zimgz;
        int zaehler = 0;

        //Zuweisung Zreal, Zimgy, Zimgz
        zreal = realt;
        zimgy = imgty;
        zimgz = imgtz;

        //Z0 und Z1 als Ausnahmen
        if(zaehler == 0){
            System.out.println(zaehler + "  | 0" );
            zaehler++;
        }
        if(zaehler == 1){
            System.out.println(zaehler + "  | (" + zreal + ") + (" + zimgy + ") * i + (" + zimgz + ") * j");
            zaehler++;
        }

        //Berechnung Iteratoren
        while(zaehler <= 50){

            double xz = zreal; // Hilfsvariablen für spaetere Berechnung
            double yz = zimgy;
            double zz = zimgz;

            zreal = Math.pow(xz, 2) - Math.pow(yz, 2) - Math.pow(zz, 2) - (2.00 * yz * zz) + realt;

            zimgy = (2.00 * xz * yz) + imgty;

            zimgz = (2.00 * xz * zz) + imgtz;

            //Ausgabe
            if(zaehler < 10) {
                System.out.println(zaehler + "  | (" + zreal + ") + (" + zimgy + ") * i + (" + zimgz + ") * j");
            }
            else {
                System.out.println(zaehler + " | (" + zreal + ") + (" + zimgy + ") * i + (" + zimgz + ") * j");
            }
            zaehler++;
        }
    }

    public static void main(String[] args) {
        double realt;
        double imgty;
        double imgtz;

        realt = Mandelbrot.RealtSetter();
        imgty = Mandelbrot.ImgtYSetter();
        imgtz = Mandelbrot.ImgtZSetter();
        Mandelbrot.Iteration(realt, imgty, imgtz);

    }

}
