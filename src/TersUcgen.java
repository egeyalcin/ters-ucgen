import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamak;

        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayisi giriniz");
        basamak = inp.nextInt();

        for (int i = basamak - 1; i > 0; i--) {
            for (int j = basamak; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
