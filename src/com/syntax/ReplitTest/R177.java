package ReplitTest;

public class R177 {
}
class Main1 implements Functions {
    public void display(double result){
        System.out.println("Result is ::: "+result);
    }
    public double adding(double firstNumber, double secondNumber){
        double result=firstNumber+secondNumber;
        return result;
    }
    public double substracting(double firstNumber, double secondNumber){
        double result=firstNumber-secondNumber;
        return result;
    }
    public double multiply(double firstNumber, double secondNumber){
        double result=firstNumber*secondNumber;
        return result;
    }
    public double dividing(double firstNumber, double secondNumber){
        double result=firstNumber/secondNumber;
        return result;
    }
    public static void main(String[]args){
        Functions obj=new Main1();
        double firstNumber=100;
        double secondNumber=20;
        obj.display(obj.adding(firstNumber,secondNumber));
        obj.display(obj.substracting(firstNumber,secondNumber));
        obj.display(obj.multiply(firstNumber,secondNumber));
        obj.display(obj.dividing(firstNumber,secondNumber));
    }
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding(double firstNumber, double secondNumber);
    double substracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}
