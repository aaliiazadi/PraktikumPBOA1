public class Mainoperator {
 
    public static void main(String[] args) {
 
        System.out.println("===== Aplikasi Generik pada Operator =====\n");
 
        System.out.println("-- Tukar<Integer> --");
        Integer[] angka = {3, 6};
        System.out.println("sebelum : a=" + angka[0] + ", b=" + angka[1]);
        Operatorgenerik.tukar(angka);
        System.out.println("sesudah : a=" + angka[0] + ", b=" + angka[1]);
        System.out.println();
 
        System.out.println("-- Tukar<String> --");
        String[] kata = {"Java", "Generik"};
        System.out.println("sebelum : a=" + kata[0] + ", b=" + kata[1]);
        Operatorgenerik.tukar(kata);
        System.out.println("sesudah : a=" + kata[0] + ", b=" + kata[1]);
        System.out.println();
 
        System.out.println("-- Tukar<Anabul> --");
        Anabul[] hewanArr = {
            new Anjing("Buddy", "Coklat"),
            new Anggora("Mochi", "Putih", 3.5)
        };
        System.out.println("sebelum : a=" + hewanArr[0] + ", b=" + hewanArr[1]);
        Operatorgenerik.tukar(hewanArr);
        System.out.println("sesudah : a=" + hewanArr[0] + ", b=" + hewanArr[1]);
        System.out.println();
 
        System.out.println("-- Tukar<Kucing> --");
        Kucing[] kucingArr = {
            new Anggora("Luna", "Abu-abu", 4.0),
            new Kembangtelon("Telo", "Tricolor", 2.8)
        };
        System.out.println("sebelum : a=" + kucingArr[0] + ", b=" + kucingArr[1]);
        Operatorgenerik.tukar(kucingArr);
        System.out.println("sesudah : a=" + kucingArr[0] + ", b=" + kucingArr[1]);
        System.out.println();
 
        System.out.println("-- Bobot2<T extends Kucing> --");
        Anggora k1 = new Anggora("Snowy", "Putih", 5.1);
        Kembangtelon k2 = new Kembangtelon("Kopi", "Hitam-Putih", 3.2);
 
        System.out.println("bobot " + k1.getNama() + " = " + k1.getBobot() + " kg");
        System.out.println("bobot " + k2.getNama() + " = " + k2.getBobot() + " kg");
        System.out.println("total bobot (bobot2) = " + Operatorgenerik.bobot2(k1, k2) + " kg");
        System.out.println();
 
        System.out.println("===== Selesai Bagian II =====");
    }
}
