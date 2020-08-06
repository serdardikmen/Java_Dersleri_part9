package javadersleri.ders9;


public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Y�neticinin Sorumlu Oldu�u Ki�i Say�s� : " + sorumlu_kisi_sayisi);

    }
    public void zamYap(int zamMiktari) {
        
        System.out.println(getAd() + " �al��anlara " + zamMiktari + " $  kadar zam yap�ld�...");
    } 
    
}