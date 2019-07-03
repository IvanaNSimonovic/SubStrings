import java.util.Scanner;

public class subStrings {

	public static boolean uporediSaPrethodnim(String s, int index) {
		int brojac = 0;
		for (int i = index - 1; i >= 0; i--) {
			if (s.charAt(index) != s.charAt(i)) {
				brojac += 1;
			}
		}
		if (brojac == index)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int duzina = 1;
		int d = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1) && uporediSaPrethodnim(str, i + 1)) {
				duzina += 1;
			} else if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				d = duzina;
				duzina = 1;
			}
		}

		if (d > duzina)
			System.out.println(d);
		else
			System.out.println(duzina);

	}

}
