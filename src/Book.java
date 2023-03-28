

public class Book implements Comparable<Book> {
    @Override
    public int compareTo(Book o) {
        return this.kitapIsmi.compareTo(o.kitapIsmi);
    }

        public String kitapIsmi;
        private int sayfaSayisi;
        private String yazarIsmi;
        private int yayinTarihi;

    public Book(String kitapIsim, int sayfaSayisi, String yazarIsmi, int yayinTarihi) {
        this.kitapIsmi= kitapIsim;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarIsmi = yazarIsmi;
        this.yayinTarihi = yayinTarihi;
    }

    public String getKitapIsim() {
        return kitapIsmi;
    }

    public void setKitapIsim(String kitapIsim) {
        this.kitapIsmi = kitapIsim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarIsmi() {
        return yazarIsmi;
    }

    public void setYazarIsmi(String yazarIsmi) {
        this.yazarIsmi = yazarIsmi;
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}
