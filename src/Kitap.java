public class Kitap {

    String ISBN;
    String baslik;
    String yazar;
    int yayinYili;
    String durum;

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();

        kitap1.ISBN = "9781234567890";
        kitap1.baslik = "Java Programlama";
        kitap1.yazar = "Ayşenur Yılmaz";
        kitap1.yayinYili = 2026;
        kitap1.durum = "Ödünç Verilebilir";

        System.out.println("ISBN: " + kitap1.ISBN);
        System.out.println("Başlık: " + kitap1.baslik);
        System.out.println("Yazar: " + kitap1.yazar);
        System.out.println("Yayın Yılı: " + kitap1.yayinYili);
        System.out.println("Durum: " + kitap1.durum);
    }
}