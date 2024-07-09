

public class Korta {
	private KortosZenklas kortosZenklas;
	private String  kortosSimbolis;
	private int     kortosVerte;

	public Korta(KortosZenklas kortosZenklas, String kortosSimbolis, int kortosVerte) {
		this.kortosZenklas = kortosZenklas;
		this.kortosSimbolis = kortosSimbolis;
		this.kortosVerte = kortosVerte;
	}

	public int getKortosVerte() {
		return kortosVerte;
	}

	@Override
	public String toString() {
		return String.format(
						" ___\n" +
						" %s \n" +
						"| %s |\n" +
						" __%s", kortosSimbolis,kortosZenklas.getZenklas(),kortosSimbolis);
	}
	// Bandymas
}
