package pack_02;

import java.util.ArrayList;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GameCharacter> characters = new ArrayList<GameCharacter>();
		
		GameCharacter character = new GameCharacter("test", "전사", 10, "남자");
		
		characters.add(character);
		
		System.out.println("아이디 : " + character.getId() + " 직업 : " + character.getJob() + " 레벨 : " + character.getLv() + " 성별 : " + character.getGender());
		System.out.println("아이디 : " + characters.get(0).getId() + " 직업 : " + characters.get(0).getJob() + " 레벨 : " + characters.get(0).getLv() + " 성별 : " + characters.get(0).getGender());
	}
}
