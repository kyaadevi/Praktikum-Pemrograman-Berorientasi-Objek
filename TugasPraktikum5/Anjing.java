/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author ACER
 */
public class Anjing extends Hewan {
    int umur;
    
    public void suara(){
        System.out.println(nama + "bersuara GUK GUK");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Umur anjing: " + umur + "bulan");
    }
    
}
