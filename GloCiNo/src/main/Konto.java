package GloCiNo;

/**
 * Diese Klasse enthält ein Konto, das mit einer bestimmten Spendenaktion assoziiert ist.
 */
class Konto {
	private String blz;
	private String kontoNr;
	private String name;
	private String bank;
	//private Aktion aktion;
	//private Spende spende;
	//later we will create a method that takes spende and forward it to aktion without saving it in konto class

	public Konto(String blz, String kontoNr, String name, String bank) {
		this.blz = blz;
		this.kontoNr = kontoNr;
		this.name = name;
		this.bank = bank;
	}

	//getters and setters for variables
	/**
	 * Die Bankleitzahl des Kontos
	 */
	public String getBlz() {
		return blz;
	}

	/**
	 * {@link #getBlz()}
	 */
	public void setBlz(String blz) {
		this.blz = blz;
	}

	/**
	 * Die Kontonummer
	 */
	public String getKontoNr() {
		return kontoNr;
	}

	/**
	 * {@link #getKontoNr()}
	 */
	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	/**
	 * Der Name des Kontoinhabers
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@link #getName()}
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Die Bank des Kontos
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * {@link #getBank()}
	 */
	public void setBank(String bank) {
			this.bank = bank;
		}
}