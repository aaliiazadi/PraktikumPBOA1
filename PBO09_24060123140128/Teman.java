// Fakhari Ali Azadi - 24060123140128
// Minggu, 10 Mei 2026

import java.util.ArrayList;
 
public class Teman {
 
    // nyimpen berapa banyak teman yang ada
    private int nbelm;
 
    // list nama-namanya
    private ArrayList<String> Lnama;
 
    // waktu bikin objek Teman, langsung siapin list-nya
    public Teman() {
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }
 
    public int getNbelm() {
        return nbelm;
    }
 
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        } else {
            System.out.println("[ERROR] indeks " + indeks + " di luar batas!");
            return null;
        }
    }
 
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("[ERROR] indeks " + indeks + " di luar batas!");
        }
    }
 
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }
 
    public void delNama(String nama) {
        boolean ketemu = false;
        for (int i = Lnama.size() - 1; i >= 0; i--) {
            if (Lnama.get(i).equalsIgnoreCase(nama)) {
                Lnama.remove(i);
                nbelm--;
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("[INFO] nama '" + nama + "' gak ada di daftar");
        }
    }
 
    public boolean isMember(String nama) {
        for (String n : Lnama) {
            if (n.equalsIgnoreCase(nama)) return true;
        }
        return false;
    }
 
    public void gantiNama(String nama, String namabaru) {
        boolean ketemu = false;
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equalsIgnoreCase(nama)) {
                Lnama.set(i, namabaru);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("[INFO] nama '" + nama + "' gak ditemukan buat diganti");
        }
    }
 
    public int countNama(String nama) {
        int jumlah = 0;
        for (String n : Lnama) {
            if (n.equalsIgnoreCase(nama))
                 jumlah++;
        }
        return jumlah;
    }
 
    public void showTeman() {
        System.out.println("         DAFTAR NAMA TEMAN             ");
        if (Lnama.isEmpty()) {
            System.out.println("  [daftar masih kosong]");
        } else {
            for (int i = 0; i < Lnama.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + Lnama.get(i));
            }
        }
        System.out.println("  total: " + nbelm + " teman");
    }
}