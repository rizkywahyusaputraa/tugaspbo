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
          sepeda trhill = new sepeda();
          sepeda pasific = new sepeda();
          
          
          polygon.merk="polygon";
          polygon.warna="merah";
          polygon.harga="900000";
          polygon.jumlah_roda="2";
          polygon.kecepatan="30km/jam";
          
          
          trhill.merk="trhill";
          trhill.warna="Biru";
          trhill.harga="1000000";
          trhill.jumlah_roda="2 + cadangan";
          trhill.kecepatan="60km/jam";
          
          
           
          
          
          polygon.cetakInfo();
          trhill.cetakInfo();    }
    
}
