/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class Elektronik extends Produk {
    
    // Atribut tambahan khusus Elektronik
    private String merek;
    
    public Elektronik(String nama, double harga, String merek) {
        super(nama, harga);   // panggil constructor Produk
        this.merek = merek;
    }
    
    // Getter
    public String getMerek() {
        return merek;
    }
    
    // Override
    @Override
    public double hitungDiskon() {
            return harga * 0.45;
    }
}