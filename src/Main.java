import java.util.*;

public class Main {
	public static Random random = new Random();

	public static void main(String[] args) {

		List<Korta> staloKortos = sugeneruotiKortuKalade();
		Zaidejas zaidejas = new Zaidejas(staloKortos,false);
		Zaidejas zaidejas2 = new Zaidejas(staloKortos,false);

		int zaidejoKortuSuma1 = zaidimoLaimetojas(zaidejas.getZaidejoKortos());
		int zaidejoKortuSuma2 = zaidimoLaimetojas(zaidejas2.getZaidejoKortos());

		if (zaidejoKortuSuma1 > zaidejoKortuSuma2){
			System.err.println("Laimejo zaidejas 1 su " +zaidejoKortuSuma1);
			atspauzdinti(zaidejas.getZaidejoKortos());
			System.out.println("\n Zaidejo 2 kortos: "  +zaidejoKortuSuma2);
			atspauzdinti(zaidejas2.getZaidejoKortos());
		} else if (zaidejoKortuSuma1 < zaidejoKortuSuma2){
			System.err.println("Laimejo zaidejas 2 su kortomis: " +zaidejoKortuSuma2);
			atspauzdinti(zaidejas2.getZaidejoKortos());
			System.out.println("\n Zaidejo 1 kortos: " +zaidejoKortuSuma1);
			atspauzdinti(zaidejas.getZaidejoKortos());
		} else {
			System.err.println("Lygiosios!");

			System.out.println("1 Zaidejo kortos: " +zaidejoKortuSuma1);
			atspauzdinti(zaidejas.getZaidejoKortos());
			System.out.println("\n2 Zaidejo kortos: " +zaidejoKortuSuma2);
			atspauzdinti(zaidejas2.getZaidejoKortos());
		}
	}

	public static int zaidimoLaimetojas(List<Korta> zaidejoKortos){
		int kortuSuma = 0;

		for (Korta k: zaidejoKortos){
			kortuSuma = kortuSuma + k.getKortosVerte();
		}

		return kortuSuma;
	}
	public static Korta sugeneruotiRandomKorta (String zenklas){
		HashMap<Integer,KortosZenklas> kortuZenklai = new HashMap<>();
		kortuZenklai.put(1,KortosZenklas.BUGNAI);
		kortuZenklai.put(2,KortosZenklas.CIRVAI);
		kortuZenklai.put(3,KortosZenklas.VYNAI);
		kortuZenklai.put(4,KortosZenklas.KRYZIAI);

		KortosZenklas naujasKortosZenklas = null;
		String naujasKortosSimbolis = "";
		int naujaKortosVerte = 0;

		int randomZenklas = random.nextInt(1,5);    // 4 galimi zenklai
		int randomSimbolis = random.nextInt(1,14);  // 13 galimu simboliu

		if (zenklas.equalsIgnoreCase("R")){
			switch (randomZenklas){
				case 1: naujasKortosZenklas = kortuZenklai.get(1); break;
				case 2: naujasKortosZenklas = kortuZenklai.get(2); break;
				case 3: naujasKortosZenklas = kortuZenklai.get(3); break;
				case 4: naujasKortosZenklas = kortuZenklai.get(4); break;
			}
		} else if (zenklas.equalsIgnoreCase("B")) {
			naujasKortosZenklas = kortuZenklai.get(1);
		} else if (zenklas.equalsIgnoreCase("C")) {
			naujasKortosZenklas = kortuZenklai.get(2);
		} else if (zenklas.equalsIgnoreCase("V")) {
			naujasKortosZenklas = kortuZenklai.get(3);
		} else if (zenklas.equalsIgnoreCase("K")) {
			naujasKortosZenklas = kortuZenklai.get(4);
		}

		switch (randomSimbolis){
			case 1: naujasKortosSimbolis = "T";   naujaKortosVerte = 11; break;
			case 2: naujasKortosSimbolis = "2";   naujaKortosVerte = 2; break;
			case 3: naujasKortosSimbolis = "3";   naujaKortosVerte = 3; break;
			case 4: naujasKortosSimbolis = "4";   naujaKortosVerte = 4; break;
			case 5: naujasKortosSimbolis = "5";   naujaKortosVerte = 5; break;
			case 6: naujasKortosSimbolis = "6";   naujaKortosVerte = 6; break;
			case 7: naujasKortosSimbolis = "7";   naujaKortosVerte = 7; break;
			case 8: naujasKortosSimbolis = "8";   naujaKortosVerte = 8; break;
			case 9: naujasKortosSimbolis = "9";   naujaKortosVerte = 9;break;
			case 10: naujasKortosSimbolis = "10"; naujaKortosVerte = 10;break;
			case 11: naujasKortosSimbolis = "B";  naujaKortosVerte = 10;break;
			case 12: naujasKortosSimbolis = "D";  naujaKortosVerte = 10;break;
			case 13: naujasKortosSimbolis = "K";  naujaKortosVerte = 10; break;
		}

		return new Korta(naujasKortosZenklas,naujasKortosSimbolis,naujaKortosVerte);
	}

	public static Korta gautiRandomKortaIsKalades(List<Korta> kortuKalade){
		int randKorta = random.nextInt(kortuKalade.size());
		kortuKalade.remove(randKorta);
		return kortuKalade.get(randKorta);
	}

	public static List<Korta> sugeneruotiKortuKalade (){
		List<Korta> kortuKalade = new ArrayList<>();

		for (int i = 1; i <= 10; i++){
			if (i == 1){
				kortuKalade.add(new Korta(KortosZenklas.BUGNAI,"T",11));
				kortuKalade.add(new Korta(KortosZenklas.CIRVAI,"T",11));
				kortuKalade.add(new Korta(KortosZenklas.VYNAI,"T",11));
				kortuKalade.add(new Korta(KortosZenklas.KRYZIAI,"T",11));

				kortuKalade.add(new Korta(KortosZenklas.BUGNAI,"B",10));
				kortuKalade.add(new Korta(KortosZenklas.CIRVAI,"B",10));
				kortuKalade.add(new Korta(KortosZenklas.VYNAI,"B",10));
				kortuKalade.add(new Korta(KortosZenklas.KRYZIAI,"B",10));

				kortuKalade.add(new Korta(KortosZenklas.BUGNAI,"D",10));
				kortuKalade.add(new Korta(KortosZenklas.CIRVAI,"D",10));
				kortuKalade.add(new Korta(KortosZenklas.VYNAI,"D",10));
				kortuKalade.add(new Korta(KortosZenklas.KRYZIAI,"D",10));

				kortuKalade.add(new Korta(KortosZenklas.BUGNAI,"K",10));
				kortuKalade.add(new Korta(KortosZenklas.CIRVAI,"K",10));
				kortuKalade.add(new Korta(KortosZenklas.VYNAI,"K",10));
				kortuKalade.add(new Korta(KortosZenklas.KRYZIAI,"K",10));
			} else {
				kortuKalade.add(new Korta(KortosZenklas.BUGNAI,String.valueOf(i),i));
				kortuKalade.add(new Korta(KortosZenklas.CIRVAI,String.valueOf(i),i));
				kortuKalade.add(new Korta(KortosZenklas.VYNAI,String.valueOf(i),i));
				kortuKalade.add(new Korta(KortosZenklas.KRYZIAI,String.valueOf(i),i));
			}
		}

		Collections.shuffle(kortuKalade);

		return kortuKalade;
	}

	public static List<Korta> sumaisyti(List<Korta> kortuKalade){
		Collections.shuffle(kortuKalade);
		return kortuKalade;
	}

	public static void atspauzdinti (List<Korta> kortuKalade){
		for (Korta k : kortuKalade){
			System.out.println(k);
		}
	}
}