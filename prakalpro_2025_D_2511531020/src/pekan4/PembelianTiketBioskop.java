package pekan4;

import java.util.Scanner;

public class PembelianTiketBioskop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


        // Deklarasi variabel
        String nama;
        int jumlahTiket, hari, waktu, studio;
        double hargaDasar = 50000;
        double biayaHari = 0, biayaWaktu = 0, biayaStudio = 0;
        double hargaPerTiket, subtotal, diskon, totalBayar;

        // Input data
        System.out.print("Masukkan Nama Pembeli: ");
        nama = input.nextLine();
        System.out.print("Masukkan Jumlah Tiket: ");
        jumlahTiket = input.nextInt();
        System.out.print("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        hari = input.nextInt();
        System.out.print("Pilih Waktu (1=Pagi, 2=Siang, 3=Malam): ");
        waktu = input.nextInt();
        System.out.print("Pilih Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        studio = input.nextInt();

        // Hitung biaya tambahan berdasarkan hari
        if (hari == 1) biayaHari = 0;
        else if (hari == 2) biayaHari = 0.1 * hargaDasar;
        else if (hari == 3) biayaHari = 0.3 * hargaDasar;

        // Hitung biaya tambahan berdasarkan waktu
        if (waktu == 1) biayaWaktu = 0;
        else if (waktu == 2) biayaWaktu = 0.2 * hargaDasar;
        else if (waktu == 3) biayaWaktu = 0.2 * hargaDasar;

        // Hitung biaya tambahan berdasarkan studio
        if (studio == 1) biayaStudio = 0;
        else if (studio == 2) biayaStudio = 0.2 * hargaDasar;
        else if (studio == 3) biayaStudio = 0.4 * hargaDasar;

        // Hitung harga tiket dan total
        hargaPerTiket = hargaDasar + biayaHari + biayaWaktu + biayaStudio;
        subtotal = hargaPerTiket * jumlahTiket;

        if (subtotal >= 300000) {
            diskon = 0.2 * subtotal;
        } else {
            diskon = 0;
        }

        totalBayar = subtotal - diskon;

        // Output hasil
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli   : " + nama);
        System.out.println("Jumlah Tiket   : " + jumlahTiket);
        System.out.println("Hari           : " + hari);
        System.out.println("Waktu Tayang   : " + waktu);
        System.out.println("Jenis Studio   : " + studio);
        System.out.println("-----------------------------------");
        System.out.println("Harga Dasar    : Rp " + hargaDasar);
        System.out.println("Biaya Hari     : Rp " + biayaHari);
        System.out.println("Biaya Waktu    : Rp " + biayaWaktu);
        System.out.println("Biaya Studio   : Rp " + biayaStudio);
        System.out.println("Harga Per Tiket: Rp " + hargaPerTiket);
        System.out.println("Subtotal       : Rp " + subtotal);
        System.out.println("Diskon         : Rp " + diskon);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
    }
}

