/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung gaji pegawai
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = hadir * 10000;
            
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabaran){
        if(jabatan.equals("Manager")){
            tunjanganJabatan = 2000000;
        }else if(jabatan.equals("Kabag")){
            tunjanganJabatan =1000000;
        }else{
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1 :
                tunjanganGolongan = 500000;
                break;
            case 2 :
                tunjanganGolongan = 1000000;
                break;
            case 3 :
                tunjanganGolongan = 1500000;
                break;
            default :
                tunjanganGolongan = 0;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
