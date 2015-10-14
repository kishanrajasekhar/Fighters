/*This class is responsible for printing out
 * what happens during the fight.
 */
public class PrintFight {
	
	public PrintFight(){};
	
	//only prints name and hp of fighter
	public void printPartialStats(Fighter fighter){
		System.out.println(fighter.getName() + ": " + "HP: " + fighter.getHP());
	}
	
	//prints all the moves that the fighter has
	public void printMoves(Fighter fighter){
		FightingMove moves[] = fighter.getMoves();
		String s = "";
		for(int i=0; i<moves.length; i++){
			s += (i+1);
			s += ") " + moves[i].getName() + " ";
		}
		System.out.println(s);
	}
}
