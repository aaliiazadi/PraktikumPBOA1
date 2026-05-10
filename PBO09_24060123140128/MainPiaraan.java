public class MainPiaraan {
 
    public static void main(String[] args) {
 
        System.out.println("===== Aplikasi Kelas Piaraan =====\n");
 
        Piaraan p = new Piaraan();
 
        // ii. enqueueAnabul — tambahin hewan ke antrean
        System.out.println("-- ii. enqueueAnabul --");
        Kucing k1 = new Kucing("Garfield", "Orange", 4.5);
        k1.setNama("Garfi");
        p.enqueueAnabul(k1);
 
        Anggora k2 = new Anggora("Luna", "Putih", 3.8);
        k2.setNama("Luna");
        p.enqueueAnabul(k2);
 
        Kembangtelon k3 = new Kembangtelon("Milo", "Coklat", 3.2);
        k3.setNama("Milo");
        p.enqueueAnabul(k3);
 
        Anjing a1 = new Anjing("Buddy", "Hitam");
        a1.setNama("Bud");
        p.enqueueAnabul(a1);
 
        Kucing k4 = new Kucing("Whiskers", "Oren", 5.1);
        k4.setNama("Whisky");
        p.enqueueAnabul(k4);
 
        System.out.println("Sudah enqueue 5 hewan.\n");
 
        // i. getNbelm — cek jumlah hewan di antrean
        System.out.println("-- i. getNbelm --");
        System.out.println("jumlah hewan di antrean: " + p.getNbelm());
 
        // c. showAnabul — tampilkan daftar hewan
        System.out.println("\n-- c. showAnabul --");
        p.showAnabul();
 
        // iv. getAnabul — lihat hewan paling depan tanpa ambil
        System.out.println("-- iv. getAnabul --");
        Anabul depan = p.getAnabul();
        if (depan != null) {
            System.out.println("hewan paling depan: " + depan.getNama());
        }
        System.out.println("jumlah hewan masih: " + p.getNbelm());
        p.showAnabul();
 
        // iii. isMember — cek ada gak hewan ini di antrean
        System.out.println("-- iii. isMember --");
        Kucing testK = new Kucing("Garfield", "Orange", 4.5);
        testK.setNama("Garfi");
        System.out.println("isMember(Garfi) = " + p.isMember(testK));
        
        Anjing testA = new Anjing("Buddy", "Hitam");
        testA.setNama("Max");
        System.out.println("isMember(Max) = " + p.isMember(testA));
 
        // d. countKucing — hitung berapa banyak kucing (termasuk Anggora & Kembangtelon)
        System.out.println("\n-- d. countKucing --");
        System.out.println("jumlah keluarga kucing: " + p.countKucing());
 
        // e. bobotKucing — total bobot semua kucing
        System.out.println("\n-- e. bobotKucing --");
        System.out.println("total bobot kucing: " + p.bobotKucing() + " kg");
 
        // f. showJenisAnabul — tampilkan nama + jenis kelasnya
        System.out.println("\n-- f. showJenisAnabul --");
        p.showJenisAnabul();
 
        // v. dequeueAnabul — ambil hewan depan sekaligus keluarin dari antrean
        System.out.println("\n-- v. dequeueAnabul --");
        System.out.println("mengeluarkan hewan paling depan...");
        Anabul keluarkan = p.dequeueAnabul();
        if (keluarkan != null) {
            System.out.println("hewan yang dikeluarkan: " + keluarkan.getNama());
        }
        System.out.println("jumlah hewan sekarang: " + p.getNbelm());
        p.showAnabul();
 
        // Dequeue satu lagi
        System.out.println("mengeluarkan hewan paling depan lagi...");
        keluarkan = p.dequeueAnabul();
        if (keluarkan != null) {
            System.out.println("hewan yang dikeluarkan: " + keluarkan.getNama());
        }
        System.out.println("jumlah hewan sekarang: " + p.getNbelm());
        System.out.println("jumlah kucing sekarang: " + p.countKucing());
        System.out.println("total bobot kucing sekarang: " + p.bobotKucing() + " kg");
        p.showAnabul();
     }
}
