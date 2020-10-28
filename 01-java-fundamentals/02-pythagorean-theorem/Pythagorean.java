import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double dlegA = legA;
        double dlegB = legB;
        double c = Math.sqrt((dlegA*dlegA) + (dlegB*dlegB));
        return c;
    }
}
