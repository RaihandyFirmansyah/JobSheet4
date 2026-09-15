import java.util.Scanner;

public class ModifPemilihanHariDengan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka hari (1-7): ");
        int hari = input.nextInt();

        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        input.close();
    }
}
