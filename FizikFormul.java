/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 13.11.25
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit
    final static double GRAVITY = 9.8;

    // 1. Hız
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2. İvme
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3. Kuvvet
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4. İş
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5. Güç
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6. Kinetik Enerji
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7. Potansiyel Enerji
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8. Momentum
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // Ana Metot
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hız
        System.out.print("Alınan yol (metre): ");
        double s = input.nextDouble();
        System.out.print("Geçen süre (saniye): ");
        double t = input.nextDouble();
        System.out.printf("Hız (v): %.2f m/s\n\n", calculateVelocity(s, t));

        // İvme
        System.out.print("Hız değişimi (m/s): ");
        double deltaV = input.nextDouble();
        System.out.print("Zaman (saniye): ");
        double t2 = input.nextDouble();
        System.out.printf("İvme (a): %.2f m/s²\n\n", calculateAcceleration(deltaV, t2));

        // Kuvvet
        System.out.print("Kütle (kg): ");
        double m1 = input.nextDouble();
        System.out.print("İvme (m/s²): ");
        double a = input.nextDouble();
        System.out.printf("Kuvvet (F): %.2f N\n\n", calculateForce(m1, a));

        // İş
        System.out.print("Kuvvet (N): ");
        double F = input.nextDouble();
        System.out.print("Yol (m): ");
        double d = input.nextDouble();
        System.out.printf("İş (W): %.2f J\n\n", calculateWork(F, d));

        // Güç
        System.out.print("İş (J): ");
        double W = input.nextDouble();
        System.out.print("Zaman (s): ");
        double t3 = input.nextDouble();
        System.out.printf("Güç (P): %.2f W\n\n", calculatePower(W, t3));

        // Kinetik Enerji
        System.out.print("Kütle (kg): ");
        double m2 = input.nextDouble();
        System.out.print("Hız (m/s): ");
        double v = input.nextDouble();
        System.out.printf("Kinetik Enerji (KE): %.2f J\n\n", calculateKineticEnergy(m2, v));

        // Potansiyel Enerji
        System.out.print("Kütle (kg): ");
        double m3 = input.nextDouble();
        System.out.print("Yükseklik (m): ");
        double h = input.nextDouble();
        System.out.printf("Potansiyel Enerji (PE): %.2f J\n\n", calculatePotentialEnergy(m3, h));

        // Momentum
        System.out.print("Kütle (kg): ");
        double m4 = input.nextDouble();
        System.out.print("Hız (m/s): ");
        double v2 = input.nextDouble();
        System.out.printf("Momentum (p): %.2f kg·m/s\n", calculateMomentum(m4, v2));

        input.close();
    }
}

