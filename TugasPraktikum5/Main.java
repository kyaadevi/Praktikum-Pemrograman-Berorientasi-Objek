/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Anjing anjing = new Anjing();
        anjing.nama = "Oreo";
        anjing.jenis = "Persia";
        anjing.umur = 4;
        anjing.tampilkanInfo();
        anjing.suara();
        
        System.out.println("-----------------------");
        
        Kucing kucing = new Kucing();
        kucing.nama = "Poppy";
        kucing.jenis = "Angora";
        kucing.umur = 2;
        kucing.tampilkanInfo();
        kucing.suara();
    }
    
}
