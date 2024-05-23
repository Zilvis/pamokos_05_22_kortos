import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zaidejas {
	private List<Korta> zaidejoKortos;
	private boolean dealeris;
	private int pinigai;

	public Zaidejas(List<Korta> staloKortos, boolean dealeris) {
		this.zaidejoKortos = getZaidejoKortos(staloKortos);
		this.dealeris = dealeris;
		this.pinigai = 500;
	}

	public int getPinigai() {
		return pinigai;
	}

	public void setPinigai(int pinigai) {
		this.pinigai = pinigai;
	}

	public List<Korta> getZaidejoKortos (List<Korta> staloKortos){
		List<Korta> zaidejoKortos = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 2; i++){
			int randomKorta = random.nextInt(staloKortos.size());
			zaidejoKortos.add(staloKortos.get(randomKorta));
			staloKortos.remove(randomKorta);
		}
		return zaidejoKortos;
	}

	public List<Korta> getZaidejoKortos() {
		return zaidejoKortos;
	}
}
