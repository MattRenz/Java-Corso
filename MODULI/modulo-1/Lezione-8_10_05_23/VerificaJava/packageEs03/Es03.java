package VerificaJava.packageEs03;


// # Es03

// Si vuole realizzare una classe che rappresenta un rettangolo,
// memorizzando i suoi dati (x,y,a,b) e mettendo a disposizione dei
// metodi per:
// -Calcolare il perimetro e l’area del rettangolo
// -Determinare se il rettangolo è in realtà un quadrato
// -Ruotare il rettangolo di 90 gradi a sinistra o a destra
// -Determinare se due rettangoli si intersecano
// -Determinare il minimo rettangolo che contiene due rettangoli
// Si richiede quindi di completare la seguente classe:

// ```
// public class Rettangolo {
//    public int x; // ascissa del rettangolo
//    public int y; // ordinata del rettangolo
//    public int base;
//    public int altezza;

//    //costruisce un rettangolo secondo i parametri di input
//    public Rettangolo(int x, int y, int b, int a) {...}

//    //costruisce un rettangolo secondo i parametri di input e
//    //posizionato sull'origine del piano cartesiano
//    public Rettangolo(int b, int a) {...}

//    //calcola il perimetro del rettangolo
//    public int perimetro() {...}

//    //calcola l'area del rettangolo
//    public int area() {...}

//    //ritorna true se il rettangolo e' un quadrato, false altrimenti
//    public boolean quadrato() {...}


// MANCANTI:

//    //ruota il rettangolo di 90 gradi a sinistra
//    public void ruotasx() {...}

//    //ruota il rettangolo di 90 gradi a destra
//    public void ruotadx() {...}


//    //ritorna true se r e "this" rettangolo hanno intersezione non vuota
//    public boolean intersezione(Rettangolo r) {...}

//    //ritorna il piu' piccolo rettangolo che contiene r e "this" rettangolo
//    public Rettangolo contiene(Rettangolo r) {...}



//    public static void main(String[] args) {
//       // usare il main per testare tutti i metodi della classe
//    }
// }




public class Es03 {
    public static void main(String[] args) {

      

        Rettangolo r1 = new Rettangolo(0, 0, 4, 2);

        System.out.println("\n" + "Perimetro Rettangolo: " + r1.perimetro());
        System.out.println("\n" + "Area rettangolo: " + r1.area());

        if (r1.quadrato()){
            System.out.println("\nIl rettangolo è un quadrato");
        } else {
            System.out.println("\nIl rettangolo NON è un quadrato");
        }

    }
    
    }

