package ba.unsa.etf.rpr.tutorijal_01;

import java.util.Scanner;

public class Main {
    private static int sumaCifara (int broj) {
        int suma = 0;
        while (broj != 0) {
            suma = suma + broj % 10;
            broj = broj / 10;
        }
        return suma;
    }
    public static void main (String[] args) {
        Scanner ulaz = new Scanner (System.in);
        System.out.print ("Unesite broj: ");
        int broj = ulaz.nextInt ();
        System.out.println ("Brojevi između 1 i " + broj + " koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i < broj; i = i + 1)
            if (i % sumaCifara (i) == 0)
                System.out.println (i);
    }
}