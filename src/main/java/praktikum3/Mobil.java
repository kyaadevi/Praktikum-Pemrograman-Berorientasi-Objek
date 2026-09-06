/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna; // Tambahkan atribut warna
    
    public Mobil(String merk, String model, int tahun, String warna ) { // Tambahkan disini juga
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna; // Tambahkan disini juga
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk (String merk) {
        this.merk = merk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel (String model) {
        this.model = model;
    }
    public int gettahun () {
        return tahun;
    }
    public void settahun (int tahun) {
        this.tahun = tahun;
    }

    // Tambahkan disini juga
    public String getwarna() {
        return warna;
    }
    public void setwarna (String warna) {
        this.warna = warna;
    }
    
    void startEngine() {
        System.out.println("Mesin mobil " + getmerk() + " bergerak");
    }
    void displayInfo() {
    System.out.println("merk: " + getmerk() + ", model: " + getmodel() + ", tahun: " + gettahun() + ", warna: " + getwarna()); // Tambahkan disini juga
    }  
}