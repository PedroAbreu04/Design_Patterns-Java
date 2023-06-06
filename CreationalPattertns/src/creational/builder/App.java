package creational.builder;

public class App {

	public static void main(String[] args) {
		Profession profession = new Profession();
		String name = "Peter";
		HairType hairType = new HairType();
		Weapon weapon = new Weapon();
		
		new Hero(profession, name, hairType, null, null, weapon);
		
		//Agora usandoo Builder
		Hero hero = new HeroBuilder()
			.withProfession(profession)
			.withName(name)
			.build();
		
		Hero hero2 = new HeroBuilder()
				.withName("Peter")
				.build();
		
		System.out.println(hero2);
	}

}
