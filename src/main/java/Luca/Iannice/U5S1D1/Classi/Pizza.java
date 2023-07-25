package Luca.Iannice.U5S1D1.Classi;

import lombok.Getter;
import lombok.Setter;


public class Pizza extends Prodotti {
	
	String nomePizza;
	String ingrediente1 = "pomodoro";
	String ingrediente2 = "mozzarella";	
	
	public Pizza (String _nomePizza, double _prezzo, int _calorie, int _grassi, int _carboidrati) {
		super (_prezzo, _calorie, _grassi, _carboidrati );
		
		this.nomePizza = _nomePizza;
		
	}
	

}
