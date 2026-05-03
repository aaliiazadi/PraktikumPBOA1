public class Kucing extends Anabul {
 
    private double bobot;
 
    public Kucing(String nama, String warna, double bobot) {
        super(nama, warna);
        this.bobot = bobot;
    }
 
    public double getBobot() {
        return bobot;
    }
 
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