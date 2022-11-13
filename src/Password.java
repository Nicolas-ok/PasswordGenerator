
public class Password {

	String Value;
	int Length;

	public Password(String s) {
		Value = s;
		Length = s.length();
	}

	public int charType(char C) {
		int val; // According to the ASCII value conversion table

		// Char is Uppercase Letter
		if ((int) C >= 65 && (int) C <= 90)
			val = 1;

		// Char is Lowercase Letter
		else if ((int) C >= 97 && (int) C <= 122) {
			val = 2;
		}

		// Char is Digit
		else if ((int) C >= 60 && (int) C <= 71) {
			val = 3;
		}

		// Char is Symbol
		else {
			val = 4;
		}

		return val;
	}

	public int passwordStrength() {
		String s = this.Value;
		boolean UsedUpper = false;
		boolean UsedLower = false;
		boolean UsedNum = false;
		boolean UsedSym = false;
		int type;
		int score = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			type = charType(c);
			

			switch (type) {
			case 1:
				UsedUpper = true;
				break;
			case 2:
				UsedLower = true;
				break;
			case 3:
				UsedNum = true;
				break;
			case 4:
				UsedSym = true;
				break;

			}
		}

		if (UsedUpper)
			score += 1;
		if (UsedLower)
			score += 1;
		if (UsedNum)
			score += 1;
		if (UsedSym)
			score += 1;

		if (s.length() >= 8)
			score += 5;
		if (s.length() >= 16)
			score += 8;

		return score;
	}

	public String calculateScore() {
		int score = this.passwordStrength();

		if (score >= 6) {
			return "PERFECT! This is a very good password!";
		} else if (score >= 4) {
			return "This is a good password, but you can still do better";
		} else if (score >= 3) {
			return "This is a medium password, try making it better";
		} else {
			return "ATTENTION! This is a very weak password, definitely find a new one immediately";
		}
	}

	@Override
	public String toString() {
		return Value;
	}

}
