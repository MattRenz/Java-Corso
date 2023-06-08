package Serializzazzione;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializzazione {
    public static void main(String[] args) {
        Persona person = new Persona("Alice", 25);

        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Oggetto serializzato correttamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
