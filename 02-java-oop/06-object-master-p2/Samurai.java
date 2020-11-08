public class Samurai extends Human {
    protected int health = 200;

    public void deathBlow(Human hd){
        hd.health = 0;
        System.out.println("Human's health: " + hd.health);
        health = health/2;
        System.out.println("Samurai's health after death blow: " + health);
    }

    public void meditate(){
        health = health * 2;
        System.out.println("Samurai's health after meditation: " + health);
    }

    public int howMany(){
        return health;
    }
}
