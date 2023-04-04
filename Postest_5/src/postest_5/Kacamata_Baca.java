/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_5;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public final class Kacamata_Baca extends Kacamata {
    private String lensaTambahan; 
    
    public final String jenisKacamata = "Kacamata Baca";

    public Kacamata_Baca(int kode, String materialFrame, String nama, String warna, String jenisLensa, String lensaTambahan, int harga, int garansiLensa, int garansiFrame, int stok, String jenisKacamata) {
        super(kode, materialFrame, nama, warna, jenisLensa, harga, garansiLensa, garansiFrame, stok);
        this.lensaTambahan = lensaTambahan;
    }

    public String getLensaTambahan() {
        return lensaTambahan;
    }

    public void setLensaTambahan(String lensaTambahan) {
        this.lensaTambahan = lensaTambahan;
    }
    
    public String getJenisKacamata() {
        return jenisKacamata;
    }
    
    @Override
    public void tertambah(){
        System.out.println("=================================================");
        System.out.println("     Data " + this.jenisKacamata + " Berhasil Ditambahkan     ");
    }
    
    @Override
    public void tertampil(){
        System.out.println("Kode                  : " + this.kode);
        System.out.println("Material Frame        : " + this.materialFrame);
        System.out.println("Nama Frame            : " + this.nama);
        System.out.println("Warna                 : " + this.warna);
        System.out.println("Jenis Lensa           : " + this.jenisLensa);
        System.out.println("Lensa Tambahan        : " + this.lensaTambahan);
        System.out.println("Harga                 : Rp. " + this.harga);
        System.out.println("Garansi Lensa         : " + this.garansiLensa + " Tahun");
        System.out.println("Garansi Frame         : " + this.garansiFrame + " Bulan");
        System.out.println("Stok                  : " + this.stok);
        System.out.println("Status                : " + getStatus());
    }
    
    @Override
    public void teredit(){
        System.out.println("=================================================");
        System.out.println("      Data " + this.jenisKacamata + " Berhasil Diperbarui     ");
    }
    
    @Override
    public void terhapus(){
        System.out.println("=================================================");
        System.out.println("       Data " + this.jenisKacamata + " Berhasil Dihapus       ");
    }
}
