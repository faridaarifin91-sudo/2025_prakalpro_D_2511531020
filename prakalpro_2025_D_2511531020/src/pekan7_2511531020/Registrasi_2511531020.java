package pekan7_2511531020;
import java.util.Scanner;

public class Registrasi_2511531020 {
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Akun_2511531020 akunBaru = new Akun_2511531020();

        System.out.print("Masukkan Username: ");
        String u = input.nextLine();

        System.out.print("Masukkan Password: ");
        String p = input.nextLine();

        System.out.print("Masukkan Email: ");
        String e = input.nextLine();

        System.out.print("Masukkan PIN Angka: ");
        int pin = input.nextInt();

        // Set data ke object akun
        akunBaru.setUsername(u);
        akunBaru.setPassword(p);
        akunBaru.setEmail(e);
        akunBaru.setPinAngka(pin);

        // Validasi
        if (!akunBaru.isPasswordValid()) {
            System.out.println("\n❌ ERROR: Password harus minimal 8 karakter!");
        }
        else if (!akunBaru.isEmailValid()) {
            System.out.println("\n❌ ERROR: Format email tidak valid!");
        }
        else {
            System.out.println("\n✅ REGISTRASI BERHASIL!");
            System.out.println("=== DETAIL AKUN ===");
            System.out.println("Username: " + akunBaru.getUsername());
            System.out.println("Email Asli: " + akunBaru.getEmail());
            
            System.out.println("Email Uppercase: " + akunBaru.getEmail().toUpperCase());
            System.out.println("Email Lowercase: " + akunBaru.getEmail().toLowerCase());
            System.out.println("Panjang Username: " + akunBaru.getUsername().length());

            String gabung = akunBaru.getUsername().concat("_akun");
            System.out.println("Username + \"_akun\" = " + gabung);

            System.out.println("PIN Anda: " + akunBaru.getPinAngka());
        }

        input.close();
    }


}


