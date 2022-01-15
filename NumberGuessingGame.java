import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int zakres = 10;
        int los = rnd.nextInt(zakres) + 1;
        int tries = 1;

        while(true){

            int x;
            System.out.print("Podaj liczbe od 1 do " + zakres + ": ");
            x = scanner.nextInt();

            if ((x <= 0)&&( x > zakres)){
                System.out.println("Liczba nie znajduje sie w zakresie!");
                break;
            }
            else {
                if (x == los){
                    System.out.println("Trafiles!");
                    System.out.println("Potrzebowales prob: " + tries);
                    break;
                }
                else if (x < los){
                    System.out.println("Liczba za mala!");
                    tries++;
                    continue;
                }
                else if (x > los){
                    System.out.println("Liczba za duza!");
                    tries++;
                    continue;
                }
            }



        }

    }
}
