/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_2;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Kacamata {
    private int kode;
    private String material;
    private String nama;
    private String warna;
    private String jenisLensa;
    private int harga;
    private int garansi;
    private int stok;
    
    public Kacamata(int kode, String material, String nama, String warna, String jenisLensa, int harga, int garansi, int stok){
        this.kode = kode;
        this.material = material;
        this.nama = nama;
        this.warna = warna;
        this.jenisLensa = jenisLensa;
        this.harga = harga;
        this.garansi = garansi;
        this.stok = stok;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
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

