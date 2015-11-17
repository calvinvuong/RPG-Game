// DLC -- Derek Lin, Lisa Shi, Calvin Vuong
// APCS1 pd5
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-17

public abstract class Character{
    // Instance Variables
    //protected so that only visible to subclasses
    protected String name = "";
    protected int hp;
    protected int mana;
    protected int strength;
    protected int defense;
    protected double attackRating;
    protected double baseAttackRating;
    protected double defenseRating;
    protected double baseDefenseRating;
    
    //ABSTRACT METHODS
    public abstract void normalize();
    public abstract void specialize();
    public abstract String about();

    // Constructors
    // Default Constructor; set instance vars to default vals
    public Character(){
        hp = 10;
        strength = 10;
        defense = 10;
        attackRating = 1.0;
        baseAttackRating = attackRating;
        defenseRating = 1.0;
        baseDefenseRating = defenseRating;
    }
    //Overloaded Constructor; set instance vars to input params, no name
    public Character(int inputHp, int inputStrength, int inputDefense, 
                    double inputAttackRating, double inputDefenseRating){
        this();
        hp = inputHp;
        strength = inputStrength;
        defense = inputDefense;
        attackRating = inputAttackRating;
        defenseRating = inputDefenseRating;
        baseAttackRating = attackRating;
        baseDefenseRating = defenseRating;
    }
    //Overloaded Constructor; set instance vars to input params, w/ name
    public Character(String inputName, int inputHp, int inputStrength, int inputDefense,
                    double inputAttackRating, double inputDefenseRating){
        this(inputHp, inputStrength, inputDefense, inputAttackRating, inputDefenseRating);
        name = inputName;
    }
    
    // Methods 
    //for debugging purposes
    public String stats(){
        String retStr = "";
        retStr += "Name: " + name + "\n";
        retStr += "HP: " + hp + "\n";
        retStr += "Strength: " + strength + "\n";
        retStr += "Defense: " + defense + "\n";
        retStr += "Base Attack Rating: " + baseAttackRating + "\n";
        retStr += "Base Defense Rating: " + baseDefenseRating;
        return retStr;
    }
    //returns true if character alive
    public boolean isAlive(){
        return (hp > 0);
    }
    //returns true if character has mana
    public boolean hasMana(){
        return (mana > 0);
    }
    //returns value of character's HP
    public int getHP(){
        return hp;
    }
    //returns value of character's defense
    public int getDefense(){
        return defense;
    }
    //returns value of charater's defense rating
    public double getDefenseRating(){
        return defenseRating;
    }
    // return name of character
    public String getName(){
        return name;
    }
    //lower character's HP by int specified in param
    public int lowerHP(int recieveDamage){
        hp -= recieveDamage;
        return recieveDamage;
    }
    //attack character specified in other
    public int attack(Character other){
        int inflictDamage;
        inflictDamage = (int) ( (strength * attackRating) - (other.getDefense() * other.getDefenseRating()) );
        if (inflictDamage < 0){ //prevent doing negative damage
            inflictDamage = 0;
        }
        other.lowerHP(inflictDamage);
        return inflictDamage;
    }
}