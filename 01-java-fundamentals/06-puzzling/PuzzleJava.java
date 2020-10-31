import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    //Sum of all numbers in an array & have the function to return an array that only includes numbers that are greater than 10
    public ArrayList<Integer> sumOfAllNumbers(){
        //Sum of all numbers in an array
        ArrayList<Integer> values = new ArrayList<Integer>(
            Arrays.asList(3,5,1,2,7,9,8,13,25,32)
        );
        System.out.println(values);
        int sum = 0;
        for(int i =0; i<values.size(); i++){
            sum += values.get(i);
        }
        System.out.println(sum);

        //Have the function to return an array that only includes numbers that are greater than 10
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        for (int j=0; j<values.size(); j++){
            System.out.println(values.get(j));
            if (values.get(j) > 10){
                greaterThan10.add(values.get(j));
            }
        }
        return greaterThan10;
    }

    public ArrayList<String> names(){
        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        ArrayList<String> nameList = new ArrayList<String>(
            Arrays.asList("Nancy","Jinichi","Fujibayashi", "Momochi", "Ishikawa")
        );
        ArrayList<String> result = new ArrayList<String>();
        System.out.println(nameList);
        //Shuffle the array and print the name of each person. 
        Collections.shuffle(nameList);
        System.out.println(nameList);
        //Have the method also return an array with names that are longer than 5 characters.
        for(int i=0; i<nameList.size();i++){
            if(nameList.get(i).length()>5){
                result.add(nameList.get(i));
            }
        }
        return result;
    }
    
    public void alphabets(){
        ArrayList<Character> alphabets = new ArrayList<Character>();
        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        for(char i= 'a'; i<= 'z'; i++){
            alphabets.add(i);
        }
        System.out.println("Before Shuffle: " + "" + alphabets);
        Collections.shuffle(alphabets);
        //Shuffle the array  
        System.out.println("After Shuffle: " + "" +alphabets);
        //After shuffling, have it also display the first letter of the array. 
        System.out.println(alphabets.get(0));
        //Display the last letter from the array.
        System.out.println(alphabets.get(alphabets.size()-1));
        //If the first letter in the array is a vowel, have it display a message.
        ArrayList<Character> vowels = new ArrayList<Character>(
            Arrays.asList('a','e','i','o','u')
        );
        for(int i=0; i<vowels.size();i++){
            if(alphabets.get(0)== vowels.get(i)){
                System.out.println("The first letter is a vowel.");
            }
        }   
    }

    //Generate and return an array with 10 random numbers between 55-100.
    //To get a random integer, you can use the nextInt method of the Random class.
    public void randomNumber(){
        Random r = new Random();
        int low = 55;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);
    }

    //Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
    //(showing the smallest number in the beginning). 
    //Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public ArrayList<Integer> randomSort(){
        ArrayList<Integer> rdm = new ArrayList<Integer>();
        Random r = new Random();
        int low = 55;
        int high = 100;
        int result;
        for(int i = 0; i<10; i++){
            result = r.nextInt(high-low) + low;
            rdm.add(result);
        }
        Collections.sort(rdm);
        return rdm;
    }

    //Create a random string that is 5 characters long.
    public void randomString(){
        ArrayList<Character> alphabets = new ArrayList<Character>();
        for (char c = 'a'; c<='z';c++){
            alphabets.add(c);
        }
        // System.out.println(alphabets);
        String result="";
        for (int i = 0; i<5;i++){
            Random r = new Random();
            result += alphabets.get(r.nextInt(alphabets.size()));
        }
        System.out.println(result);
    }

    //Generate an array with 10 random strings that are each 5 characters long
    public void randomWords(){
        ArrayList<Character> alpha = new ArrayList<Character>();
        for (char c = 'a'; c<='z';c++){
            alpha.add(c);
        }
        // System.out.println(alpha);
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 0; i<10;i++){
            String result1="";
            for (int j=0;j<5;j++){
                Random r = new Random();
                result1 += alpha.get(r.nextInt(alpha.size()));
            } 
            values.add(result1);
        }
        System.out.println(values);
    }
}
