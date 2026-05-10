// Fakhari Ali Azadi - 24060123140128
// Minggu, 10 Mei 2026

import java.util.LinkedList;
import java.util.Queue;
 
public class Piaraan {
 
    private int nbelm;
 
    private Queue<Anabul> Lanabul;
 
    public Piaraan() {
        Lanabul = new LinkedList<Anabul>();
        nbelm = 0;
    }
 
    public int getNbelm() {
        return nbelm;
    }
 
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }
 
    public boolean isMember(Anabul anabul) {
        for (Anabul a : Lanabul) {
            if (a.getNama().equalsIgnoreCase(anabul.getNama())) {
                return true;
            }
        }
        return false;
    }
 
    public Anabul getAnabul() {
        return Lanabul.peek();
    }
 
    public Anabul dequeueAnabul() {
        if (Lanabul.isEmpty()) {
            System.out.println("[INFO] antrean udah kosong!");
            return null;
        }
        nbelm--;
        return Lanabul.poll();
    }
 
    public void showAnabul() {
        System.out.println("      ANTREAN ANABUL KLINIK            ");
        if (Lanabul.isEmpty()) {
            System.out.println("  [antrean kosong]");
        } else {
            int urut = 1;
            for (Anabul a : Lanabul) {
                System.out.println("  " + urut + ". " + a.getNama());
                urut++;
            }
        }
        System.out.println("  total: " + nbelm + " hewan");
    }
 
    public int countKucing() {
        int jumlah = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                jumlah++;
            }
        }
        return jumlah;
    }
 
    public double bobotKucing() {
        double total = 0.0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }
 
    public void showJenisAnabul() {
        System.out.println("    ANABUL + JENIS KELASNYA            ");
        if (Lanabul.isEmpty()) {
            System.out.println("  [antrean kosong]");
        } else {
            int urut = 1;
            for (Anabul a : Lanabul) {
                System.out.printf("  %d. %-12s | %s%n",
                        urut, a.getNama(), a.getClass().getName());
                urut++;
            }
        }
        System.out.println("========================================");
    }
}