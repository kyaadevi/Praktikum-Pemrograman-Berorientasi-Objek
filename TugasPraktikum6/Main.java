/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class Main {
   public static void main(String[] args) {
        
        // 1. Buat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        // 2. Tambahkan produk (polimorfisme)
        keranjang.tambahProduk(new Buku("Beras", 150000, "Budi Raharjo"));
        keranjang.tambahProduk(new Buku("Gandum", 200000, "Rinaldi Munir"));
        keranjang.tambahProduk(new Elektronik("Laptop", 8000000, "ASUS"));
        keranjang.tambahProduk(new Elektronik("Earphone", 250000, "ADVAN"));
        keranjang.tambahProduk(new Pakaian("Buku Sains", 180000, "L"));
        keranjang.tambahProduk(new Pakaian("Celana Jeans", 300000, "32"));
        
        // 3. Cetak struk
        keranjang.cetakStruk();
    }
}
 
