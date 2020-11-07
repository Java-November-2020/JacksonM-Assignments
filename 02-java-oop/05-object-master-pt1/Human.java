public class Human{

    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    // Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
    public void attack(Human hd){
        System.out.println("Health Before Attack: " + hd.health);
        hd.health -= this.strength;
        System.out.println("Health After Attack: " + hd.health);
        
    }

    public void setStrength(int str){
        this.strength = str;
    }
}