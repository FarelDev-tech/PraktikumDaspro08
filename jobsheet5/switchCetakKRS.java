import java.util.Scanner;

public class switchCetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Cetak KRS SIAKAD --");
        System.out.print("Masukkan semester saat ini (1-8): ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 Ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 Ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 Ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 Ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 Ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 Ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 Ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 Ditampilkan");
                break;
            default:
                System.out.println("Semester tidak valid, silahkan masukkan semester antara 1-8.");
                break;
        }

        sc.close();
    }
}
