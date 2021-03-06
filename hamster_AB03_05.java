/*	have hamster put the grains it is carrying into the
	appropriate "storage corridor" (i.e. length of corridor
	needs to match the number of grains the hamster is carrying).
	start position and orientation of hamster are known,
	the number of grains it is carrying is not known.

/*	new functions:
	vornFrei()
	kornDa()
	maulLeer() */


import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB03_05 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
	linksUm();

}
void right() {
	linksUm();
	linksUm();
	linksUm();

}
void turnaround() {
	linksUm();
	linksUm();
}

/*	1. find out how many grains the hamster is carrying.
	2. match the number of grains to the appropriate corridor. */
	

/*	walk up to a storage corridor:
	from main corridor turn right, walk along the length of
	the storage corridor, turn right, walk right up to storage
	area (which differs in size) */
void enterCorridor() {
	right();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	right();
	vor();
	vor();
	right();
}

/*	leave any storage corridor
	(hamster needs be on very first tile of storage area,
	having the storage area in its back */
void exitCorridor() {
	left();
	vor();
	vor();
	left();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	left();
}

void dropGrains() { // if there are 2+ grains
	vor();
	gib();
}

	


/*	drop grains to find out how many there are. */
public void main() {
	gib();
	if (maulLeer()) { // there is only one grain
		nimm();
		vor();
		vor();
		enterCorridor();
		gib();
		turnaround();
		exitCorridor();
		
	} else {
		gib();		
		if (maulLeer()) { // there are two grains
			nimm();
			nimm();
			vor();
			vor();
			vor();
			vor();
			vor();
			vor();
			enterCorridor();
			gib();
			dropGrains();
			turnaround();
			vor();			
			exitCorridor();
			vor();
			vor();
			vor();
			vor();
		} else {
			gib();
			if (maulLeer()) { // there are three grains
				nimm();
				nimm();
				nimm();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				enterCorridor();
				gib();
				dropGrains();
				dropGrains();
				turnaround();
				vor();
				vor();		
				exitCorridor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();
				vor();	
		
			} else {
				gib();
				if (maulLeer()) { // there are four grains
					nimm();
					nimm();
					nimm();
					nimm();
					vor();
					vor();
					vor();
					vor();
					vor();
					vor();					
					vor();
					vor();
					vor();
					vor();
					vor();
					vor();					
					vor();
					vor();
					enterCorridor();
					gib();
					dropGrains();
					dropGrains();
					dropGrains();
					turnaround();
					vor();			
					vor();
					vor();
					exitCorridor();
					vor();
					vor();
					vor();
					vor();
					vor();
					vor();					
					vor();
					vor();
					vor();
					vor();
					vor();
					vor();					
				} else { // do nothing if there are more than 4
				}
			}
		}	
	}
	vor();
	vor();	
	turnaround();	
}
}