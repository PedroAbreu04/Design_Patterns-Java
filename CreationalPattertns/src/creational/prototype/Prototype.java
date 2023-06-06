package creational.prototype;

public class Prototype<T extends Cloneable> {

	@SuppressWarnings("unchecked")
	public <E extends Throwable> T copy() throws E{
		try {
			return (T) super.clone();
		} catch (CloneNotSupportedException e) {
			throw (E) e;
		}
	}
}
