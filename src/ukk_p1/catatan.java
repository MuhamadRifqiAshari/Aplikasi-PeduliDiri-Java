/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukk_p1;

import java.io.Serializable;

/**
 *
 * @author micro
 */
public class catatan implements Serializable{
    private String tanggal;
    private String waktu;
    private String lokasi;
    int suhu_tumbuh;

    public catatan() {
    }

    public catatan(String tanggal, String waktu, String lokasi, int suhu_tumbuh) {
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.lokasi = lokasi;
        this.suhu_tumbuh = suhu_tumbuh;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getSuhu_tumbuh() {
        return suhu_tumbuh;
    }

    public void setSuhu_tumbuh(int suhu_tumbuh) {
        this.suhu_tumbuh = suhu_tumbuh;
    }
    
    
}
