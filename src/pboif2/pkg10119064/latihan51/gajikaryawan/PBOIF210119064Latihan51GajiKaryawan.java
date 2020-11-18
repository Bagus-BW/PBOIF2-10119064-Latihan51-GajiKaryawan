/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan51.gajikaryawan;

import java.util.Scanner;
import model.Karyawan;
import model.Manager;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung gaji pegawai
 */
public class PBOIF210119064Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisilaisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisilaisasi objek manager
        Manager manager = new Manager();
        
        //input
        System.out.println("====Hasil Perhitungan====");
        System.out.print("Masukkan NIK      : ");
        manager.setNik(keyboard.next());
        keyboard.nextLine();
        System.out.print("Masukkan Nama     : ");
        manager.setNama(keyboard.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(keyboard.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(keyboard.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(keyboard.nextInt());
        
        //output
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK      : " + manager.getNik());
        System.out.println("NAMA     : " + manager.getNama());
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN  : " + manager.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN  : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }
    
}
