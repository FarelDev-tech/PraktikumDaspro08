import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1;
        int input2;
        int input3;

        System.out.print("Masukkan nilai pertama: ");
        input1 = sc.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        input2 = sc.nextInt();
        System.out.print("Masukkan nilai ketiga: ");
        input3 = sc.nextInt();

        // Menentukan angka mana yang terbesar dari ketiga nya dan tampilkan angka tersebut
        if (input1 >= input2 && input1 >= input3) {
            System.out.println("Nilai terbesar adalah: " + input1);
        } else if (input2 >= input1 && input2 >= input3) {
            System.out.println("Nilai terbesar adalah: " + input2);
        } else {
            System.out.println("Nilai terbesar adalah: " + input3);
        }

        // jika ada dua atau lebih angka yang sama dan terbesar, tampilkan semua angka tersebut
        if (input1 == input2 && input1 >= input3) { 
            System.out.println("Nilai sama yang terbesar adalah: " + input1 + " dan " + input2);
        } else if (input1 == input3 && input1 >= input2) {
            System.out.println("Nilai sama yang terbesar adalah: " + input1 + " dan " + input3);
        } else if (input2 == input3 && input2 >= input1) {
            System.out.println("Nilai sama yang terbesar adalah: " + input2 + " dan " + input3);
        } else if (input1 == input2 && input1 == input3) {
            System.out.println("Ketiga nilai sama besar: " + input1 + ", " + input2 + ", dan " + input3);
        }

        sc.close();
    }
}