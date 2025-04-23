import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("podaj liczbe losowan: ");
        int n = sc.nextInt();
    Random rand = new Random();
        int dodatnie = 0;
        int ujemne = 0;
        int min = 0;
        int max = 0;
        boolean pierwsza = true;

        for (int i = 0; i < n; i++) {

            int liczba = rand.nextInt(201) - 100;
            System.out.print(liczba + " ");

            if (liczba > 0) dodatnie++;
            else if (liczba < 0) ujemne++;

            if (pierwsza) {

                min = liczba;

                max = liczba;
                pierwsza = false;
            } else {
                if (liczba < min) min = liczba;

                if (liczba > max) max = liczba;
            }
        }
        if(ujemne==0){
            System.out.println("brak liczb ujemnych nei mozna obliczyc stosunku");
        }else{
            System.out.println("stosunek dodatnich do ujemnych to " + (double)(dodatnie/ujemne));
        }


        System.out.println();
System.out.println("Dodatnie: " + dodatnie);
        System.out.println("Ujemne: " + ujemne);



        }

    }
