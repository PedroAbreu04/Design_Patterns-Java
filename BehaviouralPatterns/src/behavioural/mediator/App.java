package behavioural.mediator;

public class App {
	public static void main(String[] args) {
		Party party = new PartyImpl();
		PartyMember hobbit = new Hobbit();
		PartyMember wizard = new Wizard();
		PartyMember rogue = new Rogue();
		PartyMember hunter = new Hunter();
		
		party.addMember(hobbit);
		party.addMember(wizard);
		party.addMember(rogue);
		party.addMember(hunter);
		
		hobbit.act(Action.ENEMY);
		wizard.act(Action.TALE);
		rogue.act(Action.GOLD);
		hunter.act(Action.HUNT);
	}
}
