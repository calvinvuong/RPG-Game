// DLC -- Derek Lin, Lisa Shi, Calvin Vuong
// APCS1 pd5
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Cleric extends Character{
    //Attributes
    //all others inherited from parent Character
    
     //default constructor, sets stats, no name
    public Cleric(){
        super(150, 80, 80, 0.4, 0.4); //calls Character overloaded constr.
    }
    
    //overloaded constructor, sets stats, with name
    public Cleric (String newName){
        this(); //class Character overloaded constr., w/ name
        name = newName;
    }
    
    //Methods
    
    //returns stirng with all info
    public String about(){
	String s;
	s = "Cleric: A member of the Bishop's Order who can strike fear in the hearts of evildoers.\n";
	s += "\tRepresenting the church, the cleric can heal his allies and himself.\n";
	return s;
    }

    //override attack()
    //add hp to cleric equal to  1/3 of damage
    public int attack(Character other){
       int inflictDamage;
        inflictDamage = (int) ( (strength * attackRating) - (other.getDefense() * other.getDefenseRating()) );
        if (inflictDamage < 0){ //prevent doing negative damage
            inflictDamage = 0;
        }
        other.lowerHP(inflictDamage);
        hp += (int) (inflictDamage * 0.33); //heal after attack
        System.out.println("Your devotion to your faith restores your health by " + ((int) (inflictDamage * 0.33)) + ".");
        return inflictDamage;
    }

    /* prepares the player for a special attack.                               
       if used in succession, attackRating increases from attackRating last turn, not base
       likewise for defense */
    public void specialize(){
        attackRating *= 1.5; //increase attack rating                           
        defenseRating /= 1.5; //decrease defense rating                         
    }

    /* prepares the player for a normal attack. */
    public void normalize(){
        attackRating = baseAttackRating;
        defenseRating = baseDefenseRating;
    }
    //all others inherited from parent Character
}



