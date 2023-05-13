package VerificaJava.packageEs02;


// # Es02

// Implementare i seguenti metodi all’interno della classe prova.java

// 1. public static String mese(int month)
//    - ritorna il nome del mese corrispondente al parametro month. ritorna una stringa vuota se month < 1 oppure month > 12
//    - Esempio: mese(12) ritorna “Dicembre”
// 2. public static double max(double a, double b, double c)
//    - ritorna il massimo dei numeri a, b, c
//    - Esempio: max(5.0, 6.4, 4.2) ritorna 6.4
// 3. public static int numberOfDigits(int n)
//    - ritorna il numero di cifre di cui e' composto n
//    - Esempio: numberOfDigits(854320) ritorna 6
// 4. public static int sumOfDigits(int n)
//    - ritorna la somma delle cifre di cui e' composto n
//    - Esempio: sumOfDigits(854320) ritorna 22
// 5. Scrivere un metodo main per esercizio2.java che consenta di testare i suddetti metodi.



public class Es02 {

    public static void main(String[] args) {
        
        //metodo mese
        int mese = 12;
        System.out.println(prova.mese(mese));

        // metodo max
        Double num1 = 5.0;
        Double num2 = 6.4;
        Double num3 = 4.2;
        System.out.println(prova.max(num1, num2, num3));

        //metodo numberOfDigits
        int n = 4353;
        System.out.println(prova.numberOfDigits(n));

        //metodo sumOfDigits
        int num4 = 854320;
        System.out.println(prova.sumOfDigits(num4));

    }
    

}
