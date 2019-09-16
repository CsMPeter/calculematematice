package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calcul calcul = new Calcul();

        System.out.println(calcul.adunare(3,2));
        System.out.println(calcul.inmultire(3,2));
        System.out.println(calcul.scadere(3,2));
        System.out.println(calcul.despartire(3,2));
        System.out.println(calcul.adunare(3.2,4.5));
        System.out.println(calcul.inmultire(3.2,4.5));
        System.out.println(calcul.scadere(3.2,4.5));
        System.out.println(calcul.despartire(3.2,4.5));
    }
}
