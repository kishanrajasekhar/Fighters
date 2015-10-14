import java.util.ArrayList;
import java.util.Scanner;


public class tester {
	
	public static int chooseOption(int lowerBound, int upperBound){
		Scanner sc = new Scanner(System.in);
		int result = lowerBound-1;
		while((result<lowerBound) || (result>upperBound)){
			result = sc.nextInt();
		}
		return result;
	}
	
	
	
	public static void main(String args[]){
		PrintFight pf = new PrintFight();
		
		FightingMove moves[] = {new FightingMove.Punch(), new FightingMove.Kick()};
		
		Fighter Bob = new Fighter("Bob", 10, 5, 4, moves);
		Fighter Tom = new Fighter("Tom", 12, 4, 5, moves);
		Bob.setOpponent(Tom);
		Tom.setOpponent(Bob);
		
		pf.printPartialStats(Tom);
		pf.printPartialStats(Bob);
		
		Scanner sc = new Scanner(System.in);
		while(Bob.isAlive() && Tom.isAlive()){
			System.out.println("Choose move");
			pf.printMoves(Bob);
			Bob.attack(chooseOption(0,Bob.getNumberOfMoves())-1); //subtract 1 to take into account 0 indexing
			System.out.println("Choose move");
			pf.printMoves(Tom);
			Tom.attack(chooseOption(0,Bob.getNumberOfMoves())-1); //subtract 1 to take into account 0 indexing
			
			pf.printPartialStats(Tom);
			pf.printPartialStats(Bob);
		}
	}
	
}
