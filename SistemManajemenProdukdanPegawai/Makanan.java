/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class Makanan extends Produk{
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        // Mengisi atribut yang diwarisi dari induk kelas
        super(namaProduk, harga);   // panggil constructor Produk
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getter
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    // Setter
    public void setTanggalKadaluarsa (String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Override
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();  // memanggil method tampilkanInfo() yang ada di kelas induk
        System.out.println("Tanggal Kadaluarsa  : " + tanggalKadaluarsa);
    }
}
