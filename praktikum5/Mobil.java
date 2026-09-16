/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author ACER
 */
class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
