public class Kullanici {

    int ID;
    String ad;
    String email;
    String sifre;

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici();

        kullanici1.ID = 1;
        kullanici1.ad = "Ayşenur Yılmaz";
        kullanici1.email = "aysenur@example.com";
        kullanici1.sifre = "12345";

        System.out.println("ID: " + kullanici1.ID);
        System.out.println("Ad: " + kullanici1.ad);
        System.out.println("E-posta: " + kullanici1.email);
        System.out.println("Şifre: " + kullanici1.sifre);
    }
}