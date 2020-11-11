public class Calculator{
    private double OperandOne;
    private double OperandTwo;
    private String Operation;
    private double result;

    public double getOperandOne(double OperandOne){
        return this.OperandOne;
    }

    public void setOperandOne(double OperandOne){
        // System.out.println("Operand One: " + OperandOne);
        this.OperandOne =  OperandOne;
        // System.out.println(this.OperandOne);
    }
    public double getOperandTwo(double OperandTwo){
        return this.OperandTwo;
    }

    public void setOperandTwo(double OperandTwo){
        // System.out.println("Operand Two: " + OperandTwo);
        this.OperandTwo =  OperandTwo;
        // System.out.println(this.OperandTwo);
    }
    
    public String getOperation(String Operation){
        return this.Operation;
    }

    public void setOperation(String Operation){
        this.Operation =  Operation;
    }

    public void performOperation(){
        if (this.Operation == "plus" || this.Operation == "+"){
            this.result = OperandOne + OperandTwo;

        }
        else if (this.Operation == "minus" || this.Operation == "-"){
            this.result = OperandOne - OperandTwo;
        }
        else{
            System.out.println("Wrong Info");
        }
    }

    public void getResults(){
        System.out.println(this.result);

    }



}