import java.util.ArrayList;

public class CharList {
	ArrayList<Character> charList = new ArrayList<>();

	public void addChar(Character newChar) {
		charList.add(newChar);
	}

	public void deleteChar(int idx) {
		charList.remove(idx);
	}

	public boolean isEmpty() {
		return charList.isEmpty();
	}

	public Integer getSize() {
		return charList.size();
	}

	public String getName(int idx) {
		return charList.get(idx).getName();
	}

	public String getCharClass(int idx) {
		return charList.get(idx).getCharClass();
	}

	// kemudian pada bagian ini kita ubah return typenya menjadi objek Weapon
	public Weapon getWeapon(int idx) {
		return charList.get(idx).getWeapon();
	}

	public Armor getArmor(int idx) {
		return charList.get(idx).getSArmor();
	}

}
