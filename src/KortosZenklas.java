public enum KortosZenklas {
	BUGNAI( "♦"),
	CIRVAI( "♥"),
	VYNAI(  "♠"),
	KRYZIAI("♣");

	private String zenklas;

	KortosZenklas(String zenklas) {
		this.zenklas = zenklas;
	}

	public String getZenklas() {
		return zenklas;
	}
}
