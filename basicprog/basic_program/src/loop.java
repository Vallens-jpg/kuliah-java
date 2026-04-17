import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner putar = new Scanner(System.in);

        System.out.println("Masukkan jumlah segitiga: ");
        int n = putar.nextInt();
        for ( int i = 1; i <= n; i++) { // iterasi luar
            for (int j = 1; j <= n - i; j++) { // iterasi dalam untuk spasi
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { // iterasi dalam untuk bintang
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
