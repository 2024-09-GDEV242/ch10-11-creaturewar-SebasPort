
/**
 * The CyberDemon class is responsible for storing the code for the Cyberdemon subclass, 
 * which is a stronger type of demon that has stronger stats, but also has the same change 
 * of dealing bonus damage like it's parent class the demon.
 *
 * @author Sebastian   Portillo
 * @version 11/14/24
 */
public class CyberDemon extends Demon
{
    // instance variables - gives the range of the stats that the cyberdemon can get
    private static final int MAX_CYBER_DEMON_HP = 100;
    private static final int MIN_CYBER_DEMON_HP = 25;
    private static final int MAX_CYBER_DEMON_STR = 40;
    private static final int MIN_CYBER_DEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon
     * Calls the Demon constructor with specific values to the CyberDemon range of stats 
     * 
     */
    public CyberDemon()
    {
        // Creates random stats with the CyberDemon's given range and passes it to the Demon constructor
        super(
        Randomizer.nextInt(MAX_CYBER_DEMON_STR - MIN_CYBER_DEMON_STR) + MIN_CYBER_DEMON_STR,
        Randomizer.nextInt(MAX_CYBER_DEMON_HP - MIN_CYBER_DEMON_HP) + MIN_CYBER_DEMON_HP);
    }

    /**
     * Override the attack method for the cyberDemos to be able to use its base damage plus the chance of bonus magical damage, inheriting the behaviour of the parent class, but with it;s own stats
     * @return the damage dealt by the CyberDemon, possibly with bonus damage   
     */
    @Override
    public int attack(){
    {
     return super.attack();//The CyberDemon uses the same attack as a base Demon, inheriting the bonus damage chance
    }
}
}
