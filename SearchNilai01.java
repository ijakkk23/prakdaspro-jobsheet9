import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        System.out.println("Masukkan " + n + " nilai elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("==================================================");
            System.out.println("[INFO] Pencarian Gagal!");
            System.out.println("Nilai target: " + key);
            System.out.println("Kesimpulan: Nilai yang dicari tidak ditemukan di dalam array.");
            System.out.println("==================================================");
        }
        sc.close();
    }
}