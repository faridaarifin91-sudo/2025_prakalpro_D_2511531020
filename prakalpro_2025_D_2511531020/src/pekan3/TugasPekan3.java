package pekan3;

import java.util.Scanner;

public class TugasPekan3 {
    public static void main(String[] args) {
        double r, t, volume;
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        r = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        t = input.nextDouble();

        // rumus volume kerucut = 1/3 * π * r^2 * t
        volume = (1.0 / 3.0) * PI * r * r * t;

        System.out.println("Volume kerucut = " + volume);

        input.close();
    }
}