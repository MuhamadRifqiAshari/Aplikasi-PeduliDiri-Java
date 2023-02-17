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
public class user implements Serializable{
        // TODO code application logic here
        private String nik;
        private String nama;
        private String foto;

    public user() {
    }

    public user(String nik, String nama, String foto) {
        this.nik = nik;
        this.nama = nama;
        this.foto = foto;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
        
        
}
