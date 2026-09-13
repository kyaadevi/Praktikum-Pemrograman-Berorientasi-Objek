/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TugasModul3;

/**
 *
 * @author ACER
 */
public class Manusia {
    private String nama; //private: hanya bisa diakses dalam kelas ini
    protected int usia; //protected: bisa diakses subclass dan package yang sama
    public String pekerjaan; //public: bisa diakses dari mana saja

    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
