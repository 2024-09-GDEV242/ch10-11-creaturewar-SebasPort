
/**
 * The Elf class is responsible for storing the code for the Elf, which
 * is a magical creature that has the chance to inflict double damage. This is 
 * possible with the override, making it a chance of doing extra damage.
 * @author Sebastian Portillo
 * @version 11/14/24
 */
public class Elf extends Creature 
{
    // instance variables - The range for the elf's hp and strength
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for Elf, it will create an Elf with random stats (hp and strength)
     * The hp and strength will be determined by the randomizer based on the given range
     */
    public Elf()
    {
        //Calls the creature constructor with random generated stats
        super(Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+ MIN_ELF_STR,
        Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP);
    }

    /**
     * Override of the attack method, giving it the chance to add %10 chance for double damage 
     * @return the damage done in the attack, with the chance of double damage
     */
    @Override 
    public int attack(){
    int baseDamage = super.attack(); //Gets the base damagae from the Creature's attack
    if(Randomizer.nextInt(10) == 1)//Checks if the attack contains the 10% chance of double damage, which is a chance of 1 in 10
    {
    return baseDamage * 2; //Returns the double damage
    } else {
    return baseDamage; //Returns the regular damage
    }
}
}
