// Tugas 3
import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Sistem Perpustakaan --");
        System.out.print("Apakah kartu mahasiswa aktif? (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Izinkan Masuk");
        } else {
            System.out.println("Tidak diizinkan masuk");
        }

        // Tambahan wlee
        String akses = (kartuMahasiswa || registrasiOnline) ?
            "Izinkan Masuk"
            : "Tidak diizinkan masuk";
        System.out.println(akses);
    }
}
