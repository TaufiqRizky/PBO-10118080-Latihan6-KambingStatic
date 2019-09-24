/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118080.latihan6.kambingstatic;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program menampilkan jumlah kambing dengan 2 class
 */


public class PBO10118080Latihan6KambingStatic {
    public static final String Nama_Kambing = "Midun";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jmlKambing=485000;
        System.out.println(Nama_Kambing+" Memiliki Kambing Sebanyak "+Mamalia.jmlKambing);
    }
    
}
