/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        // Mengisi atribut yang diwarisi dari induk kelas
        super(namaPegawai, gaji);   // panggil constructor Pegawai
        this.tunjangan = tunjangan;
    }
    
    // Getter
    public double getTunjangan() {
        return tunjangan;
    }
    
    // Setter
    public void setTunjangan (double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    // Override menambahkan informasi yg lebihh spesifik
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo(); // memanggil method tampilkanInfo() yang ada di kelas induk
        System.out.println("Tunjangan Pegawai   : " + tunjangan + " Rupiah");
    }
    
}
