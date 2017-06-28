
public class Konsole {

	int ohp, ohp_s, hhp, hhp_s;
	
	Konsole()
	{
	
	}
	
	public void hp_bar(int o_hp_s, int o_hp, int h_hp, int h_hp_s)
	{
		ohp = o_hp;
		ohp_s = o_hp_s;
		hhp = h_hp;
		hhp_s = h_hp_s;
		
	
		System.out.println("Held");
		System.out.println("Hp: "+ hhp + " / " + hhp_s + " ");
		for(int i=0; i < hhp_s; i++)
		{	
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < hhp; i++)
		{
			System.out.print("|");
		}
		System.out.println();
		for(int i=0; i < hhp_s; i++)
		{	
			System.out.print("=");
		}
		
		System.out.println();
		System.out.println();
		
		/* Orc Hp */
		
		System.out.println("Orc");
		System.out.println("Hp: "+ ohp + " / " + ohp_s + " ");
		for(int i=0; i < ohp_s; i++)
		{	
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < ohp; i++)
		{
			System.out.print("|");
		}
		System.out.println();
		for(int i=0; i < ohp_s; i++)
		{	
			System.out.print("=");
		}
		
		System.out.println();
		
		for(int i=0; i<=50; i++)
		{
			System.out.print("_");
		}
	}
}
