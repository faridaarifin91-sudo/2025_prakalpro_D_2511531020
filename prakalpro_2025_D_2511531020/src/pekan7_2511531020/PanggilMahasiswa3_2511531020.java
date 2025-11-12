package pekan7_2511531020;

import java.util.Scanner;
public class PanggilMahasiswa3_2511531020 {
	public static void main (String [] args) {
		Mahasiswa_2511531020  a= new Mahasiswa_2511531020();
		Scanner input= new Scanner(System.in);
		System.out.print("NIM: ");
		a.setNim2(input.nextLine ());
		System.out.print("Nama: ");
		a.setNama(input.nextLine ());
		if(a.getNim2() .startsWith("25")) {
			System.out.println(a.getNama()+ " anda angkatan 2025");
		}
		if(a.getNim2() .contains("1153")) {
			System.out.println(a.getNama()+" Anda Mahasiswa Informatika");
		}
		a.cetak2();
		input.close ();
	}

}
