public class HumanTest {
    public static void main(String[] args) {
        Wizard wz = new Wizard();
        Human hd = new Human();
        hd.health = 5;
        hd.intelligence = 50;
        wz.heal(hd);
        wz.fireball(hd);

        Ninja nj = new Ninja();
        nj.stealth = 30;
        nj.steal(hd);
        nj.runAway();

        Samurai sm = new Samurai();
        sm.health = 500;
        sm.deathBlow(hd);
        sm.meditate();
        int count = sm.howMany();
        System.out.println("Samurai's health: " + count);
    }
}
