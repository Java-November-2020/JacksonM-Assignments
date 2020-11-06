public class Gorilla extends Mammal {
    //Once this is done, she has asked that you also create a separate class of gorilla, 
    //which can throw things at people but will lose energy (-5) whenever this is done. 
    public void throwSomething(){
        energy -=5;
        System.out.println("The Gorilla has thown something, and the energy level has decreased by 5." );
        // System.out.println("The new energy value is: " + energy);
    }
    //The gorilla should also be able to eatBananas and regain energy (+10). 
    
    public void eatBananas(){
        energy += 10;
        System.out.println("The Gorilla had ate the bananas, got satisfied, and increased the enery level by 10.");
        // System.out.println("The new energy value is: " + energy);
    }

    //The gorilla should also be able to climb at the expense of energy (-10).

    public void climb(){
        energy -= 10;
        System.out.println("The Gorilla had climed a tree, and decreased its energy by 10.");
        // System.out.println("The new energy value is: " + energy);
    }


}
