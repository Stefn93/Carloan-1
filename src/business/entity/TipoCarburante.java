package business.entity;

public enum TipoCarburante implements Entity {
	BENZINA(0),
	DIESEL(1),
	GPL(2),
	METANO(3),
	ELETTRICA(4);
	private int index;
	
	private TipoCarburante(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public static TipoCarburante getTipo(int index) {
		for (TipoCarburante t : TipoCarburante.values()) {
			if (t.index == index) {
				return t;
			}
		} throw new IllegalArgumentException();
	}
}
