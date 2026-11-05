import java.util.Scanner;

public class KafeKampus01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("DAFTAR MENU:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Ada, harga: " + harga[i]);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Tidak ada");
        }

        System.out.print("Jumlah menu yang ingin dipesan: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaPesan = new String[n];
        int[] jumlahPesan = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            String pilihan = sc.nextLine();
            int hrg = 0;
            boolean valid = false;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pilihan)) {
                    hrg = harga[j];
                    namaPesan[i] = menu[j];
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Menu tidak valid, ulang lagi.");
                i--;
                continue;
            }
            System.out.print("Jumlah: ");
            int qty = sc.nextInt();
            sc.nextLine();

            jumlahPesan[i] = qty;
            total += hrg * qty;
        }
        System.out.println("\n--- STRUK ---");
        for (int i = 0; i < n; i++) {
            System.out.println(namaPesan[i] + " x " + jumlahPesan[i]);
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}