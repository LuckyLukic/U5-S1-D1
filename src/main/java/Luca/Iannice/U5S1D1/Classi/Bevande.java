package Luca.Iannice.U5S1D1.Classi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevande extends Prodotti{
	
	private String bevanda;

  public Bevande (double _prezzo, int _calorie, int _grassi, int _carboidrati) {
  
         super (_prezzo, _calorie, _grassi, _carboidrati );
	  
  }
	
}
