/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class KeranjangBelanja {
    // List untuk menyimpan produk (polimorfisme)
    private List<Produk> daftarProduk;
    
    // Constructor
    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }
    
    // Menambah produk ke keranjang
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    
    // Menghitung total harga sebelum diskon
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }
    
    // Menghitung total diskon (polimorfisme runtime)
    public double hitungTotalDiskon() {
        double totalDiskon = 0;
        for (Produk p : daftarProduk) {
            totalDiskon += p.hitungDiskon();   // ← otomatis memilih versi subclass
        }
        return totalDiskon;
    }
    
    // Menghitung total bayar setelah diskon
    public double hitungTotalSetelahDiskon() {
        return hitungTotalHarga() - hitungTotalDiskon();
    }
    
    // Menampilkan struk belanja
    public void cetakStruk() {
        System.out.println("======================================================================================");
        System.out.println("           STRUK BELANJA                ");
        System.out.println("======================================================================================");
        
        for (Produk p : daftarProduk) {
            System.out.printf("%-15s | Harga: Rp%,.0f | Diskon: Rp%,.0f | Bayar: Rp%,.0f%n",
                    p.getNama(),
                    p.getHarga(),
                    p.hitungDiskon(),
                    p.getHarga() - p.hitungDiskon());
        }
        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Total Harga   : Rp%,.0f%n", hitungTotalHarga());
        System.out.printf("Total Diskon  : Rp%,.0f%n", hitungTotalDiskon());
        System.out.printf("Total Bayar   : Rp%,.0f%n", hitungTotalSetelahDiskon());
        System.out.println("======================================================================================");
    }
}