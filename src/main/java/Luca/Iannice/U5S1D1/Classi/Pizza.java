package Luca.Iannice.U5S1D1.Classi;


import Services.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Prodotti {
	
	private String nomePizza;
	private final String ingrediente1 = "pomodoro";
	private final String ingrediente2 = "mozzarella";
	private Size size;
	
	public Pizza (String _nomePizza, Size _size, double _prezzo, int _calorie, int _grassi, int _carboidrati) {
		super (_prezzo, _calorie, _grassi, _carboidrati );
		
		this.nomePizza = _nomePizza;
		this.size = _size;	
		
	}
	
	

}
