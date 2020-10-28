public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fz = new FizzBuzz();
        for(int i=0; i<50; i++){
            String result = fz.fizzBuzz(i);
            System.out.println(result);
        }

    }
}
