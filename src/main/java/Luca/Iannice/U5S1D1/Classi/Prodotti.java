package Luca.Iannice.U5S1D1.Classi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Prodotti {
	
	private double prezzo;
	private int calorie;
	private int grassi;
	private int carboidrati;
	
	public Prodotti (double _prezzo, int _calorie, int _grassi, int _carboidrati) {
		
		this.prezzo = _prezzo;
		this.calorie = _calorie;
		this.grassi = _grassi;
		this.carboidrati = _carboidrati;
	}

}
