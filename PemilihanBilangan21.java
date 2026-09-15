import java.util.Scanner;
public class PemilihanBilangan21{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Silahkan masukkan angka anda: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0){
            System.out.print("Angka " + angka + " termasuk bilangan genap");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
        sc.close();
    }
}