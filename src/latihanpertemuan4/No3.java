package latihanpertemuan4;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int faktorial = hitungFaktorial(n);
        
        System.out.println(n + "! = " + tampilkanFaktorial(n) + " = " + faktorial);
    }

    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            return faktorial;
        }
    }

    public static String tampilkanFaktorial(int n) {
        if (n == 0) {
            return "1";
        } else {
            String faktorial = "";
            for (int i = n; i >= 1; i--) {
                faktorial += i;
                if (i != 1) {
                    faktorial += "*";
                }
            }
            return faktorial;
        }
    }  
}
