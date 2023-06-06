package structure.adapter;

public class App {
	public static void main(String[] args) {
		Advertisement adv1 = new Advertisement("Titulo 1", "Descrição do anúncio", 10.5);
		adv1.publish();
		adv1.inactivate();
		adv1.activate();
		adv1.delete();
		System.out.println(adv1.title);
		
		Ad ad = new Ad();
		ad.description = "Smartphone A10 ótimo estado de conservação";
		ad.price = 50.0;
		ad.status = "reviewed";
		
		Advertisement adv2 =  new AdvertisementAdapter(ad);
		adv2.publish();
		adv2.inactivate();
		adv2.activate();
		adv2.delete();
		System.out.println(adv2.title);
	}
}
