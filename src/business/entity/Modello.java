package business.entity;

public class Modello implements Entity {
	private int id;
	private String marca;
	private String nome;
	private TipoCarburante tipoCarburante;
	private int capacitÓBagagliaio;
	private int numeroPosti;
	private int numeroPorte;
	private int potenza;
	private boolean trasmissioneAutomatica;
	private float emissioniCO2;
	private int peso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacitÓBagagliaio() {
		return capacitÓBagagliaio;
	}

	public void setCapacitÓBagagliaio(int capacitÓBagagliaio) {
		this.capacitÓBagagliaio = capacitÓBagagliaio;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	public int getPotenza() {
		return potenza;
	}

	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}

	public boolean isTrasmissioneAutomatica() {
		return trasmissioneAutomatica;
	}

	public void setTrasmissioneAutomatica(boolean trasmissioneAutomatica) {
		this.trasmissioneAutomatica = trasmissioneAutomatica;
	}

	public float getEmissioniCO2() {
		return emissioniCO2;
	}

	public void setEmissioniCO2(float emissioniCO2) {
		this.emissioniCO2 = emissioniCO2;
	}

	public TipoCarburante getTipoCarburante() {
		return tipoCarburante;
	}

	public void setTipoCarburante(TipoCarburante tipoCarburante) {
		this.tipoCarburante = tipoCarburante;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return id + ", '" + marca + "', '" + nome + "', " + tipoCarburante + ", " + capacitÓBagagliaio + ", " 
				+ numeroPosti + ", " + numeroPorte + ", " + potenza + 
				", " + trasmissioneAutomatica + ", " + emissioniCO2 + ", " + peso;
	}
	
}