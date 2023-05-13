package VerificaJava.packageEs02;


public class prova {

    enum month {
        GENNAIO, FEBBRAIO, MARZO, APRILE, MAGGIO, GIUGNO, LUGLIO, 
        AGOSTO, SETTEMBRE, OTTOBRE, NOVEMBRE, DICEMBRE;
    }
    

    public static String mese(int meseInput){


        if (meseInput > 12 || meseInput < 1){

            return "";
        }

        else {
            month mese = month.values()[meseInput - 1];

            return mese.toString();
        
        }
  
    }


    public static double max(double a, double b, double c){

        if (a > b && a > c) {
            return a;
        }

        if (b > a && b > c){
            return b;
        }

        if (c > a && c > b){
            return c;
        }

        return 0;

    }


    public static int numberOfDigits(int n){

        String lunint = Integer.toString(n);

        return lunint.length();
    }

    public static int sumOfDigits(int n) {

        String num = Integer.toString(n);

        int[] array = new int[num.length()];

        int somma = 0;

        for (int i = 0; i < array.length; i++){

            somma += Character.getNumericValue(num.charAt(i));

        }
    
        return somma;

    }



    // TEST 


    // public static void main(String[] args) {

    //     // metodo mese
    //     int mese = 12;
    //     System.out.println(mese(mese));


    //     // metodo max
    //     Double num1 = 5.0;
    //     Double num2 = 6.4;
    //     Double num3 = 4.2;
    //     System.out.println(max(num1, num2, num3));


    //     // metodo numberOfDigits
    //     int n = 4353;
    //     System.out.println(numberOfDigits(n));


    //     // metodo sumOfDigits
    //     int num4 = 854320;
    //     System.out.println(sumOfDigits(num4));



    // }

}
