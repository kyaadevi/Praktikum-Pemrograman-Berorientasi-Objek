/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai (String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji (double gaji) {
        this.gaji = gaji;
    }
    
     public void tampilkanInfo(){
        System.out.println("Nama Pegawai        : " + namaPegawai);
        System.out.println("Gaji                : " + gaji + " Rupiah");
    }
}
