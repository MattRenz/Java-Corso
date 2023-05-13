package VerificaJava.packageEs03;


public class Rettangolo {
    public int x; // ascissa del rettangolo
    public int y; // ordinata del rettangolo
    public int base;
    public int altezza;


    public Rettangolo(int x, int y, int b, int a) {

        this.x = x;
        this.x = y;
        this.base = b;
        this.altezza = a;
    }

    public Rettangolo(int b, int a) {

        x = 0;
        y= 0;
        this.base = b;
        this.altezza = a;

    }

    public int perimetro() {

        return (base + altezza) * 2;

    }

    public int area(){

        return base * altezza;
    }

    public boolean quadrato() {

        if (base == altezza){
            return true;
        } 
        return false;
    }

 
}


