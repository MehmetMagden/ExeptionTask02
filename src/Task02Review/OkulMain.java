package Task02Review;

import java.util.Scanner;

public class OkulMain {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        ogrenciKayit();
    }

    public static void ogrenciKayit() {

        System.out.println("ögrencinin adını giriniz");
        String ad = scan.next();


        System.out.println("ogrencinin soy adını giriniz");
        String soyad= scan.next();



        boolean dvm =false;
        int yas = 0;
        do {
            dvm=false;

            try {

                System.out.println("Ogrencinin yasini giriniz");
                yas = scan.nextInt();
            } catch (Exception e) {
                scan.next();
                System.out.println("lütfen geçerli bir yaş giriniz");
                dvm=true;
            }
        }while(dvm);

        if( Okul.liste.size()<2){
            Ogrenci obj = new Ogrenci(ad,soyad,yas);
            Okul.liste.add(obj);
            ogrenciKayit();
        }else {
            System.out.println("kontejanı aştınız");
            System.out.println("program niye bitmiyor");

        }




    }


}
