public class Ninja extends Human{
    protected int stealth = 10;

    public void steal(Human hd){
        System.out.println("The amount of stealth the human has is: " + hd.stealth);
        System.out.println("The amount of stealth the ninja has is: " + stealth);
        stealth += (stealth - hd.stealth);
        System.out.println("The new amount of stealth the ninja has is: " + stealth);
    }

    public void runAway(){
        super.health -=10;
        System.out.println("Human's health: " + super.health);
    }
}
