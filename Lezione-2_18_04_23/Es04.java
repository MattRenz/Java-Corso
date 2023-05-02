public class Es04 {
    public static void main(String[] args) {
       
            int conta = 0;
       
        for (boolean a = false; a == false;){
            if ((int) (Math.random() * 100) == 4){
                a = true;
            } else {
                conta++;
            }
        }
        System.out.println("Per trovare il numero 4 ho fatto " + conta + " tentativi");
    }
}
