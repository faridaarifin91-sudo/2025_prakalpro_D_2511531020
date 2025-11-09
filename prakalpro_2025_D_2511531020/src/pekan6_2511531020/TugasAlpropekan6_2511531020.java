package pekan6_2511531020;

import java.util.Scanner;
import java.util.Random;

public class TugasAlpropekan6_2511531020 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = 7;  // angka kemenangan (contoh: jika hasil penjumlahan 7)
        int percobaan = 0;
        String jawab;

        do {
            int dadu1 = rand.nextInt(6) + 1; // acak antara 1–6
            int dadu2 = rand.nextInt(6) + 1; // acak antara 1–6
            int hasil = dadu1 + dadu2;

            percobaan++;

            System.out.println(dadu1 + " + " + dadu2 + " = " + hasil);

            if (hasil == target) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = input.next();

                if (jawab.equalsIgnoreCase("tidak")) {
                    System.out.println("Anda gagal menang");
                    break;
                }
            }

        } while (true);
    }
}
	


