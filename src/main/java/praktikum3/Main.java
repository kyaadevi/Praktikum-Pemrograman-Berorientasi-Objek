/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Cici", 3);
        Hewan anjing = new Hewan("Oreo", 2);
        
        kucing.suara();
        kucing.info();
        
        anjing.berlari();
        anjing.info();
    }
}
