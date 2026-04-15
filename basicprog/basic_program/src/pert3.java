import java.util.Scanner;

public class pert3 {
    // ini adalah kode pemrograman dari hasil soal pertemuan 3 basic programming
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

        System.out.println("=== RUMUS BANGUN RUANG ===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");

        System.out.println("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1 :
                Scanner num1 = new Scanner(System.in);
                Scanner num2 = new Scanner(System.in);
                System.out.println("=== LUAS PERSEGI PANJANG ===");
                System.out.println("Masukkan panjang: ");
                int numP1 = num1.nextInt();
                System.out.println("Masukkan lebar: ");
                int numP2 = num2.nextInt();

                int x = numP1 *  numP2;

                System.out.println("Luas Persegi panjang adalah: " + x);
                break;
            case 2 :
                Scanner l = new Scanner(System.in);
                Scanner y = new Scanner(System.in);
                System.out.println("=== LUAS PERSEGI === ");
                System.out.println("Masukkan Sisi: ");
                int lebar1 = l.nextInt();

                int hasil = lebar1 * lebar1;
                System.out.println("Luas Persegi : " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;

        }
        }
    }
}
