
public class Mobs {

	int hp;
	int hp_s;
	int atk;
	int atk_w;
	int def;
	int spd;
	int spd_w;
	
	static class rat
	{
		int hp;
		int atk;
		int atk_w;
		int def;
		int spd;
		int spd_w;
		
		rat()
		{
			hp = 10;
			atk = 3;
			atk_w = 0;
			def = 1;
			spd = 1;
			spd_w = 0;
		}
	}
	
	static class orc extends Mobs
	{
		
		orc()
		{
			hp = 15;
			hp_s= 0;
			atk = 8;
			atk_w = 0;
			def = 4;
			spd = 1;
			spd_w = 0;
		}
	}
	
}
