import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program untuk menghitung BMI (Body Mass Index)
        // Rumus BMI = berat (kg) / (tinggi (m) * tinggi (m))
        double berat, tinggi, bmi;

        System.out.print("Masukkan berat badan (kg): ");
        berat = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (cm): ");
        tinggi = sc.nextDouble() / 100; // konversi cm ke m
        bmi = berat / (tinggi * tinggi);

        // Hasil Penilaian BMI
        System.out.printf("BMI Anda adalah: %.2f\n", bmi);

        // Kategori BMI:
        if (bmi < 18.5) {
            // Underweight (< 18.5) Risiko Kesehatan: Kekurangan Gizi, Osteoporosis, Penurunan Sistem Kekebalan Tubuh
            System.out.println("Kategori: Underweight");
            System.out.println("Risiko Kesehatan: Kekurangan Gizi, Osteoporosis, Penurunan Sistem Kekebalan Tubuh");
        } else if (bmi >= 18.5 && bmi < 25) {
            // Normal Weight (18.5 <= BMI < 25) Risiko Kesehatan: Relatif Rendah
            System.out.println("Kategori: Normal Weight");
            System.out.println("Risiko Kesehatan: Relatif Rendah");
        } else if (bmi >= 25 && bmi < 30) {
            // Overweight (25 <= BMI < 30) Risiko Kesehatan
            System.out.println("Kategori: Overweight");
            System.out.println("Risiko Kesehatan: Meningkatnya risiko penyakit jantung, hipertensi, tekanan darah tinggi");
        } else {
            // Obesity (BMI >= 30) Risiko Kesehatan
            System.out.println("Kategori: Obesity");
            System.out.println("Risiko Kesehatan: Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan");
        }

        sc.close();
    }
}