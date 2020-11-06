public class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat();
        //Attack three towns
        b.attackTown();
        b.attackTown();
        b.attackTown();
        //Eat two humans
        b.eatHumans();
        b.eatHumans();
        //Fly Twice
        b.fly();
        b.fly();
        //Display Energy
        b.displayEnergy();
    }
}
