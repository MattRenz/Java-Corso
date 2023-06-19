public class Es02 {

    public static int findMaxNumber(int[] array){
        int max = Integer.MIN_VALUE;
        
        for (int x : array){
            max = (max > x) ? max : x;

            // Operatore ?:
            // <expr logica> true:false
        // }
        // if (max > x){
        //     max = max;
        // } else {
        //     max = x;

        }

        return max;
    }
 
    // public static int findMaxNumber(int[] array){

    //     int max = array[0];

    //     for (int i = 1; i < array.length; i++){

    //         if (array[i] > max){
    //             max = array[i];
    //         }
    //     }

    //     return max;

    // }


    public static void main(String[] args) {
        

    // Dato l'array numbers
    int[] numbers = { 5, 8, 2, 10, 3 };

    // Implementare la funzione findMaxNumber che trova il numero più grande
    // nell'array
    int maxNumber = findMaxNumber(numbers);
    System.out.println("Max number: " + maxNumber);

    }
}
