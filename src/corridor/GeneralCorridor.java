package corridor;

import surface.*;


public abstract class GeneralCorridor {
	
	// A corridor has length, width and height
	protected float[] dims;
	// A corridor should be composed of two walls and a floor 
	// and possibly a ceiling.
	
	protected Wall lWall;
	protected Wall rWall;
	protected Floor floor;
	protected Ceiling ceiling;
	protected float length;
	protected float width;
	
	protected GeneralCorridor[] adjacentCorridors;
	
	public static void main(String[] args){
		//TODO: 
	}
}
