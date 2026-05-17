package pengelolaanmovie.Model;

public class ModelMovie {
    private int id;
    private String judul;
    private double alur;
    private double penokohan;
    private double akting;
    private double nilai;
    
    public int getId() {
        return this.id;
    }
    public String getJudul() {
        return this.judul;
    }
    public double getAlur() {
        return this.alur;
    }
    public double getPenokohan() {
        return this.penokohan;
    }
    public double getAkting() {
        return this.akting;
    }
    public double getNilai() {
        return this.nilai;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setAlur(double alur) {
        this.alur = alur;
    }
    public void setPenokohan(double penokohan) {
        this.penokohan = penokohan;
    }
    public void setAkting(double akting) {
        this.akting = akting;
    }
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
