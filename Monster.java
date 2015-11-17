// DLC -- Derek Lin, Lisa Shi, Calvin Vuong
// APCS1 pd5
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-17

public class Monster extends Character{
    
    //Attributes
    //all are inherited
    
    //Constructors
    public Monster() {
	    //call overloaded constructor from parent to set stats
	    super(150, (int) ((Math.random() * 45) + 65), 20, 1.0, 1.0);
    }
    
    //methods
    //return string containing info about class
    public String about(){
	String s;
	s = "A foe deadbeat on bringing your adventures to an end.\n";
	return s;
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
}