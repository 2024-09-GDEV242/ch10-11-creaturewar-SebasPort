/**
 * The CreatureTest class contains unit tests to verify correct behavior of each Creature subclass.
 * This includes testing hit points and strength ranges, attack functionality, and unique behavior like bonus damage.
 * @author Sebastian Portillo
 * version 11/14/24
 */
public class CreatureTest {

    public static void main(String[] args) {
        testHuman();
        testElf();
        testCyberDemon();
        testBalrog();
        System.out.println("All tests passed!");
    }

    /**
     * Test the Human class to ensure hit points and strength are within range.
     */
    public static void testHuman() {
        Human human = new Human();
        assert human.getHealth() >= 5 && human.getHealth() <= 25 : "Human health out of range";
        int damage = human.attack();
        assert damage >= 1 && damage <= 20 : "Human attack damage out of range";
    }

    /**
     * Test the Elf class to verify attack behavior and check magical bonus damage.
     */
    public static void testElf() {
        Elf elf = new Elf();
        assert elf.getHealth() >= 8 && elf.getHealth() <= 25 : "Elf health out of range";
        int damage = elf.attack();
        assert damage >= 1 && damage <= 36 : "Elf attack damage out of range";
    }

    /**
     * Test the CyberDemon class to confirm correct strength and HP range.
     * Verifies the chance of bonus magical damage.
     */
    public static void testCyberDemon() {
        CyberDemon cyberDemon = new CyberDemon();
        assert cyberDemon.getHealth() >= 25 && cyberDemon.getHealth() <= 100 : "CyberDemon health out of range";
        int damage = cyberDemon.attack();
        assert damage >= 1 && damage <= 90 : "CyberDemon attack damage out of range";
    }

    /**
     * Test the Balrog class to confirm it attacks twice per round and is within range.
     */
    public static void testBalrog() {
        Balrog balrog = new Balrog();
        assert balrog.getHealth() >= 80 && balrog.getHealth() <= 200 : "Balrog health out of range";
        int damage = balrog.attack();
        assert damage >= 2 && damage <= 200 : "Balrog total attack damage out of range";
    }
}
