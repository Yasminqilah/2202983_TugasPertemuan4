package latihanpertemuan4;
import java.util.Scanner;
public class LatihanPertemuan4 {  
    public static void main(String[] args) {
        Scanner cantik = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = cantik.nextInt();
        
        if (n < 1) {
            System.out.println("Masukkan nilai n harus lebih besar dari atau sama dengan 1.");
        } else {
            System.out.println("Bilangan dari 1 sampai dengan " + n + " adalah:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        
        cantik.close();
        
    }
    
}
