package edu.upc.eetac.dsa.FelipeBoix.ejercicioDB;
import java.util.List;
import java.util.ArrayList;

public class piecesDaolmpl implements piecesDAO {
	List<pieces> pieces;
	
	public piecesDaolmpl(){
		
		  pieces = new ArrayList<pieces>();
	      pieces piece1 = new pieces("piece1",0);
	      pieces piece2 = new pieces("piece2",1);
	      pieces.add(piece1);
	      pieces.add(piece2);
	}
	 
	public List<pieces> getAllPieces() {
	      return pieces;
	  }
	
	public pieces getPieces(int code) {
	      return pieces.get(code);
	   }
	

}
