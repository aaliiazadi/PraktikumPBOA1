// Fakhari Ali Azadi - 24060123140128
// Minggu, 10 Mei 2026

public abstract class Anabul {
 
    protected String nama;
    protected String warna;
 
    // ini baru, nama panggilan buat si hewan (soal 2a)
    protected String panggilan;
 
    // konstruktor lama tetap ada, panggilan dikosongkan dulu
    public Anabul(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
        this.panggilan = nama; // defaultnya sama kayak nama biar gak kosong
    }
 
    // konstruktor baru yang langsung isi panggilan juga
    public Anabul(String nama, String warna, String panggilan) {
        this.nama = nama;
        this.warna = warna;
        this.panggilan = panggilan;
    }
 
    // ngambil nama biasa (dari minggu lalu)
    public String getNama() {
        return panggilan; // sekarang getNama() balik panggilan buat keperluan antrean
    }
 
    // ngambil warna (dari minggu lalu)
    public String getWarna() {
        return warna;
    }
 
    // ngambil nama panggilannya (soal 2a)
    public String getPanggilan() {
        return panggilan;
    }
 
    // ganti nama panggilannya (soal 2a)
    public void setNama(String nama) {
        this.panggilan = nama;
    }
 
    // suara tiap hewan beda, jadi abstract
    public abstract String suara();
 
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[nama=" + nama + ", warna=" + warna + ", panggilan=" + panggilan + "]";
    }
}