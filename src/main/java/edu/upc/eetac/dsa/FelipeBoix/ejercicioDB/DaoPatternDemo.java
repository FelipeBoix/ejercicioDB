package edu.upc.eetac.dsa.FelipeBoix.ejercicioDB;

public class DaoPatternDemo {
	public static void main(String[] args) {
	      piecesDAO piecesDAO = new piecesDaolmpl();
	    
	   //print all students
	      for (pieces student : piecesDAO.getAllPieces()) {
	         System.out.println("Student: [RollNo : "
	            +student.getCodes()+", Name : "+student.getName()+" ]");
	}
	     
	   // get the student
	      pieces piece = piecesDAO.getPieces(0);
	    System.out.println("Pieces: [code : "
	       +piece.getCodes()+", Name : "+piece.getName()+" ]");		
	   }
	}



