import java.util.ArrayList;

public class BasicJava{
    //Print 1-255
    public void allNumbers(){
        for (int i=0; i < 255; i++){
            System.out.println(i);
        }

    }

    //Print odd numbers between 1-255
    public void oddNumbers(){
        for(int j=0; j<255; j++){
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }

    //Print Sum
    public void printSum(){
        int result = 0;
        for(int i=0; i < 255; i++){
            result += i;
            System.out.println("New number: " + i + " Sum: " + result);
        }
    }

    //Iterate through the array
    public void iterateArray(int[] arr){
        for (int i=0;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //Find the Max value
    public void findMax(int[] inputValue){
        int maxValue = inputValue[0];
        for (int i=0; i< inputValue.length; i++){
            if(inputValue[i]> maxValue){
                maxValue= inputValue[i];
            }
        }
        System.out.println(maxValue);
    }

    //Get Average from the Array
    public void getAverage(int[] avg){
        int result= 0;
        int average;
        for (int i=0; i< avg.length; i++){
            result += avg[i];
        }
        average = result/ avg.length;
        System.out.println("Average: " + average);
    }

    //Array with Odd Numbers
    public void arrayOddNumbers(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=0; i<=255; i++){
            if(i%2!=0){
                myArray.add(i);
            }
        }
        System.out.println(myArray);
    }

    //Greater Than Y
    public int greaterThanY(int[] arg, int comp){
        ArrayList<Integer> greaterValue = new ArrayList<Integer>();
        for (int i=0; i<arg.length; i++){
            if (arg[i] > comp){
                greaterValue.add(i);
            }
        }
        return greaterValue.size();
    }

    //Square the values
    public ArrayList<Integer> squareValues(ArrayList<Integer> val){
        int result = 0;
        for(int i=0; i<val.size(); i++){
            result = val.get(i)* val.get(i);
            val.set(i, result);
        }
       return val;
    }

    //Eliminate Negative Numbers
    public ArrayList<Integer> eliminateNegativeNumbers(ArrayList<Integer> val){
        for (int i=0; i< val.size(); i++){
            if (val.get(i)<0){
                val.set(i,0);
            }
        }
        return val;
    }

    //Max, Min, and Average
    public void minMaxAvg(int[] values){
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Maximum Value
        int max = values[0];
        for (int i=0; i<values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        result.add(max);

        //Minimum Value
        int min = values[0];
        for (int j=0; j<values.length; j++){
            if(values[j]< min){
                min = values[j];
            }
        }
        result.add(min);

        //Average Value
        int avg;
        int sum = 0;
        for (int k=0; k<values.length; k++){
            sum += values[k]; 
        }
        avg = sum/values.length;
        result.add(avg);

        System.out.println(result);
    }

    //Shifting the Values in the Array
    public void shiftingValues(ArrayList<Integer> arr){
        int result = 0;
        for (int i=0; i<=arr.size()-1; i++){
            if (i==arr.size()-1){
                arr.set(i,0);
            }else{
                result = arr.get(i+1);
                arr.set(i, result);
            }
        }
        System.out.println(arr);
    }
}