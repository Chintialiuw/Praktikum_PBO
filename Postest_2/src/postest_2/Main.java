/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest_2;
import java.util.*; 
import java.io.*;

/**
 *
 * @author DYNABOOK
 */
public class Main {
    
    static ArrayList<Kacamata> kacamata = new ArrayList<Kacamata>();
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
            if (menu == 1) {
                tambahData();
            } else if (menu == 2){
                bacaData();
            } else if (menu == 3){
                editData();
            } else if (menu == 4){
                hapusData();
            } else if (menu == 5){
                System.out.println("=================================================");
                System.out.println("                   Terima Kasih                  ");
                System.out.println("=================================================");
                System.exit(0);
            } else {
                System.out.println("=================================================");
                System.out.println("      Mohon Maaf Pilihan Menu Tidak Tersedia     ");
            }
        }
    }
        
    public static void tambahData() throws IOException{
        System.out.println("=================================================");
        System.out.print("Kode              : ");
        int addKode = Integer.parseInt(br.readLine());
        System.out.print("Material Frame    : ");
        String addMaterial = br.readLine();
        System.out.print("Nama Frame        : ");
        String addNama = br.readLine();
        System.out.print("Warna             : ");
        String addWarna = br.readLine();
        System.out.print("Jenis Lensa       : ");
        String addJenisLensa = br.readLine();
        System.out.print("Harga             : Rp. ");
        int addHarga = Integer.parseInt(br.readLine());
        System.out.print("Garansi [Tahun]   : ");
        int addGaransi = Integer.parseInt(br.readLine());
        System.out.print("Stok              : ");
        int addStok = Integer.parseInt(br.readLine());
        
        Kacamata kcmtBaru = new Kacamata(addKode, addMaterial, addNama, addWarna, addJenisLensa, addHarga, addGaransi, addStok); 
        kacamata.add(kcmtBaru);
        kcmtBaru.tertambah();
    }

    public static void bacaData() throws IOException{
        System.out.println("=================================================");
        System.out.println("         Data Kacamata Optik Terang Jaya         ");
        System.out.println("=================================================");
        for (int i = 0; i < kacamata.size(); i++) {
            System.out.println("Data Kacamata " + (i+1));
            System.out.println("Kode            : " + kacamata.get(i).kode);
            System.out.println("Material Frame  : " + kacamata.get(i).material);
            System.out.println("Nama Frame      : " + kacamata.get(i).nama);
            System.out.println("Warna           : " + kacamata.get(i).warna);
            System.out.println("Jenis Lensa     : " + kacamata.get(i).jenisLensa);
            System.out.println("Harga           : Rp. " + kacamata.get(i).harga);
            System.out.println("Garansi         : " + kacamata.get(i).garansi + " Tahun");
            System.out.println("Stok            : " + kacamata.get(i).stok);
            System.out.print("\n");
        }
    }
    
    public static void editData() throws IOException{

        bacaData();
        
        System.out.println("=================================================");
        System.out.print("Masukan Nomor Kacamata yang akan diubah : ");
        int edit = Integer.parseInt(br.readLine());
        System.out.println("=================================================");
        System.out.print("Kode              : ");
        int setKode = Integer.parseInt(br.readLine());
        System.out.print("Material Frame    : ");
        String setMaterial = br.readLine();
        System.out.print("Nama Frame        : ");
        String setNama = br.readLine();
        System.out.print("Warna             : ");
        String setWarna = br.readLine();
        System.out.print("Jenis Lensa       : ");
        String setJenisLensa = br.readLine();
        System.out.print("Harga             : Rp. ");
        int setHarga = Integer.parseInt(br.readLine());
        System.out.print("Garansi [Tahun]   : ");
        int setGaransi = Integer.parseInt(br.readLine());
        System.out.print("Stok              : ");
        int setStok = Integer.parseInt(br.readLine());

        kacamata.get(edit-1).kode = setKode;
        kacamata.get(edit-1).material = setMaterial;
        kacamata.get(edit-1).nama = setNama;
        kacamata.get(edit-1).warna = setWarna;
        kacamata.get(edit-1).jenisLensa = setJenisLensa;
        kacamata.get(edit-1).harga = setHarga;
        kacamata.get(edit-1).garansi = setGaransi;
        kacamata.get(edit-1).stok = setStok;

        kacamata.get(edit-1).teredit();
    }

    public static void hapusData() throws IOException{
        
        bacaData();
        
        System.out.println("=================================================");
        System.out.print("Masukan Nomor Kacamata yang akan dihapus : ");
        int hapus = Integer.parseInt(br.readLine());
    
        kacamata.remove(hapus-1).terhapus();
    }
}
