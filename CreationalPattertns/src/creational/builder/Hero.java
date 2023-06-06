package creational.builder;

public class Hero {
	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;
	
	//Bad code
	public Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor,
			Weapon weapon) {
		this.profession = profession;
		this.name = name;
		this.hairType = hairType;
		this.hairColor = hairColor;
		this.armor = armor;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Hero=(")
				.append((this.profession != null) ? this.profession : "")
				.append((this.name != null) ? this.name : "")
				.append((this.hairType != null) ? this.hairType : "")
				.append((this.hairColor != null) ? this.hairColor : "")
				.append((this.armor != null) ? this.armor : "")
				.append((this.weapon != null) ? this.weapon : "")
				.append(")")
				.toString();
	}
	
	
	
	
}
