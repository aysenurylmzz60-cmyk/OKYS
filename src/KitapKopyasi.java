public class KitapKopyasi {

    String barkod;
    Kitap kitap;

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();

        kitap1.ISBN = "9781234567890";
        kitap1.baslik = "Java Programlama";
        kitap1.yazar = "Ayşenur Yılmaz";
        kitap1.yayinYili = 2026;
        kitap1.durum = "Ödünç Verilebilir";

        KitapKopyasi kopya1 = new KitapKopyasi();

        kopya1.barkod = "BK001";
        kopya1.kitap = kitap1;

        System.out.println("Barkod: " + kopya1.barkod);
        System.out.println("Kitap: " + kopya1.kitap.baslik);
        System.out.println("Yazar: " + kopya1.kitap.yazar);
    }
}