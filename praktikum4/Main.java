/*/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package praktikum4;

public class Main {
    public static void main(String[] args) {
        // ===== UJI COBA KELAS KENDARAAN (SEBELUMNYA) =====
        // Membuat objek dari kelas Kendaraan
        Kendaraan mobil = new Kendaraan("Toyota", 200, "GTW");

        System.out.println("=== DATA KENDARAAN ===");
        System.out.println("Nama: " + mobil.getNama());
        System.out.println("Kecepatan maks: " + mobil.getKecepatanMaks());
        System.out.println("Jenis Mesin: " + mobil.getJenisMesin());
        
        System.out.println("\n=== DATA MOBIL (SUBCLASS) ===");
        Mobil avanza = new Mobil("Toyota Avanza", 180, "Bensin", 5);
        avanza.tampilkanInfoMobil();
        System.out.println("Jenis Mesin: " + avanza.jenisMesin);
    }
}