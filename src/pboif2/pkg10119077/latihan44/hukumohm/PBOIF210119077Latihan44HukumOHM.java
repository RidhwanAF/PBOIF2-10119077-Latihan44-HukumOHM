/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan44.hukumohm;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Hukum OHM
 */
public class PBOIF210119077Latihan44HukumOHM {

    public static void main(String[] args) {
        Baterai objBaterai = new Baterai();
        
        Baterai objBaterai1 = new Baterai(3, 12);
        System.out.println("Kuat Arus : "+objBaterai1.getKuatArus());
        System.out.println("Hambatan : "+objBaterai1.getHambatan());
        System.out.println("Hasil tegangan : "+objBaterai1.hitungTegangan());
        
    }
    
}
