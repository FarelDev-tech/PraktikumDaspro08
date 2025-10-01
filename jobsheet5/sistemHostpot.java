// Tugas 3

import java.util.Scanner;

public class sistemHostpot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Sistem Hostpot --");
        System.out.print("Apakah kamu user dosen atau mahasiswa: ");
        String user = sc.nextLine().trim();

        if (user.equalsIgnoreCase("dosen")) {
            System.out.print("Akses wifi diberikan");
        } else if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.print("Akses wifi diberikan");
            } else {
                System.out.print("Akses Ditolak");
            }
        } else {
            System.out.print("Akses Ditolak");
        }

        // Tambahan wlee
        switch (user.toLowerCase()) {
            case "dosen" :
                System.out.println("Akses wifi diberikan");
                break;
            case "mahasiswa" :
                System.out.print("Masukkan jumalah SKS yang diambil: ");
                int sks = sc.nextInt();
                // Ternary
                String akses = (sks >= 12) ? "Akses wifi diberikan" : "Akses ditolak";
                System.out.print(akses);
                break;
            default :
                System.out.print("Akses ditolak");
            }

        sc.close();
    }
}
