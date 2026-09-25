/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme runtime: referensi hewan, objek Kucing
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan");           // Metode dari kelas Hewan
        kucing.makan("ikan", 2);        // Metode dari overloaded dari kelas Hewan
        
        Anjing anjing = new Anjing();
        anjing.bersuara();              // Output Guk
        anjing.makan("daging", 3);      // Metode overloaded dari kelas Hewan
    }
}
