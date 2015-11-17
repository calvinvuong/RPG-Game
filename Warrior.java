// DLC -- Derek Lin, Lisa Shi, Calvin Vuong
// APCS1 pd5
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-17

/* Thanks for choosing the Warrior class! You are a Warrior, a class of fighters with powerful weapons and armor! You will fight on 
the front of the battle field with increased strength to defeath your enemies. Fight! */

public class Warrior extends Character{
    // Attributes and Stats
    // all inherited from parent class Character
    
    // Constructors
    
    /* Default Constructor
       Sets default values for attributes. */
    public Warrior(){
        super(200, 100, 85, 0.4, 0.8); //call superclass overloaded constructor w/ these stats
        //empty name
    }
    
    /* Overloaded Constructor
       Sets Warrior name equal to input parameter and stats */
    public Warrior(String newName){
        this();
        name = newName;
        //with this name and these stats
    }
    
    // METHODS
    //all others inherited from Character superclass
    public String about(){
	String s;
	s = "Warrrior: A mighty hero that overwhelms his foes with sheer power. Nothing will stand in his way.\n";
	s += "\tThe warrior posseses the highest strength and defense of any class, however, he has no special skills.\n";
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