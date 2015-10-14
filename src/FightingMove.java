
public abstract class FightingMove {
	
	protected String name; //name of the fighting move
	
	//default constructor
	public FightingMove(){}
	
	public void act(Fighter user){
		//subclasses will implement this method
	}
	
	public String getName(){
		return name;
	}
	
	//LIST OF FIGHTING MOVES
	
	//KICK
	public static class Kick extends FightingMove{
		public Kick(){
			name = "Kick";
		}
		
		public void act(Fighter user){
			int damage = user.getAttack() - user.getOpponent().getDefense();
			user.getOpponent().receiveDamage(damage);
			if (damage<1){
				damage = 1;
			}
			damage *= 2;
			user.getOpponent().receiveDamage(damage);
		}
	}
	
	//PUNCH
	public static class Punch extends FightingMove{
		public Punch(){
			name = "Punch";
		}
		
		public void act(Fighter user){
			int damage = user.getAttack() - user.getOpponent().getDefense();
			user.getOpponent().receiveDamage(damage);
			if (damage<1){
				damage = 1;
			}
			user.getOpponent().receiveDamage(damage);
		}
	}
	
	
}
