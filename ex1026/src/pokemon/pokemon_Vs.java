package pokemon;

public class pokemon_Vs {

	public static void main(String[] args) {
		pokemon Pikachu = new pokemon("ÇÇÄ«Ãò", "Àü±â", 300, 150, 30 , 200 ,true);
		pokemon Squirtle = new pokemon("²¿ºÎ±â", "¹°", 200, 120, 100 , 50 ,true);
		
		System.out.println("ÇÇÄ«Ãò VS ²¿ºÎ±â");	
		
		do {
			if(Pikachu.getSpeed() > Squirtle.getSpeed()) {
				Pikachu_attach(Pikachu, Squirtle);
				Squirtle_attach(Pikachu, Squirtle);
				State(Pikachu, Squirtle);
			} else {
				Squirtle_attach(Pikachu, Squirtle);
				Pikachu_attach(Pikachu, Squirtle);
				State(Pikachu, Squirtle);
			}			
		} while (Pikachu.getHp() > 0 && Squirtle.getHp() > 0);
		if(Pikachu.isState()) {
			System.out.println("ÇÇÄ«Ãò ½Â¸®");
		} else if (Squirtle.isState()){
			System.out.println("²¿ºÎ±â ½Â¸®");
		}
	}
	
	private static void State(pokemon Pikachu, pokemon Squirtle) {
		if(Pikachu.getHp() <= 0) {
			Pikachu.setState(false);
		} else if(Squirtle.getHp() <= 0) {
			Squirtle.setState(false);
		}
	}

	private static void Squirtle_attach(pokemon Pikachu, pokemon Squirtle) {
		System.out.println("²¿ºÎ±â °ø°Ý");
		System.out.println(Squirtle.attach()-Pikachu.getDefensive() + " ¸¸Å­ µ¥¹ÌÁö¸¦ ÀÔÇû´Ù.");
		Pikachu.setHp(Pikachu.getHp() + Pikachu.getDefensive()-Squirtle.attach());
		System.out.println("ÇÇÄ«ÃòÀÇ HP°¡ " + Pikachu.getHp() + " ³²¾Ò´Ù.");
	}

	private static void Pikachu_attach(pokemon Pikachu, pokemon Squirtle) {
		System.out.println("ÇÇÄ«Ãò °ø°Ý");
		System.out.println(Pikachu.attach()-Squirtle.getDefensive() + " ¸¸Å­ µ¥¹ÌÁö¸¦ ÀÔÇû´Ù.");
		Squirtle.setHp(Squirtle.getHp()+Squirtle.getDefensive()-Pikachu.attach());
		System.out.println("²¿ºÎ±âÀÇ HP°¡ " + Squirtle.getHp() + " ³²¾Ò´Ù." );
	}

}
