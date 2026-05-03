// kelas berisi prosedur dan fungsi generik
public class Operatorgenerik {
 
    public static <T> void tukar(T[] args) {
        T temp  = args[0];
        args[0] = args[1];
        args[1] = temp;
    }
 
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}