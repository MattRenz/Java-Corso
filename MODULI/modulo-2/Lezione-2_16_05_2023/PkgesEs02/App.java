package PkgesEs02;

public class App {
    public static void main(String[] args) throws Exception {

        // Esempio di uso
        Lista l1 = new Lista();
        l1.push_front(10);
        l1.push_front(20);
        l1.push_front(30);
        l1.push_front(40);
        l1.push_front(50);

        System.out.println("len = " + l1.length());

        System.out.println("len = " + l1.length());

        System.exit(0);

    
        l1.stampa();
        int v   = l1.pop_front();
        System.out.println("Estratto il valore: " + v);
        l1.stampa();
    }
}