/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_1;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Kacamata {
    int kode;
    String material;
    String nama;
    String warna;
    String jenisLensa;
    int harga;
    int garansi;
    int stok;
    
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

