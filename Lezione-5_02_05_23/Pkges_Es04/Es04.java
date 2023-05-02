package Pkges_Es04;

public class Es04 {

    // Polimorfismo

    public static int Add(int n1, int n2){
        return n1 + n2;
    }

    public static String Add(String s1, String s2){

        return s1 + s2;
    }


    public static void main(String[] args) {

        System.out.println(Add(1, 2));

        System.out.println(Add("Ciao", "ni"));

    }
}
