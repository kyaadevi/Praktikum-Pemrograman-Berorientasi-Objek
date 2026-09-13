/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek Pekerja
        System.out.println("=== INFORMASI PEKERJA ===");
        Pekerja pekerja1 = new Pekerja("Ahmed Khoirudin", 26, "Programmer", 5000000);
        System.out.println(pekerja1.toString());
        
        // 2. Ubah nama menggunakan setter
        System.out.println("\n=== SETELAH NAMA DIUBAH ===");
        pekerja1.setNama("Ahmed Khoirudin");
        System.out.println(pekerja1.toString());
        
        // 3. Uji akses langsung dengan atribut
        System.out.println("\n=== UJI AKSES LANGSUNG ===");
        
        // Akses public (pekerjaan) seharusnya bisa
        System.out.println("Pekerjaan (public) : " + pekerja1.pekerjaan);
        
        // Akses protected (usia) seharusnya bisa karena package sama
        System.out.println("Usia (protected) : " + pekerja1.usia + "tahun");
        
        // Akses private (nama) seharusnya error
        //System.out.println("Nama (private) : " + pekerja1.nama);
        
        // Akses private (gaji) seharusnya error
        // System.out.println("gaji (private) : " + pekerja1.gaji);
        
        // Akses private via getter seharusnya bisa
        System.out.println("Nama (via getter) : " + pekerja1.getNama());
        System.out.println("Gaji (via getter) : " + pekerja1.getGaji());
        
    }
}
