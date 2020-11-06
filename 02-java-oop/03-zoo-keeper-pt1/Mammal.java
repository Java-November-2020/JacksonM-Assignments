public class Mammal{

    //Every mammal should have an energy level (default 100).
    protected int energy = 100; 
    //They should all be able to display their energy levels when asked through the displayEnergy method,
    //which should print and return the energy level.
    public int displayEnergy(){
        System.out.println("Energy level: " +  energy);
        return energy;
    }

}