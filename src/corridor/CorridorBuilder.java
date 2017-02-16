package corridor;

public interface CorridorBuilder {

	// create the corridor itself
	ICorridor createCorridor();
	
	// create the objects inside of the corridor
	void populateCorridor();
}
