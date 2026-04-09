import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner angka = new Scanner(System.in);
        System.out.println(" === RUMUS BANGUN RUANG === ");
        System.out.println(" 1. Luas Persegi Panjang ");
        System.out.println(" 2. Luas Persegi ");
        System.out.println("masukkan pilihan anda: ");
       int pilihan = angka.nextInt();


       if (pilihan == 1) {
           Scanner num1 = new Scanner(System.in);
           Scanner num2 = new Scanner(System.in);
           System.out.println("=== LUAS PERSEGI PANJANG ===");
           System.out.println("Masukkan panjang: ");
           int numP1 = num1.nextInt();
           System.out.println("Masukkan lebar: ");
           int numP2 = num2.nextInt();

           int x = numP1 *  numP2;

           System.out.println("Luas Persegi panjang adalah: " + x);
       } else if (pilihan == 2) {

           Scanner l = new Scanner(System.in);
           Scanner y = new Scanner(System.in);
           System.out.println("=== LUAS PERSEGI === ");
           System.out.println("Masukkan Panjang 1: ");
           int lebar1 = l.nextInt();

           int hasil = lebar1 * lebar1;
           System.out.println("Luas Persegi : " + hasil);


       }


    }
}