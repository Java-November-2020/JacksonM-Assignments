public class GorillaTest{
    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.displayEnergy();
        //She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times.
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        //eat bananas twice
        g.eatBananas();
        g.eatBananas();
        //Climb once
        g.climb();
        //Print the gorilla's energy level.
        g.displayEnergy();
    }
}