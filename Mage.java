// DLC -- Derek Lin, Lisa Shi, Calvin Vuong
// APCS1 pd5
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-17

//Class Mage
//slightly higher attack, low defense, high specialize damage

public class Mage extends Character{
    //Attributes
    //all attributes inherited
    
    //methods
    //all other methods inherited
    
    //default constructor, sets stats, no name
    public Mage(){
        super(120, 100, 70, 0.8, 0.8); //calls Character overloaded constr.
        mana = 3;
    }
    
    //overloaded constructor, sets stats, with name
    public Mage(String newName){
        this(); //class Character overloaded constr., w/ name
        name = newName;
    }

    //returns string with info about this class
    public String about(){
	String s;
	s = "Mage: A member of the elite group of magic users who will blast his foes off the face of this realm.\n";
	s += "\tThe mage has many spells in his arsenel to trun the tide of battle in his favor.\n";
	return s;
    }

    //special attack, changes attack and defense ratings
    public void specialize(){
        if (hasMana()){
            attackRating = 5;
            defenseRating = 5;
            mana -= 1;
        }
        else{
            attackRating = 0.5;
            defenseRating = 0.5;
            System.out.println("Your well of mana has run dry, you become unlucky and your strength and defense fall by half instead.");
        }
    }
    //normal attack, change ratings back to normal
    public void normalize(){
        attackRating = baseAttackRating;
        defenseRating = baseDefenseRating;
        mana += 1;
        System.out.println("You restore 1 point of mana.");
    }
}