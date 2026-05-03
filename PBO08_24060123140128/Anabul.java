public abstract class Anabul {
 
    protected String nama;
    protected String warna;
 
    public Anabul(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
 
    public String getNama() {
        return nama;
    }
 
    public String getWarna() {
        return warna;
    }
 
    public abstract String suara();
 
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[nama=" + nama + ", warna=" + warna + "]";
    }
}