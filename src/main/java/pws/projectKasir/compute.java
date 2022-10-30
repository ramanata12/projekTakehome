/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.projectKasir;

/**
 *
 * @author MSi-GAMING
 */

public class compute {
      public int getTotal(int harga, int jumlah){
        int total = harga * jumlah;
        
        return total;
    }
    
//    Diskon
    public int getDiskon(int harga, int jumlah){
        int total = harga * jumlah;
        int diskon;
        
        if(total <= 10000){
            diskon = total - (total * 0);
        }
        else if((total > 10000) && (total <= 50000)){
            diskon = total - (total * 5/100);
        }
        else if( (total > 50000) && (total <= 100000)){
            diskon = total - (total * 10/100);
        }
        else{
            diskon = total - (total * 15/100);
        }
        
        return diskon;
    }

    public int ketDiskon(int harga, int jumlah){
        int total = harga * jumlah;
        int diskon;
        
        if(total <= 10000){
            diskon = 0;
        }
        else if((total > 10000) && (total <= 50000)){
            diskon = 5;
        }
        else if((total > 50000) && (total <= 100000)){
            diskon = 10;
        }
        else{
            diskon = 15;
        }
        
        return diskon;
    }
    
    public String getKembalian(int uangBayar, int getPotongan){
        int kembalian = uangBayar- getPotongan;
        
        String hasil;
        
        if(uangBayar >= getPotongan){
            hasil = "Rp " + kembalian;
        }
        else{
            hasil = "Uang ga cukup";
        }
        
        return hasil;
        
        
    }
}

