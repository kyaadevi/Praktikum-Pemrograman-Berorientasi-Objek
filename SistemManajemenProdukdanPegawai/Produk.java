/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class Produk {
    
    private String namaProduk; 
    private double harga;
    
    // Constructor method khusus yang dipanggil OTOMATIS saat objek dibuat 
    public Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk; // this.namaProduk = atribut kelas
        this.harga = harga; // harga (tanpa this) = parameter
    }
    
    // Getter (ambil nilai atribut)
    // Setter (ubah nilai atribut)
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // ==== METHOD ====
    // untuk menampilkan info produk
    // bisa di override oleh kelas turunnan
     public void tampilkanInfo(){
        System.out.println("Nama Produk         : " + namaProduk);
        System.out.println("Harga               : " + harga + " Rupiah");
    }
    
}
