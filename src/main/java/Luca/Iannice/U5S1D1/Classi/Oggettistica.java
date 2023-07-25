package Luca.Iannice.U5S1D1.Classi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Oggettistica {
	
	private String brand = "Godfather's Pizza";
	private double prezzo;
	
	public Oggettistica (double _prezzo) {
		
		this.prezzo = _prezzo;
		
	}
	

}
