public class Datum<T> {
 
    private T isi;
 
    public Datum(T isi) {
        this.isi = isi;
    }
 
    public T getIsi() {
        return isi;
    }
 
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
 
    @Override
    public String toString() {
        return "Datum[isi=" + isi + "]";
    }
}