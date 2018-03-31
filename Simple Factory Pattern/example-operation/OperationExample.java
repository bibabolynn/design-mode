public abstract  class Operation {
    private double numberA;
    private double numberB;
    public double getNumberA(){
        return this.numberA;
    }
    public void setNumberA(double a){
        this.numberA = a;
    }
    public double getNumberB(){
        return this.numberB;
    }
    public void setNumberB(double b){
        this.numberB = b;
    }

    public abstract double getResult() throws Exception;

}

public class OperationAdd extends Operation{
    @Override
    public double getResult(){
        return getNumberA() + getNumberB();
    }
}
public class OperationSub extends Operation{
    @Override
    public double getResult(){
        return getNumberA() - getNumberB();
    }
}


public class OperationMul extends Operation{
    @Override
    public double getResult(){
        return getNumberA() * getNumberB();
    }
}
public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if(getNumberB() == 0){
            throw new Exception("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}


public class OperationFactory {
    public static Operation createOperater(String operate){
        switch (operate){
            case "+":
                return new OperationAdd();
            case "-":
                return  new OperationSub();
            case "*":
                return  new OperationMul();
            case "/":
                return  new OperationDiv();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperater("+");
        oper.setNumberA(1);
        oper.setNumberA(2);
        try {
            double result = oper.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

