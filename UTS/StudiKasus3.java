import java.util.Scanner;

public class StudiKasus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perhitungan Bonus Karyawan Berdasarkan Kinerja Lama dan Lama Bekerja
        int lamaBekerja, kinerja, gajiPokok;
        double bonus = 0;
        boolean statusSertifikasi;

        System.out.print("Masukkan lama bekerja (dalam tahun): ");
        lamaBekerja = sc.nextInt();
        System.out.print("Masukkan nilai kinerja (1-100): ");
        kinerja = sc.nextInt();
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Apakah karyawan memiliki sertifikasi profesional? (true/false): ");
        statusSertifikasi = sc.nextBoolean();

        // Jika nilai kinerja dibawah 70, karyawan tidak dapat bonus
        if (kinerja < 70) {
            bonus = 0;
        } else if (kinerja >= 70) { 
            // Lama Bekerja < 2 tahun: bonus 1% dari gaji pokok
            if (lamaBekerja < 2) {
                bonus =  gajiPokok * 0.01;
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) { // 2 tahun <= lama bekerja < 5 tahun: bonus 3% dari gaji pokok
                bonus = gajiPokok * 0.03;
            } else { // Lama Bekerja >=5 tahun: bonus 5% dari gaji pokok
                bonus = gajiPokok * 0.05;
            }
            // Jika kinerja diatas 90, bonus ditingkatkan
        } else if (kinerja > 90) {
            // Lama bekerja < 2 tahun: bonus 2% dari gaji pokok
            if (lamaBekerja < 2) {
                bonus = gajiPokok * 0.02;
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) { // 2 tahun <= lama bekerja < 5 tahun: bonus 4% dari gaji pokok
                bonus = gajiPokok * 0.04;
            } else { // Lama bekerja >= 5 tahun: bonus 7% dari gaji pokok
                bonus = gajiPokok * 0.07;
            }
        }

        // Selain itu, jika karyawan memiliki sertifikasi profesional, bonus tambahan sebesar Rp. 500.000 diberikan
        // (Hanya jika karyawan sudah memenuhi syarat untuk mendapatkan bonus berdasarkan kinerja dan lama bekerja)
        if (statusSertifikasi && bonus > 0) {
            bonus += 500000;
        } 
        
        // Menampilkan nilai kinerja, lama bekerja, gaji pokok, status sertifikasi, dan total bonus yang diterima
        System.out.println("Hasil Perhitungan Bonus Karyawan");
        System.out.println("--------------------------------");
        System.out.println("Nilai Kinerja: " + kinerja);
        System.out.println("Lama Bekerja: " + lamaBekerja + " tahun");
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Status Sertifikasi Profesional: " + (statusSertifikasi ? "Memiliki" : "Tidak Memiliki"));
        System.out.printf("Total Bonus yang Diterima: Rp. %.2f", bonus);

        sc.close();
    }
}