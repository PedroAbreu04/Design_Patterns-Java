package structure.adapter;

public class AdvertisementAdapter extends Advertisement{
	private Ad ad;
	
	public AdvertisementAdapter(Ad ad) {
		super(ad.description.substring(0, 15), ad.description, ad.price);
		
		this.status = convertStatus(ad.status);
		this.ad = ad;
		
		
	}

	private AdvertisementStatus convertStatus(String status) {
		switch (status) {
		case "new": return AdvertisementStatus.DRAFT;
		case "reviewed": return AdvertisementStatus.PUBLISHED;
		case "deleted": return AdvertisementStatus.DELETED;
		default: return AdvertisementStatus.DRAFT;
		}
	}
	
	@Override
	public void publish() {
		ad.publish();
	}
	
	@Override
	public void inactivate() {
		ad.delete();
	}
	
	@Override
	public void activate() {
		ad.publish();
	}
	
	@Override
	public void delete() {
		ad.delete();
	}
}
