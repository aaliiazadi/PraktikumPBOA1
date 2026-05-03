public class Anggora extends Kucing {
 
    public Anggora(String nama, String warna, double bobot) {
        super(nama, warna, bobot);
    }
 
    @Override
    public String suara() {
        return "Purrr... Meow!";
    }
}