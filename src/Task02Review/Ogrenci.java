package Task02Review;

public class Ogrenci {


    private String ad;
    private String soyAd;
    private int yas;







    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {

        return yas;

    }

    public void setYas(int yas) {


        try {
            if(yas >15 || yas<0){
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("yaş 15'ten küçük olmalı");
            OkulMain.ogrenciKayit();
        }



        this.yas = yas;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
