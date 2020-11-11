public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cc = new Calculator();
        cc.setOperandOne(10.5);
        cc.setOperation("+");
        cc.setOperandTwo(5.2);
        cc.performOperation();
        cc.getResults();
    }
}
