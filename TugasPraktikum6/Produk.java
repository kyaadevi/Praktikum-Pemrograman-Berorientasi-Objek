/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class Produk {
    // Atribut
    protected String nama;
    protected double harga;
    
    //Constructor
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public double hitungDiskon(){
        return 0; // Karena default-nya diskon = 0
    }
    
    
    
}
    

