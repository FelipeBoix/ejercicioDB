package edu.upc.eetac.dsa.FelipeBoix.ejercicioDB;
import java.util.List;

public interface piecesDAO {
	
	public List<pieces> getAllPieces();
	public pieces getPieces (int rollNo);

}
