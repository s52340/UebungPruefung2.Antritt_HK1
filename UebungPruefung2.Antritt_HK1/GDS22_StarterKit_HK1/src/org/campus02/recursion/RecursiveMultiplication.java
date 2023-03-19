package org.campus02.recursion;

public class RecursiveMultiplication {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        int ergebnis = multiplicate(a,b);
        System.out.println("ergebnis = " + ergebnis);

    }

    // a = 5    b = 4
    public static int multiplicate(int a, int b) {
       /*Meine Falsche Lösung:
        if ( b == 1){
            return a;
        }
        multiplicate(a, b-1);
        return a = a + a;
    }
    */
        if (b == 1) {
            return a;
        }
        return multiplicate(a, b - 1) + a;
    }

}
