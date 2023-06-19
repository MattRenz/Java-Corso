import java.util.Scanner;

public class Es01{

    enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
        AGUST, SEPTEMBR, OCTOBER, NOVEMBER, DICEMBER;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");

        int monthNum = input.nextInt();

        Month month = Month.values()[monthNum - 1];

        System.out.println("You entered: " + month);

    }
}

