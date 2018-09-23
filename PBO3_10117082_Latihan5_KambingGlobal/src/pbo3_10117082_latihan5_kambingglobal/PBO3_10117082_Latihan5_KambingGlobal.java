/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan5_kambingglobal;

/**
 *
 * @author Nama : WIDIAMEGA K
 *         Kelas : IF3
 *         NIM    : 10117082
 */
public class PBO3_10117082_Latihan5_KambingGlobal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
