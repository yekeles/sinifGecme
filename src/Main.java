import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik,turkce;
        double ortalama ;

        Scanner ders = new Scanner(System.in);

        System.out.println("ÖNEMLİ UYARI !!! Girmiş Olduğunuz Ders Notları \n0 ile 100 Arasında Olmalıdır.");
        System.out.println("Aksi Halde Ortalamaya Dahil Edilmez...");

        System.out.print("Matematik Ders Notunu Giriniz : ");
        mat = ders.nextInt();

        System.out.print("Fizik Ders Notunu Giriniz : ");
        fizik = ders.nextInt();

        System.out.print("Kimya Ders Notunu Giriniz : ");
        kimya = ders.nextInt();

        System.out.print("Muzik Ders Notunu Giriniz : ");
        muzik = ders.nextInt();


        System.out.print("Türkçe Ders Notunu Giriniz : ");
        turkce = ders.nextInt();
        
        if(((mat >= 0) && (mat <=100)) && ((fizik >= 0) && (fizik <=100))  && (kimya >= 0) && (kimya <=100) && ((muzik >= 0) && (muzik <=100)) &&((turkce >= 0) && (turkce <=100))) {
            ortalama = ((mat + fizik + kimya + muzik + turkce) / 5);
            if ((ortalama <= 55)) {
                System.out.println("Ders Ortalama : " + ortalama + " Malesef Sınıf Tekrarı Yapacaksınız ...");
            } else {
                System.out.println("Ders Ortalama : " + ortalama);
                System.out.println("Tebrikler Bir Üst Sınıfa Geçtiniz...");
            }
        } else {
            System.out.println("Ders Notlarınızı Kontrol Ediniz ...");
        }

    }
}