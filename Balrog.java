
/**
 * The Balrog class is responsible for storing the code for the Balrog demon, which has the ability to attack twice per round, it also 
 * inherits from the Demon class and overrides the attack method to fit it's
 * own power, which in this case is two attacks per round.
 *
 * @author Sebastian portillo
 * @version 11/14/24
 */
public class Balrog extends Demon 
{
    // instance variables - the range posibility of Balrog's hp
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
     * Constructor for objects of class Balrog, calls for the demon constructor with 
     * values that are specific to Blarog's stat's range.
     */
    public Balrog()
    {
        // Generate random stats within it's possible range and passes it to the Demon constructor
        super( 
        Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR) + MIN_BALROG_STR,
        Randomizer.nextInt(MAX_BALROG_HP  - MIN_BALROG_HP) + MIN_BALROG_HP);
    }

    /**
     * Override the attack method to allow Balrog to attack twice per round,
     * each attack uses the Demon's logic including it's bonus damage chance
     * @return the total damage dealt by Balrog, which is two separate attacks combined
     */
    @Override
    public int attack(){
    {
        int firstAttack = super.attack(); //first attack
        int secondAttack = super.attack();//second attack,same as 1st one
        return firstAttack + secondAttack;//Returns total damage from both attacks
    }
}
}
