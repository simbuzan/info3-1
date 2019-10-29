package GloCiNo;

/**
 * Diese Klasse enthält persönliche Daten eines Aktionsorganisators.
 */
class Organisator {
	private String email;
	private String nachname;
	private String vorname;
	private String passwort;

	public Organisator(String email, String nachname, String vorname, String passwort) {
		this.email = email;
		this.nachname = nachname;
		this.vorname = vorname;
		this.passwort = passwort;
	}

	/**
	 * Emailadresse des Organisators
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * {@link #getEmail()}
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Nachname des Organisators
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * {@link #getNachname()}
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * Vorname des Organisators
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * {@link #getVorname()}
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * Passwort des Organisators
	 */
	public String getPasswort() {
		return passwort;
	}

	/**
	 * {@link #getPasswort()}
	 */
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}
