package GloCiNo;

/**
 * Diese Klasse enthält Informationen zu einer Spendenaktion.
 */
class Aktion {
	private String name;
	private double spenden;
	private double spendenziel;

	/**
	 * Eine komplett neue Aktion erstellen
	 */
	public Aktion(String name, double spendenziel) {
		this.name = name;
		this.spenden = 0;
		this.spendenziel = spendenziel;
	}

	/**
	 * Eine unabhängig schon bestehende Aktion nachträglich in das System aufnehmen
	 */
	public Aktion(String name, double spenden, double spendenziel) {
		this.name = name;
		this.spenden = spenden;
		this.spendenziel = spendenziel;
	}

	/**
	 * Das angestrebte Spendenziel
	 */
	public double getSpendenziel() {
		return spendenziel;
	}

	/**
	 * {@link #getSpendenziel()}
	 */
	public void setSpendenziel(double spendenziel) {
		this.spendenziel = spendenziel;
	}

	/**
	 * Die bisher gesammelten Spenden
	 */
	public double getSpenden() {
		return spenden;
	}

	/**
	 * {@link #getSpenden()}
	 */
	public void setSpenden(double spenden) {
		this.spenden = spenden;
	}

	/**
	 * Der Name der Aktion
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
}
