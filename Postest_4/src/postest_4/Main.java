/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */

public class Main {

    static ArrayList<Kacamata_Baca> kacamataBaca = new ArrayList<Kacamata_Baca>();
    static ArrayList<Kacamata_Minus> kacamataMinus = new ArrayList<Kacamata_Minus>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        while (true) {
            System.out.println("=================================================");
            System.out.println("         Sistem Pendataan Jenis Kacamata         ");
            System.out.println("                Optik Terang Jaya                ");
            System.out.println("=================================================");
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Masukkan Data Kacamata");
            System.out.println("2. Menampilkan Data Kacamata");
            System.out.println("3. Mengedit Data Kacamata");
            System.out.println("4. Menghapus Data Kacamata");
            System.out.println("5. Keluar");
            System.out.print("\nMasukan Pilihan Menu [1, 2, 3, 4, atau 5] : ");
            int menu = Integer.parseInt(br.readLine());
            if (menu == 1)
            {
                tambahData();
            } 
            else if (menu == 2)
            {
                bacaData();
            } 
            else if (menu == 3)
            {
                editData();
            }
            else if (menu == 4)
            {
                hapusData();
            } 
            else if (menu == 5)
            {
                System.out.println("=================================================");
                System.out.println("                   Terima Kasih                  ");
                System.out.println("=================================================");
                System.exit(0);
            } 
            else 
            {
                System.out.println("=================================================");
                System.out.println("      Mohon Maaf Pilihan Menu Tidak Tersedia     ");
            }
        }
    } 
    
    public static void jenisKacamata()
    {
        System.out.println("=================================================");
        System.out.println("Silahkan Pilih Jenis Kacamata");
        System.out.println("1. Kacamata Baca");
        System.out.println("2. Kacamata Minus");
    }
    
    public static void tambahData() throws IOException
    {
        jenisKacamata();
        
        System.out.print("\nMasukan Pilihan Jenis [1 atau 2] : ");
        int tambah = Integer.parseInt(br.readLine());
        System.out.println("=================================================");
        if (tambah == 1) 
        {
            System.out.print("Kode                  : ");
            int addKode = Integer.parseInt(br.readLine());
            System.out.print("Material Frame        : ");
            String addMaterial = br.readLine();
            System.out.print("Nama Frame            : ");
            String addNama = br.readLine();
            System.out.print("Warna                 : ");
            String addWarna = br.readLine();
            System.out.print("Jenis Lensa           : ");
            String addJenisLensa = br.readLine();
            System.out.print("Lensa Tambahan        : ");
            String addLensaTambahan = br.readLine();
            System.out.print("Harga                 : Rp. ");
            int addHarga = Integer.parseInt(br.readLine());
            System.out.print("Garansi Lensa [Tahun] : ");
            int addGaransiLensa = Integer.parseInt(br.readLine());
            System.out.print("Garansi Frame [Bulan] : ");
            int addGaransiFrame = Integer.parseInt(br.readLine());
            System.out.print("Stok                  : ");
            int addStok = Integer.parseInt(br.readLine());
        
            Kacamata_Baca kcmtBca = new Kacamata_Baca(addKode, addMaterial, addNama, addWarna, addJenisLensa, addLensaTambahan, addHarga, addGaransiLensa, addGaransiFrame, addStok); 
            kacamataBaca.add(kcmtBca); 
            
            kcmtBca.infoTambah(addKode, addGaransiLensa, addGaransiFrame);
            kcmtBca.tertambah();
        } 
        else if (tambah == 2)
        {
            System.out.print("Kode                  : ");
            int addKode1 = Integer.parseInt(br.readLine());
            System.out.print("Material Frame        : ");
            String addMaterial1 = br.readLine();
            System.out.print("Nama Frame            : ");
            String addNama1 = br.readLine();
            System.out.print("Warna                 : ");
            String addWarna1 = br.readLine();
            System.out.print("Jenis Lensa           : ");
            String addJenisLensa1 = br.readLine();
            System.out.print("Harga                 : Rp. ");
            int addHarga1 = Integer.parseInt(br.readLine());
            System.out.print("Garansi Lensa [Tahun] : ");
            int addGaransiLensa1 = Integer.parseInt(br.readLine());
            System.out.print("Garansi Frame [Bulan] : ");
            int addGaransiFrame1 = Integer.parseInt(br.readLine());
            System.out.print("Bonus                 : ");
            String addBonus = br.readLine();
            System.out.print("Stok                  : ");
            int addStok1 = Integer.parseInt(br.readLine());
        
            Kacamata_Minus kcmtMns = new Kacamata_Minus(addKode1, addMaterial1, addNama1, addWarna1, addJenisLensa1, addHarga1, addGaransiLensa1, addGaransiFrame1, addBonus, addStok1); 
            kacamataMinus.add(kcmtMns); 
            
            kcmtMns.infoTambah(addKode1, addGaransiLensa1, addGaransiFrame1);
            kcmtMns.tertambah();
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("     Mohon Maaf Jenis Kacamata Tidak Tersedia    ");
        }
    }
    
    public static void bacaDataKcmtBca() throws IOException
    {
        System.out.println("=================================================");
        System.out.println("      Data Kacamata Baca Optik Terang Jaya       ");
        System.out.println("=================================================");
        for (int i = 0; i < kacamataBaca.size(); i++) 
        {
            System.out.println("Data Kacamata " + (i+1));
            System.out.println("Kode                  : " + kacamataBaca.get(i).getKode());
            System.out.println("Material Frame        : " + kacamataBaca.get(i).getMaterialFrame());
            System.out.println("Nama Frame            : " + kacamataBaca.get(i).getNama());
            System.out.println("Warna                 : " + kacamataBaca.get(i).getWarna());
            System.out.println("Jenis Lensa           : " + kacamataBaca.get(i).getJenisLensa());
            System.out.println("Lensa Tambahan        : " + kacamataBaca.get(i).getLensaTambahan());
            System.out.println("Harga                 : Rp. " + kacamataBaca.get(i).getHarga());
            System.out.println("Garansi Lensa         : " + kacamataBaca.get(i).getGaransiLensa() + " Tahun");
            System.out.println("Garansi Frame         : " + kacamataBaca.get(i).getGaransiFrame() + " Bulan");
            System.out.println("Stok                  : " + kacamataBaca.get(i).getStok());
            System.out.print("\n");
        }
    }
    
    public static void bacaDataKcmtMns() throws IOException
    {
        System.out.println("=================================================");
        System.out.println("      Data Kacamata Minus Optik Terang Jaya      ");
        System.out.println("=================================================");
        for (int i = 0; i < kacamataMinus.size(); i++) 
        {
            System.out.println("Data Kacamata " + (i+1));
            System.out.println("Kode                  : " + kacamataMinus.get(i).getKode());
            System.out.println("Material Frame        : " + kacamataMinus.get(i).getMaterialFrame());
            System.out.println("Nama Frame            : " + kacamataMinus.get(i).getNama());
            System.out.println("Warna                 : " + kacamataMinus.get(i).getWarna());
            System.out.println("Jenis Lensa           : " + kacamataMinus.get(i).getJenisLensa());
            System.out.println("Harga                 : Rp. " + kacamataMinus.get(i).getHarga());
            System.out.println("Garansi Lensa         : " + kacamataMinus.get(i).getGaransiLensa() + " Tahun");
            System.out.println("Garansi Frame         : " + kacamataMinus.get(i).getGaransiFrame() + " Bulan");
            System.out.println("Bonus                 : " + kacamataMinus.get(i).getBonus());
            System.out.println("Stok                  : " + kacamataMinus.get(i).getStok());
            System.out.print("\n");
        }
    }
    
    public static void bacaData() throws IOException
    {
        jenisKacamata();
        
        System.out.print("\nMasukan Pilihan Jenis [1 atau 2] : ");
        int baca = Integer.parseInt(br.readLine());
        if (baca == 1)
        {
            bacaDataKcmtBca();
        }
        else if (baca == 2)
        {
            bacaDataKcmtMns();
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("     Mohon Maaf Jenis Kacamata Tidak Tersedia    ");
        }
    }
    
    public static void editData() throws IOException
    {
        jenisKacamata();
        
        System.out.print("\nMasukan Pilihan Jenis [1 atau 2] : ");
        int baca_edit = Integer.parseInt(br.readLine());
        if (baca_edit == 1)
        {
            bacaDataKcmtBca();
            
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Kacamata yang akan diubah : ");
            int edit = Integer.parseInt(br.readLine());
            System.out.println("=================================================");
            
            if(edit <= kacamataBaca.size() || edit > 0)
            {
                System.out.print("Kode                  : ");
                int addKode = Integer.parseInt(br.readLine());
                kacamataBaca.get(edit-1).setKode(addKode);
            
                System.out.print("Material Frame        : ");
                String addMaterial = br.readLine();
                kacamataBaca.get(edit-1).setMaterialFrame(addMaterial);
            
                System.out.print("Nama Frame            : ");
                String addNama = br.readLine();
                kacamataBaca.get(edit-1).setNama(addNama);
            
                System.out.print("Warna                 : ");
                String addWarna = br.readLine();
                kacamataBaca.get(edit-1).setWarna(addWarna);
            
                System.out.print("Jenis Lensa           : ");
                String addJenisLensa = br.readLine();
                kacamataBaca.get(edit-1).setJenisLensa(addJenisLensa);
                
                System.out.print("Lensa Tambahan        : ");
                String addLensaTambahan = br.readLine();
                kacamataBaca.get(edit-1).setLensaTambahan(addLensaTambahan);
            
                System.out.print("Harga                 : Rp. ");
                int addHarga = Integer.parseInt(br.readLine());
                kacamataBaca.get(edit-1).setHarga(addHarga);
            
                System.out.print("Garansi Lensa [Tahun] : ");
                int addGaransiLensa = Integer.parseInt(br.readLine());
                kacamataBaca.get(edit-1).setGaransiFrame(addGaransiLensa);
                
                System.out.print("Garansi Frame [Bulan] : ");
                int addGaransiFrame = Integer.parseInt(br.readLine());
                kacamataBaca.get(edit-1).setGaransiFrame(addGaransiFrame);
            
                System.out.print("Stok                  : ");
                int addStok = Integer.parseInt(br.readLine());
                kacamataBaca.get(edit-1).setStok(addStok);
                
                kacamataBaca.get(edit-1).infoEdit(addKode);
                kacamataBaca.get(edit-1).teredit();
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("           Data Kacamata Tidak Tersedia          ");
            }
        }
        else if (baca_edit == 2)
        {
            bacaDataKcmtMns();
            
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Kacamata yang akan diubah : ");
            int edit1 = Integer.parseInt(br.readLine());
            System.out.println("=================================================");
            
            if(edit1 <= kacamataMinus.size() || edit1 > 0)
            {
                System.out.print("Kode                  : ");
                int addKode = Integer.parseInt(br.readLine());
                kacamataMinus.get(edit1-1).setKode(addKode);
            
                System.out.print("Material Frame        : ");
                String addMaterial = br.readLine();
                kacamataMinus.get(edit1-1).setMaterialFrame(addMaterial);
            
                System.out.print("Nama Frame            : ");
                String addNama = br.readLine();
                kacamataMinus.get(edit1-1).setNama(addNama);
            
                System.out.print("Warna                 : ");
                String addWarna = br.readLine();
                kacamataMinus.get(edit1-1).setWarna(addWarna);
            
                System.out.print("Jenis Lensa           : ");
                String addJenisLensa = br.readLine();
                kacamataMinus.get(edit1-1).setJenisLensa(addJenisLensa);
            
                System.out.print("Harga                 : Rp. ");
                int addHarga = Integer.parseInt(br.readLine());
                kacamataMinus.get(edit1-1).setHarga(addHarga);
            
                System.out.print("Garansi Lensa [Tahun] : ");
                int addGaransiLensa = Integer.parseInt(br.readLine());
                kacamataMinus.get(edit1-1).setGaransiFrame(addGaransiLensa);
                
                System.out.print("Garansi Frame [Bulan] : ");
                int addGaransiFrame = Integer.parseInt(br.readLine());
                kacamataMinus.get(edit1-1).setGaransiFrame(addGaransiFrame);
                
                System.out.print("Bonus                 : ");
                String addBonus = br.readLine();
                kacamataMinus.get(edit1-1).setBonus(addBonus);
                
                System.out.print("Stok                  : ");
                int addStok = Integer.parseInt(br.readLine());
                kacamataMinus.get(edit1-1).setStok(addStok);
                
                kacamataMinus.get(edit1-1).infoEdit(addKode);
                kacamataMinus.get(edit1-1).teredit();
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("           Data Kacamata Tidak Tersedia          ");
            }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("     Mohon Maaf Jenis Kacamata Tidak Tersedia    ");
        }
    }
    
    public static void hapusData() throws IOException
    {
        jenisKacamata();
        
        System.out.print("\nMasukan Pilihan Jenis [1 atau 2] : ");
        int baca_hapus = Integer.parseInt(br.readLine());
        if (baca_hapus == 1)
        {
            bacaDataKcmtBca();
            
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Kacamata yang akan dihapus : ");
            int hapus = Integer.parseInt(br.readLine());
            
            if(hapus <= kacamataBaca.size() || hapus > 0) 
            {
                kacamataBaca.remove(hapus-1).terhapus();
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("           Data Kacamata Tidak Tersedia          ");
            }
        }
        else if (baca_hapus == 2)
        {
            bacaDataKcmtMns();
            
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Kacamata yang akan dihapus : ");
            int hapus1 = Integer.parseInt(br.readLine());
            
            if(hapus1 <= kacamataMinus.size() || hapus1 > 0) 
            {
                kacamataMinus.remove(hapus1-1).terhapus();
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("           Data Kacamata Tidak Tersedia          ");
            }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("     Mohon Maaf Jenis Kacamata Tidak Tersedia    ");
        }
    }
}
