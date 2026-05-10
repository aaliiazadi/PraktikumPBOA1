// Fakhari Ali Azadi - 24060123140128
// Minggu, 10 Mei 2026

public class Kucing extends Anabul {
 
    private double bobot;
 
    public Kucing(String nama, String warna, double bobot) {
        super(nama, warna);
        this.bobot = bobot;
    }
 
    // buat ngambil bobotnya
    public double getBobot() {
        return bobot;
    }
 
    // buat ganti bobotnya
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
 
    @Override
    public String suara() {
        return "Meow!";
    }
 
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[nama=" + nama + ", warna=" + warna + ", bobot=" + bobot + "kg]";
    }
}