/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class Buku extends Produk {
    // Atribut tambahan khusus Buku
    private String penulis;
    
    public Buku(String nama, double harga, String penulis) {
        super(nama, harga);   // panggil constructor Produk
        this.penulis = penulis;
    }
    // Getting
    public String getPenulis() {
        return penulis;
    }
    
    @Override
    public double hitungDiskon() {
            return harga * 0.25;
    }
}