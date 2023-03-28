/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_4;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Kacamata_Baca extends Kacamata {
    private String lensaTambahan; 

    public Kacamata_Baca(int kode, String materialFrame, String nama, String warna, String jenisLensa, String lensaTambahan, int harga, int garansiLensa, int garansiFrame, int stok) {
        super(kode, materialFrame, nama, warna, jenisLensa, harga, garansiLensa, garansiFrame, stok);
        this.lensaTambahan = lensaTambahan;
    }

    public String getLensaTambahan() {
        return lensaTambahan;
    }

    public void setLensaTambahan(String lensaTambahan) {
        this.lensaTambahan = lensaTambahan;
    }
    
    @Override
    public void tertambah(){
        System.out.println("=================================================");
        System.out.println("     Data Kacamata Baca Berhasil Ditambahkan     ");
    }
    
    @Override
    public void teredit(){
        System.out.println("=================================================");
        System.out.println("      Data Kacamata Baca Berhasil Diperbarui     ");
    }
    
    @Override
    public void terhapus(){
        System.out.println("=================================================");
        System.out.println("       Data Kacamata Baca Berhasil Dihapus       ");
    }
}
