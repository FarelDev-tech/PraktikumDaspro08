// Tugas 2
import java.util.Scanner;

public class decisionModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + "bilangan genap.");
        } else {
            System.out.println(angka + "bilangan ganjil.");
        }

        // Tambahan wlee
        String hasil = (angka % 2 == 0) ?
            angka + "bilangan genap."
            : angka + "bilangan ganjil.";
        System.out.println(hasil);
        
        sc.close();
    }
}