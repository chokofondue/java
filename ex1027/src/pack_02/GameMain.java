package pack_02;

import java.util.ArrayList;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GameCharacter> characters = new ArrayList<GameCharacter>();
		
		GameCharacter character = new GameCharacter("test", "����", 10, "����");
		
		characters.add(character);
		
		System.out.println("���̵� : " + character.getId() + " ���� : " + character.getJob() + " ���� : " + character.getLv() + " ���� : " + character.getGender());
		System.out.println("���̵� : " + characters.get(0).getId() + " ���� : " + characters.get(0).getJob() + " ���� : " + characters.get(0).getLv() + " ���� : " + characters.get(0).getGender());
	}
}
