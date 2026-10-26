/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        // Mengisi atribut yang diwarisi dari induk kelas
        super(namaPegawai, gaji);   // panggil constructor Pegawai
        this.lamaKontrak = lamaKontrak;
    }
    
    // Getter
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    // Setter
    public void setLamaKontrak (int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    // Override
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo(); // memanggil method tampilkanInfo() yang ada di kelas induk
        System.out.println("Lama Kontrak        : " + lamaKontrak + " Bulan");
    }
    
}
