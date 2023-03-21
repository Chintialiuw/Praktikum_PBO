/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_3;

/**
 *
 * @author DYNABOOK
 */
public class Kacamata_Minus extends Kacamata {
    private String bonus;

    public Kacamata_Minus(int kode, String materialFrame, String nama, String warna, String jenisLensa, int harga, int garansiLensa, int garansiFrame, String bonus, int stok) {
        super(kode, materialFrame, nama, warna, jenisLensa, harga, garansiLensa, garansiFrame, stok);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public void tertambah(){
        System.out.println("=================================================");
        System.out.println("        Data Kacamata Berhasil Ditambahkan       ");
    }
    
    public void teredit(){
        System.out.println("=================================================");
        System.out.println("        Data Kacamata Berhasil Diperbarui        ");
    }
    
    public void terhapus(){
        System.out.println("=================================================");
        System.out.println("          Data Kacamata Berhasil Dihapus         ");
    }
}
