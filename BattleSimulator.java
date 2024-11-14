import java.util.ArrayList;
/**
 *The BattleSimulator class stores the code necessary for simulating the
 *battle between the two armies, that is made up of off different creatures
 *
 * @author Sebastian Portillo
 * @version 11/14/24
 */
public class BattleSimulator
{
    public static void main(String[] args){
    ArrayList<Creature> goodArmy = new ArrayList<>(); //Holds creatures for the good army
    ArrayList<Creature> evilArmy = new ArrayList<>(); //Holds creatures for the bad army
    //populate the armies
    populateArmy(goodArmy, "good");
    populateArmy(evilArmy, "evil");
    //simulate teh battle
    simulateBattle(goodArmy, evilArmy);

    }  
    /**
     * Populates an army with creatures based on what their type is.
     *@param army the ArrayList to populate
     *@param the type of army("good" or "evil")
     */
    public static void  populateArmy(ArrayList<Creature> army, String type)
    {
    if (type.equals("good")){
        for(int i = 0; i <100; i++){
        int creatureType = Randomizer.nextInt(10);
        if(creatureType <= 6){
        army.add(new Human());
        } else if (creatureType <= 9){
        army.add(new Elf());
        }
    }
        }else if (type.equals("evil")){
        for (int i = 0; i < 50; i++) {
        int creatureType = Randomizer.nextInt(25);
        if (creatureType <= 18) {
        army.add(new Human());
        } else if (creatureType <= 24) {
        army.add(new CyberDemon());
        }else {
        army.add(new Balrog());
        }
    }
    }
    }

    /**
     * Simulates the battle between the two armies, and it stops when one is defeated
     * @param goodArmy the Arraylist represents the good army
     * @param evilArmy the ArrayList represents the evil army
     */
    public static void simulateBattle(ArrayList<Creature> goodArmy, ArrayList<Creature> evilArmy){
    int goodIndex = 0;
    int evilIndex = 0;
    while (goodIndex < goodArmy.size() && evilIndex < evilArmy.size()){
    Creature goodCreature = goodArmy.get(goodIndex);
    Creature evilCreature = evilArmy.get(evilIndex);
    //The creatures will fight until one is defeated
    while (goodCreature.isAlive() && evilCreature.isAlive()){
    int goodDamage = goodCreature.attack();
    int evilDamage = evilCreature.attack();
     goodCreature.takeDamage(evilDamage);
    evilCreature.takeDamage(goodDamage);
    } 
    //Determines which creature is defeated
    if (!goodCreature.isAlive()){
    goodIndex++;
    }
    if(!evilCreature.isAlive()){
    evilIndex++;
    }
    }
    //Displays the outcome of the battle
    if (goodIndex >= goodArmy.size() && evilIndex >= evilArmy.size()){
    System.out.println("The battle is a draw!Both armies were defeated.");
    } else if(goodIndex >= goodArmy.size()){
    System.out.println("Evil army has won the battle! Happy Ending");
    } else {
    System.out.println("Good army has won the battle! Hopefully corruption dissapears");
    }
    }
    }
    

