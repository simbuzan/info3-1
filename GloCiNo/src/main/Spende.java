package GloCiNo;

/**
 * Diese Klasse enthält eine von einem Spender getätigten Spende, dessen Status sich verfolgen lässt.
 */
class Spende {
	private double betrag;
	private boolean quittung;
	private String spenderName;
	Status status = Status.IN_BEARBEITUNG;

	/**
	 * Eine Spende erstellen, in der explizit eine Quittung gewünscht/abgelehnt wird
	 */
	public Spende(double betrag, boolean quittung, String spenderName) {
		this.betrag = betrag;
		this.quittung = quittung;
		this.spenderName = spenderName;
	}

	/**
	 * Implizit eine Spende ohne anschließende Quittung erstellen
	 */
	public Spende(double betrag, String spenderName) {
		this.betrag = betrag;
		this.spenderName = spenderName;
	}

	/**
	 * Der Spendenbetrag
	 */
	public double getBetrag() {
		return betrag;
	}

	/**
	 * {@link #getBetrag()}
	 */
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	/**
	 * Ob eine Quittung erwünscht ist
	 */
	public boolean getQuittung() {
		return quittung;
	}

	/**
	 * {@link #getQuittung()}
	 */
	public void setQuittung(boolean quittung) {
		this.quittung = quittung;
	}

	/**
	 * Das (Firmen-)Name des Spenders
	 */
	public String getSpenderName() {
		return spenderName;
	}

	/**
	 * {@link #getSpenderName()}
	 */
	public void setSpenderName(String spenderName) {
		this.spenderName = spenderName;
	}

	/**
	 * Der Status der getätigten Spende
	 */
	public Status getStatus() {
		return status;
	}
}
