public class OduncKaydi {

    int islemNo;
    String oduncTarihi;
    String sonTeslimTarihi;
    String teslimTarihi;

    Kullanici kullanici;
    KitapKopyasi kitapKopyasi;

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici();

        kullanici1.ID = 1;
        kullanici1.ad = "Ayşenur Yılmaz";
        kullanici1.email = "aysenur@example.com";
        kullanici1.sifre = "12345";

        Kitap kitap1 = new Kitap();

        kitap1.ISBN = "9781234567890";
        kitap1.baslik = "Java Programlama";
        kitap1.yazar = "Ayşenur Yılmaz";
        kitap1.yayinYili = 2026;
        kitap1.durum = "Ödünç Verildi";

        KitapKopyasi kopya1 = new KitapKopyasi();

        kopya1.barkod = "BK001";
        kopya1.kitap = kitap1;

        OduncKaydi kayit1 = new OduncKaydi();

        kayit1.islemNo = 1;
        kayit1.oduncTarihi = "05.10.2026";
        kayit1.sonTeslimTarihi = "19.10.2026";
        kayit1.teslimTarihi = "19.10.2026";

        kayit1.kullanici = kullanici1;
        kayit1.kitapKopyasi = kopya1;

        System.out.println("İşlem No: " + kayit1.islemNo);
        System.out.println("Üye: " + kayit1.kullanici.ad);
        System.out.println("Kitap: " + kayit1.kitapKopyasi.kitap.baslik);
        System.out.println("Barkod: " + kayit1.kitapKopyasi.barkod);
        System.out.println("Ödünç Tarihi: " + kayit1.oduncTarihi);
        System.out.println("Son Teslim Tarihi: " + kayit1.sonTeslimTarihi);
    }
}