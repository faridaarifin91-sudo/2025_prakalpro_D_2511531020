package pekan2;

public class TugasPekan2 {public class DataPemain {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int P = 5;          // level
        float Q = 82.5f;    // skor
        char R = 'A';       // rank
        boolean S;          // statusKemenangan

        // Logika kondisi
        if (Q >= 80) {
            S = true;
        } else {
            S = false;
        }

        // Cetak hasil
        System.out.println("=== Data Pemain ===");
        System.out.println("Level   : " + P);
        System.out.println("Skor    : " + Q);
        System.out.println("Rank    : " + R);
        System.out.println("Menang  : " + S);
    }
}

}
