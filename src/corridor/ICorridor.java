package corridor;

public interface ICorridor {

	// each corridor has a length. Should there be an enumerable set lengths?
	float length();
	
	// Corridor implementation is just a model containing the data 
	// It's only responsibility is as a container for attributes
	// how do we determine the relationship between this corridor and others, or do we?
	
	// list of adjacent corridors
	ICorridor[] adjacentCorridors();
	
	// what is the corridor made of
	String getMaterial();
	
	ICorridorObject[] getObjects();
	
}
