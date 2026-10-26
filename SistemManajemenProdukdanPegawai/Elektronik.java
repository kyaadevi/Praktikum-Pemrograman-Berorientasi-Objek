/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class Elektronik extends Produk { // Mewarisi dari kelas Produk
    private int garansi;
    public Elektronik(String namaProduk, double harga, int garansi) {
        // Mengisi atribut yang diwarisi dari induk kelas
        super(namaProduk, harga);   // panggil constructor Produk
        this.garansi = garansi; // atribut baru
    }
    
    // Getter
    public int getGaransi() {
        return garansi;
    }
    
    // Setter
    public void setGaransi (int garansi) {
        this.garansi = garansi;
    }
    
    // Override (nama dan parameter sama, isi dari method berbeda)
    // Overloading (di kelas yang sama, method dan namanya sama namun parameternya berbeda.)
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo(); // memanggil method tampilkanInfo() yang ada di kelas induk
        System.out.println("Garansi             : " + garansi + " Tahun");
    }
    
    
    
}
