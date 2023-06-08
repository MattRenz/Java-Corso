package Serializzazzione;

import java.io.Serializable;

public class Persona implements Serializable {
    public static final String GetName = null;
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public int GetAge() {
        return age;
    }

}
