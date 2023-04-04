/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_5;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public abstract class Kacamata {
    protected int kode;
    protected String materialFrame;
    protected String nama;
    protected String warna;
    protected String jenisLensa;
    protected int harga;
    protected int garansiLensa;
    protected int garansiFrame;
    protected int stok;

    public Kacamata(int kode, String materialFrame, String nama, String warna, String jenisLensa, int harga, int garansiLensa, int garansiFrame, int stok) {
        this.kode = kode;
        this.materialFrame = materialFrame;
        this.nama = nama;
        this.warna = warna;
        this.jenisLensa = jenisLensa;
        this.harga = harga;
        this.garansiLensa = garansiLensa;
        this.garansiFrame = garansiFrame;
        this.stok = stok;
    }
    
    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getMaterialFrame() {
        return materialFrame;
    }

    public void setMaterialFrame(String materialFrame) {
        this.materialFrame = materialFrame;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenisLensa() {
        return jenisLensa;
    }

    public void setJenisLensa(String jenisLensa) {
        this.jenisLensa = jenisLensa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getGaransiLensa() {
        return garansiLensa;
    }

    public void setGaransiLensa(int garansiLensa) {
        this.garansiLensa = garansiLensa;
    }

    public int getGaransiFrame() {
        return garansiFrame;
    }

    public void setGaransiFrame(int garansiFrame) {
        this.garansiFrame = garansiFrame;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public final String getStatus() {
        return "Ready";
    }

    public abstract void tertambah();
    public abstract void tertampil();
    public abstract void teredit();
    public abstract void terhapus();
    
    //Overloading
    public void info(int kode, int garansiLensa, int garansiFrame){
        System.out.println("-------------------------------------------------");
        System.out.println("Data Kacamata dengan Kode " + kode + " memiliki");
        System.out.println("Garansi Lensa " + garansiLensa + " Tahun dan Frame " + garansiFrame + " Bulan");
    }
    
    //Overloading
    public void info(int kode){
        System.out.println("-------------------------------------------------");
        System.out.println("      Data Kacamata dengan Kode " + kode + " diedit !     ");
    }
}
