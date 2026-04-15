import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner putar = new Scanner(System.in);

        System.out.println("Masukkan jumlah segitiga: ");
        int n = putar.nextInt();
;
        for ( int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
