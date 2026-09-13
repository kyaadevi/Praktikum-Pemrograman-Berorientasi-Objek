/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author ACER
 */
public class Pekerja extends Manusia {
    private double gaji; //private: hanya bisa diakses dalam kelas Pekerja

    //Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); //Untuk memanggil constructor Manusia
        this.gaji = gaji;
    }    
    
    //Getter dan Setter untuk gaji (private)
    public double getGaji() {
        return gaji;
    }
    public void SetGaji(double gaji) {
        this.gaji = gaji;
    }
    
    //Override toString() untuk menampilkan semua informasi
    @Override
    public String toString() {
        return "Nama    : "+ getNama() + "\n" +
               "Usia       : " + usia + " tahun\n" +
               "Pekerjaan  : " + pekerjaan + "\n" +
               "Gaji       : Rp " + gaji;
    }
}
