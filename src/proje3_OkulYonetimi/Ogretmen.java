package proje3_OkulYonetimi;

public class Ogretmen extends Kisi{
    private String bolum;
    private String sicil;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicil) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicil = sicil;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }
}
