public abstract class Operation{   
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
  
  public abstract double getResult();
  
}
