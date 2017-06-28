public class rpg {

	
public static void main(String[] args)
	{
		Held.hero Bob = new Held.hero();
		Mobs.rat r = new Mobs.rat();
		Mobs.orc o = new Mobs.orc();
		Fight Kampf = new Fight(Bob,o);
		//Konsole t = new Konsole(Bob,o);
		
		
		Kampf.k();
		//t.hp_bar();
	}
	
	
	
}
