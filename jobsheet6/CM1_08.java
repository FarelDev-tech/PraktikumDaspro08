    package jobsheet6;

    import java.util.Scanner;

    public class CM1_08 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String nama, nilaiHuruf1, nilaiHuruf2, nilaiHuruf3, status1, status2, status3, statusSemester; 
            long nim; // Memakai long karena NIM bisa lebih dari 10 digit
            int uts1, uas1, tugas1, uts2, uas2, tugas2, uts3, uas3, tugas3;
            double nilaiAkhir1, nilaiAkhir2, nilaiAkhir3, rataRata;

            System.out.println("Status Mahasiswa");
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine().trim();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextLong();

            // Memasukkan nilai mata kuliah 1
            System.out.println("Mata kuliah 1: Algoritma dan Pemrograman");
            System.out.print("Masukkan nilai UTS: ");
            uts1 = sc.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            uas1 = sc.nextInt();
            System.out.print("Masukkan nilai Tugas: ");
            tugas1 = sc.nextInt();

            if (uts1 < 0 || uts1 > 100) {
                System.out.println("Nilai UTS tidak valid. Harus antara 0-100.");
                return; // Menghentikan eksekusi
            } else if (uas1 < 0 || uas1 > 100) {
                System.out.println("Nilai UAS tidak valid. Harus antara 0-100.");
                return;
            } else if (tugas1 < 0 || tugas1 > 100) {
                System.out.println("Nilai Tugas tidak valid. Harus antara 0-100.");
                return;
            }

            // Menghitung nilai akhir mata kuliah 1
            nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);

            // Memasukkan nilai mata kuliah 2
            System.out.println("Mata kuliah 2: Struktur Data");
            System.out.print("Masukkan nilai UTS: ");
            uts2 = sc.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            uas2 = sc.nextInt();
            System.out.print("Masukkan nilai Tugas: ");
            tugas2 = sc.nextInt();

            if (uts2 < 0 || uts2 > 100) {
                System.out.println("Nilai UTS tidak valid. Harus antara 0-100.");
                return;
            } else if (uas2 < 0 || uas2 > 100) {
                System.out.println("Nilai UAS tidak valid. Harus antara 0-100.");
                return;
            } else if (tugas2 < 0 || tugas2 > 100) {
                System.out.println("Nilai Tugas tidak valid. Harus antara 0-100.");
                return;
            }

            // Menghitung nilai akhir mata kuliah 2
            nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);

            // Memasukkan nilai mata kuliah 3
            System.out.println("Mata kuliah 3: UI/UX");
            System.out.print("Masukkan nilai UTS: ");
            uts3 = sc.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            uas3 = sc.nextInt();
            System.out.print("Masukkan nilai Tugas: ");
            tugas3 = sc.nextInt();

            if (uts3 < 0 || uts3 > 100) {
                System.out.println("Nilai UTS tidak valid. Harus antara 0-100.");
                return;
            } else if (uas3 < 0 || uas3 > 100) {
                System.out.println("Nilai UAS tidak valid. Harus antara 0-100.");
                return;
            } else if (tugas3 < 0 || tugas3 > 100) {
                System.out.println("Nilai Tugas tidak valid. Harus antara 0-100.");
                return;
            }

            // Menghitung nilai akhir mata kuliah 3
            nilaiAkhir3 = (0.3 * uts3) + (0.4 * uas3) + (0.3 * tugas3);

            // Menentukan nilai huruf untuk mata kuliah 1
            if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
                nilaiHuruf1 = "A";
            } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
                nilaiHuruf1 = "B+";
            } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
                nilaiHuruf1 = "B";
            } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
                nilaiHuruf1 = "C+";
            } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
                nilaiHuruf1 = "C";
            } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
                nilaiHuruf1 = "D";
            } else if (nilaiAkhir1 >= 0 && nilaiAkhir1 <= 39) {
                nilaiHuruf1 = "E";
            } else {
                nilaiHuruf1 = "Tidak Valid";
            }

            // Menentukan nilai huruf untuk mata kuliah 2
            if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
                nilaiHuruf2 = "A";
            } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
                nilaiHuruf2 = "B+";
            } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
                nilaiHuruf2 = "B";
            } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
                nilaiHuruf2 = "C+";
            } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
                nilaiHuruf2 = "C";
            } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
                nilaiHuruf2 = "D";
            } else if (nilaiAkhir2 >= 0 && nilaiAkhir2 <= 39) {
                nilaiHuruf2 = "E";
            } else {
                nilaiHuruf2 = "Tidak Valid";
            }

            // Menentukan nilai huruf untuk mata kuliah 3
            if (nilaiAkhir3 > 80 && nilaiAkhir3 <= 100) {
                nilaiHuruf3 = "A";
            } else if (nilaiAkhir3 > 73 && nilaiAkhir3 <= 80) {
                nilaiHuruf3 = "B+";
            } else if (nilaiAkhir3 > 65 && nilaiAkhir3 <= 73) {
                nilaiHuruf3 = "B";
            } else if (nilaiAkhir3 > 60 && nilaiAkhir3 <= 65) {
                nilaiHuruf3 = "C+";
            } else if (nilaiAkhir3 > 50 && nilaiAkhir3 <= 60) {
                nilaiHuruf3 = "C";
            } else if (nilaiAkhir3 > 39 && nilaiAkhir3 <= 50) {
                nilaiHuruf3 = "D";
            } else if (nilaiAkhir3 >= 0 && nilaiAkhir3 <= 39) {
                nilaiHuruf3 = "E";
            } else {
                nilaiHuruf3 = "Tidak Valid";
            }

            // Menentukan status lulus/tidak lulus untuk masing-masing mata kuliah
            if (nilaiAkhir1 >= 60) {
                status1 = "Lulus";
            } else {
                status1 = "Tidak Lulus";
            } 
            
            if (nilaiAkhir2 >= 60) {
                status2 = "Lulus";
            } else {
                status2 = "Tidak Lulus";
            }

            if (nilaiAkhir3 >= 60) {
                status3 = "Lulus";
            } else {
                status3 = "Tidak Lulus";
            }

            // Menghitung rata-rata nilai akhir untuk menentukan status kelulusan semester
            rataRata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

            // Menentukan status kelulusan semester berdasarkan 3 kriteria
            if (rataRata >= 70) {
                // Kedua mata kuliah harus lulus
                if (status1.equals("Lulus") && status2.equals("Lulus") && status3.equals("Lulus")) {
                    statusSemester = "LULUS";
                } else {
                    statusSemester = "TIDAK LULUS (ADA MATA KULIAH TIDAK LULUS)";
                }
            } else {
                // Rata-rata kurang dari 70
                statusSemester = "TIDAK LULUS (RATA-RATA < 70)";
            }

            // Menampilkan hasil penilaian
            System.out.println("Hasil Penilaian Akademik");
            System.out.println("Nama: " + nama); // Menampilkan nama
            System.out.println("NIM: " + nim); // Menampilkan NIM
            System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus"); 
            System.out.println("-------------------------------------------------------------------------------------------------------");
            // Menggunakan format untuk menampilkan tabel (%d untuk integer, %.2f untuk float dengan 2 desimal, %s untuk string, \t untuk tab)
            System.out.printf("Algoritma dan Pemrograman\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1,status1);
            System.out.printf("Struktur Data\t\t\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2,status2);
            System.out.printf("UI/UX\t\t\t\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", uts3, uas3, tugas3, nilaiAkhir3, nilaiHuruf3,status3);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.printf("Rata-Rata Nilai Akhir: %.2f\n", rataRata);
            System.out.println("Status Kelulusan Semester: " + statusSemester);
        }
    }
