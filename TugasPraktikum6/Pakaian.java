/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class Pakaian extends Produk {
    
    // Atribut tambahan khusus Pakaian
    private String ukuran;
    
    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);   // panggil constructor Produk
        this.ukuran = ukuran;
    }
    
    // Getter
    public String getUkuran() {
        return ukuran;
    }
    
    // Override
    @Override
    public double hitungDiskon() {
            return harga * 0.35;
    }
}
