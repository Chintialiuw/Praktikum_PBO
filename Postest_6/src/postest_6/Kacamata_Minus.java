/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public final class Kacamata_Minus extends Kacamata implements Level2 {
    private String bonus;
    
    final String jenisKacamata = "Kacamata Minus";

    public Kacamata_Minus(int kode, String materialFrame, String nama, String warna, String jenisLensa, int harga, int garansiLensa, int garansiFrame, String bonus, int stok, String jenisKacamata) {
        super(kode, materialFrame, nama, warna, jenisLensa, harga, garansiLensa, garansiFrame, stok);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getJenisKacamata() {
        return jenisKacamata;
    }
    
    @Override
    public void tertambah(){
        System.out.println("=================================================");
        System.out.println("     Data " + this.jenisKacamata + " Berhasil Ditambahkan    ");
    }
    
    @Override
    public void tertampil(){
        System.out.println("Kode                  : " + this.kode);
        System.out.println("Material Frame        : " + this.materialFrame);
        System.out.println("Nama Frame            : " + this.nama);
        System.out.println("Warna                 : " + this.warna);
        System.out.println("Jenis Lensa           : " + Lensa());
        System.out.println("Ukuran Lensa          : " + this.jenisLensa);
        System.out.println("Merk Anti Radiasi     : " + MerkAntiRadiasi());
        System.out.println("Tingkatan Lensa       : " + TingkatanLensa());
        System.out.println("Harga                 : Rp. " + this.harga);
        System.out.println("Garansi Lensa         : " + this.garansiLensa + " Tahun");
        System.out.println("Garansi Frame         : " + this.garansiFrame + " Bulan");
        System.out.println("Bonus                 : " + this.bonus);
        System.out.println("Stok                  : " + this.stok);
        System.out.println("Status                : " + getStatus());  
    }
    
    @Override
    public void teredit(){
        System.out.println("=================================================");
        System.out.println("     Data " + this.jenisKacamata + " Berhasil Diperbarui     ");
    }
    
    @Override
    public void terhapus(){
        System.out.println("=================================================");
        System.out.println("       Data " + this.jenisKacamata + " Berhasil Dihapus      ");
    }
    
    @Override
    public String Lensa(){
        return "Clip On";
    }
    
    @Override
    public String MerkAntiRadiasi(){
        return "Hoya Photo Grey";
    }
    
    @Override
    public String TingkatanLensa(){
        return "UV 420";
    }
}
