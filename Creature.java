
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Crosbie
 * @version 2020-10 v1.0
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp; //Sets max_hp to initial hp value
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
       this.str = str;
       this.hp = hp;
       this.max_hp = hp; //Sets max_hp to the starting hp
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        return Randomizer.nextInt(str); //Random damage from 1 to str
    }
    
    
    /**
     * Is this creature still capable of fighting? Checks if its still alive
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        return hp > 0; 
    }
    
    /**
     * Is this creature knockedOut? Checks if the creature's hp is less than or equal to zero
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        return hp <= 0;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points,if it hits zero, it's set to zero.
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        hp -= damage; //Reduce hp by damage amount
        if (hp < 0) hp = 0; //Makes sure that the hp does not go below zero
    }
    /**
     * Get's current hp for the creature.
     * @return current creature's hp
     */
    public int getHealth(){
        return hp;
    }
    
}
