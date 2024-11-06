/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_instansiasi_naylavika;

/**
 *
 * @author LENOVO
 */
public class Uts_instansiasi_naylavika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1=new mahasiswa();
        
        mahasiswa1.nama = " Nayla Vika Silvina";
        mahasiswa1.Prodi = " Sistem Informasi";
        mahasiswa1.semester = 3;
        mahasiswa1.usia = 19;
        mahasiswa1.Alamat = " Tandam Hilir 2";
        
        mahasiswa1.perkenalan();
    }
    
}
