public class Bat{
    private int energy = 300;

    public void fly(){
        System.out.println("Voovoo");
        energy -= 50;
    }

    public void eatHumans(){
        System.out.println("So-well, never mind, just increase it's energy by 25.");
        energy +=50;
    }

    public void attackTown(){
        System.out.println("Shooooooooooooooo");
        energy -=100;
    }

    public void displayEnergy(){
        System.out.println("Current energy level: " + energy);
    }
}