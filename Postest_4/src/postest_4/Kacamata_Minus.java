/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_4;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
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

    @Override
    public void tertambah(){
        System.out.println("=================================================");
        System.out.println("     Data Kacamata Minus Berhasil Ditambahkan    ");
    }
    
    @Override
    public void teredit(){
        System.out.println("=================================================");
        System.out.println("     Data Kacamata Minus Berhasil Diperbarui     ");
    }
    
    @Override
    public void terhapus(){
        System.out.println("=================================================");
        System.out.println("       Data Kacamata Minus Berhasil Dihapus      ");
    }
}
