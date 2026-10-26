/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author ACER
 */
public class Main {
    // POLIMORFISME (1 method bnyk bentuk)
    public static void main(String[] args) {
        
        System.out.println("==== OUTPUT PRODUK ====");
        Elektronik p1 = new Elektronik("Laptop", 5000000, 4);
        
        p1.tampilkanInfo();
        System.out.println();
        
        // Fungsi getter dan setter di kelas turunan
        Elektronik e1 = new Elektronik("komputer", 20000, 2);
        System.out.println("Garansi Komputer: " + e1.getGaransi());
        
        System.out.println("==== OUTPUT PEGAWAI ====");
        PegawaiTetap pg1 = new PegawaiTetap("Kia", 120000, 40000);
        pg1.tampilkanInfo();
        System.out.println();
        
        System.out.println("===== OUTPUT POLIMORFISME =====");
        // tipe referensi, variabel, new, objek
        Produk p2 = new Makanan("Minyak Goreng", 35000, "19-4-2027");
        Produk p3 = new Elektronik("PC", 300000, 10);
        Pegawai pg2 = new PegawaiKontrak("Bella", 30000, 6);
        
        p2.tampilkanInfo();
        System.out.println();
        p3.tampilkanInfo();
        System.out.println();
        pg2.tampilkanInfo();
        System.out.println();
        
        
        
    }
}
