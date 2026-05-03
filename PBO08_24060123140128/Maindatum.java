public class Maindatum {
 
    public static void main(String[] args) {
 
        System.out.println("===== Aplikasi Kelas Generik Datum =====\n");
 
        System.out.println("-- Datum<Integer> --");
        Datum<Integer> datumAngka = new Datum<>(42);
        System.out.println("isi awal    : " + datumAngka.getIsi());
        datumAngka.setIsi(100);
        System.out.println("setelah setIsi(100) : " + datumAngka.getIsi());
        System.out.println();
 
        System.out.println("-- Datum<String> --");
        Datum<String> datumTeks = new Datum<>("Halo Generik!");
        System.out.println("isi awal    : " + datumTeks.getIsi());
        datumTeks.setIsi("Belajar PBO itu seru!");
        System.out.println("setelah setIsi : " + datumTeks.getIsi());
        System.out.println();
 
        System.out.println("-- Datum<Anabul> berisi Anggora --");
        Anggora anggora = new Anggora("Mochi", "Putih", 3.5);
        Datum<Anabul> datumAnabul = new Datum<>(anggora);
        System.out.println("isi awal : " + datumAnabul.getIsi());
        System.out.println("suara    : " + datumAnabul.getIsi().suara());
 
        Kembangtelon kembang = new Kembangtelon("Telo", "Tricolor", 2.8);
        datumAnabul.setIsi(kembang);
        System.out.println("setelah diganti ke Kembangtelon : " + datumAnabul.getIsi());
        System.out.println("suara : " + datumAnabul.getIsi().suara());
        System.out.println();
 
        System.out.println("-- Datum<Anjing> --");
        Anjing anjing = new Anjing("Buddy", "Coklat");
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        System.out.println("isi awal : " + datumAnjing.getIsi());
        System.out.println("suara    : " + datumAnjing.getIsi().suara());
 
        datumAnjing.setIsi(new Anjing("Max", "Hitam"));
        System.out.println("setelah diganti : " + datumAnjing.getIsi());
        System.out.println();
 
        System.out.println("===== Selesai Bagian I =====");
    }
}