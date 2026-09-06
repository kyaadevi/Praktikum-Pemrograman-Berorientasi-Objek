/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class mainmobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "hitam");
        
        mobil1.startEngine();
        mobil1.displayInfo();
        
        // Tambahkan ini untuk merubah warna mobil1
        System.out.println("Setelah warna diubah");
        mobil1.setwarna("merah");
        mobil1.displayInfo();
            
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "putih");
        
        mobil2.startEngine();
        mobil2.displayInfo();
        
    }
}
