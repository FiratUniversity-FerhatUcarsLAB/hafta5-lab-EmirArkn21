/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 13.11.25
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;       // KDV oranı
    final static double SHIPPING_FEE = 29.99;  // Kargo ücreti

    // 1️ Ürün satış toplam hesabı
    public static double calculateProductTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2️ Ara toplam (3 ürün toplamı)
    public static double calculateSubtotal(double total1, double total2, double total3) {
        return total1 + total2 + total3;
    }

    // 3️ İndirim tutarı
    public static double calculateDiscount(double subtotal, double discountPercent) {
        return subtotal * (discountPercent / 100);
    }

    // 4️ İndirimli toplam
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5️ KDV tutarı
    public static double calculateVAT(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // 6️ Genel toplam (indirimli toplam + KDV + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // Ana Metot
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ürün 1
        System.out.print("1. ürün fiyatı: ");
        double price1 = input.nextDouble();
        System.out.print("1. ürün adedi: ");
        int qty1 = input.nextInt();

        // Ürün 2
        System.out.print("2. ürün fiyatı: ");
        double price2 = input.nextDouble();
        System.out.print("2. ürün adedi: ");
        int qty2 = input.nextInt();

        // Ürün 3
        System.out.print("3. ürün fiyatı: ");
        double price3 = input.nextDouble();
        System.out.print("3. ürün adedi: ");
        int qty3 = input.nextInt();

        // İndirim oranı
        System.out.print("İndirim oranı (%): ");
        double discountPercent = input.nextDouble();

        // Hesaplamalar
        double total1 = calculateProductTotal(price1, qty1);
        double total2 = calculateProductTotal(price2, qty2);
        double total3 = calculateProductTotal(price3, qty3);

        double subtotal = calculateSubtotal(total1, total2, total3);
        double discount = calculateDiscount(subtotal, discountPercent);
        double discountedTotal = calculateDiscountedTotal(subtotal, discount);
        double vat = calculateVAT(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vat);

        // Sonuçlar
        System.out.printf("\nÜrün 1 Toplam: %.2f TL\n", total1);
        System.out.printf("Ürün 2 Toplam: %.2f TL\n", total2);
        System.out.printf("Ürün 3 Toplam: %.2f TL\n", total3);
        System.out.printf("Ara Toplam: %.2f TL\n", subtotal);
        System.out.printf("İndirim Tutarı: %.2f TL\n", discount);
        System.out.printf("İndirimli Toplam: %.2f TL\n", discountedTotal);
        System.out.printf("KDV (%.0f%%): %.2f TL\n", VAT_RATE * 100, vat);
        System.out.printf("Kargo Ücreti: %.2f TL\n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL\n", grandTotal);

        input.close();
    }
}
