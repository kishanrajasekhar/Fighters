public class Fighter {

	private String name;
	private int hitpoints;
	private int attack;
	private int defense;
	private Fighter opponent;
	private boolean alive;
	protected FightingMove moves[]; //Fighter may have different amount of moves, but it will
	//remain a fixed amount
	private boolean firstMove = true;
	
	public Fighter(String name, int hp, int att, int def, FightingMove moves[]){
		this.name = name;
		hitpoints = hp;
		attack = att;
		defense = def;
		alive = true;
		this.moves = moves;
	}
	
	
	//The fighter attacks his opponent
	public void attack(int option){
		if(firstMove){
			//if specialAbility type is `
				//activate special ability
			firstMove = false;
		}
		moves[option].act(this);
	}
	
	//The damage the fighter receives is subtracted from his hp
	public void receiveDamage(int damage){
		hitpoints -= damage;
		if (hitpoints <=0){
			alive=false;
		}
	}
	
	//Getters and setters
	public String getName(){
		return name;
	}
	
	public int getHP(){
		return hitpoints;
	}
	
	public int getAttack(){
		return attack;
	}
	
	public void setAttack(int a){
		attack = a;
	}
	
	public int getDefense(){
		return defense;
	}
	
	public Fighter getOpponent(){
		return opponent;
	}
	
	public void setOpponent(Fighter foe){
		opponent = foe;
	}	
	
	//return whether the fighter has hp left
	public boolean isAlive(){
		return alive;
	}
	
	public FightingMove[] getMoves(){
		return moves;
	}
	
	//returns number of moves the fighter has
	public int getNumberOfMoves(){
		return moves.length;
	}
	
	
}
