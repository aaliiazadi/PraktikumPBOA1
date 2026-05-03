public class Anjing extends Anabul {
 
    public Anjing(String nama, String warna) {
        super(nama, warna);
    }
 
    @Override
    public String suara() {
        return "Woof!";
    }
}