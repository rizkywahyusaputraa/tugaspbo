/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author User
 */
public class sepedaaksi {
    public static void main(String[] args) {
          sepeda polygon = new sepeda();
          
          polygon.merk="polygon";
          polygon.warna="merah";
          polygon.harga="900000";
          polygon.jumlah_roda="2";
          polygon.kecepatan="30km/jam";
          
          polygon.cetakInfo();
          
    }
    
}
