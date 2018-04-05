/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01pbo;

/**
 *
 * @author ASUS
 */
public class PohonBerbuah {
    public static void main(String[] args) {
        PohonBuah Kelapa = new PohonBuah();
        PohonBuah Mangga = new PohonBuah();
        PohonBuah Nangka = new PohonBuah();
        
        Kelapa.namapohon="Pohon Kelapa";
        Kelapa.bentukbuah="Bulat";
        Kelapa.bentukdaun="Panjang";
        Kelapa.jenisakar="Serabut";
        Kelapa.perkembangan="3 meter";
        
        Mangga.namapohon="Pohon Mangga";
        Mangga.bentukbuah="Lonjong";
        Mangga.bentukdaun="Panjang";
        Mangga.jenisakar="Tunggang";
        Mangga.perkembangan="1.5 meter";
        
        Nangka.namapohon="Pohon Nangka";
        Nangka.bentukbuah="Bulat Berduri";
        Nangka.bentukdaun="Lebar";
        Nangka.jenisakar="Tunggang";
        Nangka.perkembangan="2 meter";
        
        Kelapa.cetakInfo();
        Mangga.cetakInfo();
        Nangka.cetakInfo();
        
        
    }
}
