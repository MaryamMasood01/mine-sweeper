
/* CellVal key -
	-1 : mine
	 0 : empty
	 cellVal >= 1 : number of mines
*/

public class Cell{
	int cellVal;
	boolean visible;
	boolean flagged;
	// boolean  mine; *Now in GameBoard class
	
	public Cell(){
		cellVal = 0;
		visible = false;
		flagged = false;
	}
	
	public int getCellVal(){
		return cellVal;
	}
	
	public boolean getVisible(){
		return visible;
	}
	
	public boolean getFlagged(){
		return flagged;
	}
	
	public void setCellVal(int intended){
		cellVal = intended;
	}
	
	public void setVisible(boolean intended){
		visible = intended;
	}
	
	public void setFlagged(boolean intended){
		flagged = intended;
	}
	
}




