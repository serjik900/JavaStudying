public class Createmethod{

    void printFiboSeries(int size){

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
        }
    }

    public static void main(String[] args) {
        Createmethod obj=new Createmethod(); // Creating an object of the Math class
        obj.printFiboSeries(5);
        obj.printFiboSeries(10);
    }
}