import java.util.ArrayList;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        //Sum of all numbers in an array & Have the function to return an array that only includes numbers that are greater than 10
        PuzzleJava ps = new PuzzleJava();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = ps.sumOfAllNumbers();
        System.out.println(result);   

        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        //Shuffle the array and print the name of each person. 
        //Have the method also return an array with names that are longer than 5 characters.
        ArrayList<String> longer = new ArrayList<String>();
        longer = ps.names();
        System.out.println(longer);


        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        //Shuffle the array and, after shuffling, display the last letter from the array. 
        //Have it also display the first letter of the array. 
        //If the first letter in the array is a vowel, have it display a message.
        ps.alphabets();

        //Generate and return an array with 10 random numbers between 55-100.
        //To get a random integer, you can use the nextInt method of the Random class.
        ps.randomNumber();

        //Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
        //(showing the smallest number in the beginning). 
        //Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        ArrayList<Integer> sortRandom = new ArrayList<Integer>();
        sortRandom = ps.randomSort();
        System.out.println(sortRandom);
        System.out.println("First element: " + "" + sortRandom.get(0));
        System.out.println("Last element: " + "" + sortRandom.get(sortRandom.size()-1));

        //Create a random string that is 5 characters long.
        ps.randomString();

        //Generate an array with 10 random strings that are each 5 characters long
        ps.randomWords();
    }
}
