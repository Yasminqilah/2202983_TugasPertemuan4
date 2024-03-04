package latihanpertemuan4;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        int banyakGanjil = hitungBanyakGanjil(batasAwal, batasAkhir);
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + banyakGanjil);
    }

    public static int hitungBanyakGanjil(int awal, int akhir) {
        int count = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    } 
}
