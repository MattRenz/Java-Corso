package Pkges_Es03;

import java.util.Scanner;

/*
     * Creare una classe Libro, una classe Autore, una classe Biblioteca
     * dove
     * Libro
     * - titolo (string)
     * - autore (della classe Autore)
     * - scaffale (int)
     * Autore
     * - Nome
     * - Nazionalità
     * Biblioteca
     * - contiene max 1000 libri
     * - AddLibro(Libro)
     * - PrintLibri() => stampa tutti i libri con i nomi dei rispettivi autori
     */

public class Es03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.print("Nome: ");
            String nome = input.next();

            System.out.print("Nazionalità: ");
            String nazionalita = input.next();

            Autroe autore = new Autroe(nome, nazionalita);

            System.out.print("TItolo: ");
            String titolo = input.next();

            System.out.print("Scaffale: ");
            int scaffale = input.nextInt();

            Libro libro = new Libro(titolo, autore, scaffale);

            Biblioteca biblioteca = new Biblioteca();

            biblioteca.AddLibro(libro);

            Biblioteca.StampaTuttiILibri();

        }

    }

}