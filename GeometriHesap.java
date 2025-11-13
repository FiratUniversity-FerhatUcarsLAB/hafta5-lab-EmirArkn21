/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 13.11.25
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // --- Kare ---
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // --- Dikdörtgen ---
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // --- Daire ---
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // --- Üçgen ---
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // --- Ana Metot ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kare
        System.out.print("Karenin kenar uzunluğu: ");
        double side = input.nextDouble();
        System.out.printf("Kare Alanı: %.2f\n", calculateSquareArea(side));
        System.out.printf("Kare Çevresi: %.2f\n\n", calculateSquarePerimeter(side));

        // Dikdörtgen
        System.out.print("Dikdörtgenin genişliği: ");
        double width = input.nextDouble();
        System.out.print("Dikdörtgenin yüksekliği: ");
        double height = input.nextDouble();
        System.out.printf("Dikdörtgen Alanı: %.2f\n", calculateRectangleArea(width, height));
        System.out.printf("Dikdörtgen Çevresi: %.2f\n\n", calculateRectanglePerimeter(width, height));

        // Daire
        System.out.print("Dairenin yarıçapı: ");
        double radius = input.nextDouble();
        System.out.printf("Daire Alanı: %.2f\n", calculateCircleArea(radius));
        System.out.printf("Daire Çevresi: %.2f\n\n", calculateCircleCircumference(radius));

        // Üçgen
        System.out.print("Üçgenin tabanı: ");
        double base = input.nextDouble();
        System.out.print("Üçgenin yüksekliği: ");
        double triHeight = input.nextDouble();
        System.out.print("Üçgenin 1. kenarı: ");
        double a = input.nextDouble();
        System.out.print("Üçgenin 2. kenarı: ");
        double b = input.nextDouble();
        System.out.print("Üçgenin 3. kenarı: ");
        double c = input.nextDouble();

        System.out.printf("Üçgen Alanı: %.2f\n", calculateTriangleArea(base, triHeight));
        System.out.printf("Üçgen Çevresi: %.2f\n", calculateTrianglePerimeter(a, b, c));

        input.close();
    }
}

