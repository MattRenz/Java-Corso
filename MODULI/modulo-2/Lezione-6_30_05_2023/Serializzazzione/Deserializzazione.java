package Serializzazzione;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializzazione {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream(
                    "person.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);
            Persona person = (Persona) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Nome: " + person.GetName());
            System.out.println("Età: " + person.GetAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
