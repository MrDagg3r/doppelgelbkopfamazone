import java.util.Random;

public class Fight 
{
	
	Held.hero h;
	Mobs.orc r;	
	public Fight(Held.hero h1, Mobs.orc r1)
	{
		h = h1;
		r = r1;
	}
	
	public int rnd()
	{
		Random rand = new Random();	
		return rand.nextInt(6) + 1;
	}
	
	public void wurfeln()
	{
		h.spd_w = h.spd + rnd();
		r.spd_w = r.spd + rnd();
		
		h.atk_w = h.atk + rnd();
		r.atk_w = r.atk + rnd();
	}
	
	public void dmg()
	{
		if(h.spd_w > r.spd_w || h.spd_w == r.spd_w)
		{
			r.hp = r.hp - (h.atk_w - r.def);
		}
		else
		{
			h.hp = h.hp - (r.atk_w - h.def);
		}
	}
	
	
	public void k()
	{
		Konsole hp = new Konsole();
		r.hp_s = r.hp;
		h.hp_s = h.hp;
		
		while(h.hp > 0 && r.hp > 0)
		{
			wurfeln();
			dmg();
			hp.hp_bar(r.hp_s, r.hp, h.hp, h.hp_s);
			System.out.println();
			
			System.out.println();
			
			try {
				  Thread.sleep(900);
				}
				catch (Exception e) {}
			
			
		}
	}
	
}
