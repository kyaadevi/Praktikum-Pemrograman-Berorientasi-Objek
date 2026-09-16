/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author ACER
 */
public class Kucing extends Hewan {
    int umur;
    
    public void suara(){
        System.out.println(nama + "bersuara MIAW MIAW");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Umur Kucing: " + umur + "bulan");
    }
    
}
