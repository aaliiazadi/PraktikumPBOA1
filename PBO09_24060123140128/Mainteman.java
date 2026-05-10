public class Mainteman {
 
    public static void main(String[] args) {
 
        System.out.println("===== Aplikasi Kelas Teman =====\n");
 
        Teman t = new Teman();
 
        // d. addNama — masukin nama-nama dulu
        System.out.println("-- d. addNama --");
        t.addNama("Budi");
        t.addNama("Siti");
        t.addNama("Andi");
        t.addNama("Dewi");
        t.addNama("Budi");   // sengaja duplikat buat tes countNama
        t.addNama("Rini");
        t.showTeman();
 
        // a. getNbelm — cek jumlahnya
        System.out.println("-- a. getNbelm --");
        System.out.println("jumlah teman: " + t.getNbelm());
 
        // b. getNama — ambil nama dari posisi tertentu
        System.out.println("\n-- b. getNama --");
        System.out.println("getNama(0) = " + t.getNama(0));
        System.out.println("getNama(2) = " + t.getNama(2));
        System.out.println("getNama(99) = " + t.getNama(99)); // sengaja salah buat cek error
 
        // c. setNama — ganti nama di posisi tertentu
        System.out.println("\n-- c. setNama --");
        System.out.println("ganti posisi 3 (Dewi) jadi Maya:");
        t.setNama(3, "Maya");
        t.showTeman();
 
        // f. isMember — ada gak nama ini?
        System.out.println("-- f. isMember --");
        System.out.println("isMember('Siti') = " + t.isMember("Siti"));
        System.out.println("isMember('Joko') = " + t.isMember("Joko"));
        System.out.println("isMember('budi') = " + t.isMember("budi")); // case-insensitive
 
        // h. countNama — berapa kali nama ini muncul?
        System.out.println("\n-- h. countNama --");
        System.out.println("countNama('Budi') = " + t.countNama("Budi") + " (harusnya 2)");
        System.out.println("countNama('Rini') = " + t.countNama("Rini") + " (harusnya 1)");
        System.out.println("countNama('Joko') = " + t.countNama("Joko") + " (harusnya 0)");
 
        // g. gantiNama — ganti semua "Budi" jadi "Bambang"
        System.out.println("\n-- g. gantiNama --");
        System.out.println("gantiNama('Budi', 'Bambang'):");
        t.gantiNama("Budi", "Bambang");
        t.showTeman();
        System.out.println("countNama('Budi') sekarang    = " + t.countNama("Budi"));
        System.out.println("countNama('Bambang') sekarang = " + t.countNama("Bambang"));
 
        // e. delNama — hapus nama dari list
        System.out.println("\n-- e. delNama --");
        System.out.println("delNama('Andi'):");
        t.delNama("Andi");
        t.showTeman();
 
        System.out.println("delNama('Bambang') hapus semua:");
        t.delNama("Bambang");
        t.showTeman();
 
        System.out.println("delNama('Xyz') yang gak ada:");
        t.delNama("Xyz");
 
        // i. showTeman — tampilan akhir
        System.out.println("\n-- i. showTeman (akhir) --");
        t.showTeman();
 
        System.out.println("===== Selesai Bagian I =====");
    }
}