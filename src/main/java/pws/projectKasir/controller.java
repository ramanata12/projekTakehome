/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.projectKasir;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pws.projectKasir.compute;

/**
 *
 * @author MSi-GAMING
 */
@Controller
public class controller {
    
    compute data = new compute();
    
    @RequestMapping("/hasil")
    public String buyer(@RequestParam(value="nama") String nama,
                        @RequestParam(value="harga") String harga,
                        @RequestParam(value="jumlah") String jumlah,
                        @RequestParam(value="bayar") String bayar,
                        Model model){
        
        int hrg, jml, totBarang, diskon, laba, byr;
        
        hrg = Integer.parseInt(harga);
        jml = Integer.parseInt(jumlah);
        byr = Integer.parseInt(bayar);
        
        // Proses Perhitungan
        totBarang = data.getTotal(hrg, jml);
        diskon = data.getDiskon(hrg, jml);
        laba = data.ketDiskon(hrg, jml);
        String Kembalian = data.getKembalian(byr, diskon);
        
        model.addAttribute("nama", nama);
        model.addAttribute("harga","Rp " +hrg);
        model.addAttribute("jumlah", jml);
        model.addAttribute("total", "Rp " + totBarang); // total sebelum diskon
        model.addAttribute("diskon", "Rp " + diskon ); // total akhir
        model.addAttribute("kembalian", Kembalian); // kembalian
        model.addAttribute("bayar","Rp " +  byr); // Bayar
        model.addAttribute("laba", laba + " %");
        
        
        return "view";
    }
}