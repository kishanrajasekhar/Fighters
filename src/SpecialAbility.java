
public abstract class SpecialAbility {
	//type 1 special ability occurs at start of battle and doesn't activate again
	//type 2 special ability occurs during middle of battle and can activate multiple times
	protected int type;
	protected String description;
	
	public SpecialAbility(){}
	
	public void act(Fighter user){
		//to be implemented in sub classes
	}
	
	public int getType(){
		return type;
	}
	
	public String getDescription(){
		return description;
	}
	
	//LIST OF SPECIAL ABILITIES 
	
	//INTIMIDATE
	public static class Intimidate extends SpecialAbility{
		public Intimidate(){
			type = 1;
			description = "Intimidate: Lowers opponent's attack";
		}
		
		public void act(Fighter user){
			Fighter foe = user.getOpponent();
			foe.setAttack(foe.getAttack()-1);
		}
	}
}
