public class Kembangtelon extends Kucing {
 
    public Kembangtelon(String nama, String warna, double bobot) {
        super(nama, warna, bobot);
    }
 
    @Override
    public String suara() {
        return "Miyauw!";
    }
}