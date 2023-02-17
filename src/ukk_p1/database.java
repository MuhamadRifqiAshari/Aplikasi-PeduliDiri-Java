/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukk_p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author micro
 */
public class database implements Serializable {
    ArrayList<user> listUser;
    ArrayList<catatan> listCatatan;
    
    public database() {
        listUser = new ArrayList<>();
        listCatatan = new ArrayList<>();
    }
    
    public void saveDataUser(user u) {
        String filename = "src/file";
        File f = new File(filename);
        if (f.exists()) {
            loadDataUser();
        }else{
            f.mkdir();
        }
        this.listUser.add(u);
        try {
            FileOutputStream writeData = new FileOutputStream(filename+"/Config.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            
            writeStream.writeObject(this.listUser);
            writeStream.flush();
            writeStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void loadDataUser() {
        try {
            String filename = "src/file/Config.txt";
            FileInputStream readData = new FileInputStream(filename);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            
            this.listUser = (ArrayList<user>) readStream.readObject();
            readStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public user searchUser(String nik, String nama) {
        user u = null;
        loadDataUser();
        for (int i =0; i< this.listUser.size(); i++) {
            if (this.listUser.get(i).getNik().equals(nik) &&
                    this.listUser.get(i).getNama().equals(nama)) {
                u = this.listUser.get(i);
            }
        }
        return u;
    }
    
    public void loadDataCatatan(String nik) {
        try {
            String filename = "src/file/catatan-"+nik+".txt";
            FileInputStream readData = new FileInputStream(filename);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            
            this.listCatatan = (ArrayList<catatan>) readStream.readObject();
            readStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveDataCatatan(catatan c, String nik) {
        String filename = "src/file/catatan-"+nik+".txt";
        File f = new File(filename);
        if (f.exists()) {
            loadDataUser();
        }else{
            f.mkdir();
        }
        this.listCatatan.add(c);
        try {
            FileOutputStream writeData = new FileOutputStream(filename+"/Config.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            
            writeStream.writeObject(this.listUser);
            writeStream.flush();
            writeStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<catatan> getListCatatan() {
        return listCatatan;
    }
    
    
}
