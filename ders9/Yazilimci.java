package javadersleri.ders9;

public class Yazilimci  extends Calisan {
	private String diller;
	
	public  Yazilimci(String ad, String soyad, int id,String diller) {
		super(ad, soyad, id);
		this.diller = diller;
	}
	public void formatAt(String isletim_sistemi) {
		System.out.println(getAd()+ " " + isletim_sistemi + "ni y�kl�yor ");
		
	}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Yaz�l�mc�n�n Bildi�i Diller " + diller);
		
		
	}
	

}
