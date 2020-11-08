public class Wizard extends Human{

    private int health = 50;
    protected int intelligence = 8;

    public void heal(Human hd){
        hd.health = health;
        System.out.println("The current human health: " + hd.health);
    }

    public void fireball(Human hd){
        int new_intelligence = intelligence * 3;
        hd.intelligence = hd.intelligence - new_intelligence;
        System.out.println("The current intellegence is: " + hd.intelligence);        
    }
}
