package pokemon;

public class pokemon_Vs {

	public static void main(String[] args) {
		pokemon Pikachu = new pokemon("��ī��", "����", 300, 150, 30 , 200 ,true);
		pokemon Squirtle = new pokemon("���α�", "��", 200, 120, 100 , 50 ,true);
		
		System.out.println("��ī�� VS ���α�");	
		
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
			System.out.println("��ī�� �¸�");
		} else if (Squirtle.isState()){
			System.out.println("���α� �¸�");
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
		System.out.println("���α� ����");
		System.out.println(Squirtle.attach()-Pikachu.getDefensive() + " ��ŭ �������� ������.");
		Pikachu.setHp(Pikachu.getHp() + Pikachu.getDefensive()-Squirtle.attach());
		System.out.println("��ī���� HP�� " + Pikachu.getHp() + " ���Ҵ�.");
	}

	private static void Pikachu_attach(pokemon Pikachu, pokemon Squirtle) {
		System.out.println("��ī�� ����");
		System.out.println(Pikachu.attach()-Squirtle.getDefensive() + " ��ŭ �������� ������.");
		Squirtle.setHp(Squirtle.getHp()+Squirtle.getDefensive()-Pikachu.attach());
		System.out.println("���α��� HP�� " + Squirtle.getHp() + " ���Ҵ�." );
	}

}
