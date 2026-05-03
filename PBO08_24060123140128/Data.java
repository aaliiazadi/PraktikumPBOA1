public class Data<T> {
 
    @SuppressWarnings("unchecked")
    private T[] ruang = (T[]) new Object[100];
 
    private int banyak = 0;
 
    public void setIsi(int posisi, T objek) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("posisi " + posisi + " tidak valid, harus antara 1-100");
            return;
        }
        if (ruang[posisi - 1] == null && objek != null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
    }
 
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("posisi " + posisi + " tidak valid, harus antara 1-100");
            return null;
        }
        return ruang[posisi - 1];
    }
 
    public int getSize() {
        return banyak;
    }
}
