public class AngkaSial {

    public static void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException("Jangan masukkan angka 13 karena angka sial!");
        }
        System.out.println("Angka " + angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        try {
            cobaAngka(10);
            cobaAngka(13);
            cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }

        System.out.println("Program selesai");
    }
}