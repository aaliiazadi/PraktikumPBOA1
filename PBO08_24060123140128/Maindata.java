// aplikasi kelas generik Data (soal III.4.a sampai III.4.d)
public class Maindata {
 
    public static void main(String[] args) {
 
        System.out.println("===== Aplikasi Larik Generik Data =====\n");
 
        System.out.println("-- Data<Integer> --");
        Data<Integer> dataAngka = new Data<>();
        dataAngka.setIsi(1, 10);
        dataAngka.setIsi(2, 20);
        dataAngka.setIsi(3, 30);
        System.out.println("getIsi(1) = " + dataAngka.getIsi(1));
        System.out.println("getIsi(2) = " + dataAngka.getIsi(2));
        System.out.println("getIsi(3) = " + dataAngka.getIsi(3));
        System.out.println("getSize() = " + dataAngka.getSize());

        dataAngka.setIsi(0, 99);
        dataAngka.setIsi(101, 99);
        System.out.println();
 
        System.out.println("-- (b) setIsi dengan keluarga Anabul --");
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Anggora("Mochi", "Putih", 3.5));
        dataAnabul.setIsi(2, new Anggora("Snowy", "Krem", 4.0));
        dataAnabul.setIsi(3, new Kembangtelon("Telo", "Tricolor", 2.8));
        dataAnabul.setIsi(4, new Anjing("Buddy", "Coklat"));
        dataAnabul.setIsi(5, new Anjing("Max", "Hitam"));
        System.out.println("5 data anabul berhasil disimpan");
        System.out.println();
 
        System.out.println("-- (c) getIsi dengan keluarga Anabul --");
        for (int i = 1; i <= 5; i++) {
            Anabul h = dataAnabul.getIsi(i);
            System.out.println("posisi " + i + " -> " + h + " | suara: " + h.suara());
        }

        System.out.println("posisi 10 -> " + dataAnabul.getIsi(10) + " (belum diisi)");
        System.out.println();
 
        System.out.println("-- (d) getSize dengan keluarga Anabul --");
        System.out.println("jumlah elemen efektif = " + dataAnabul.getSize());
        dataAnabul.setIsi(6, new Kembangtelon("Kopi", "Hitam-Putih", 3.1));
        System.out.println("setelah tambah 1, getSize() = " + dataAnabul.getSize());
        System.out.println();
 
        System.out.println("-- Data<Kucing> --");
        Data<Kucing> dataKucing = new Data<>();
        dataKucing.setIsi(1, new Anggora("Luna", "Abu-abu", 4.2));
        dataKucing.setIsi(2, new Kembangtelon("Gepeng", "Belang", 2.5));
        dataKucing.setIsi(3, new Kucing("Garfield", "Oranye", 6.0));
        for (int i = 1; i <= 3; i++) {
            Kucing k = dataKucing.getIsi(i);
            System.out.println("posisi " + i + " -> " + k + " | bobot: " + k.getBobot() + " kg");
        }
        System.out.println("getSize() = " + dataKucing.getSize());
        System.out.println();
 
        System.out.println("===== Selesai Bagian III =====");
    }
}