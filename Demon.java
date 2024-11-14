
/**
 * The Demon class is responsible for storing the code of the demon, which is a creature.
 * It has the chance to inflict bonus magical damage (50) on each attack.
 *
 * @author Sebastian Portillo
 * @version 11/14/24
 */
public class Demon extends Creature
{
    // instance variables - demon's possible bonus damage
    private static final int BONUS_DAMAGE = 50; //This is the bonus damage  that the demons are capable of doing
    /**
     * Constructor for Demon
     * This constructor takes the stat's parameters within the range to be set by its subclasses.
     * @param str the strength of the demon
     * @param hp the hp of the demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Override of the attack ,method to add a 5% chance of bonus damage.
     * @return total damage dealt by the demon on it's attack, with it's potential bonus   
     */
    @Override
    public int attack()
    {
        int baseDamage = super.attack(); //Get's the base damage
        if (Randomizer.nextInt(20) == 1) //Check's if the attack has the 5% change of dealing bonus damage, which is a chance of one in twenty
        {
        return baseDamage + BONUS_DAMAGE; //Add's the bonus damage to the base damage
       } else {
        return baseDamage; //If no bonus then just regular damage
       }
    }
}
