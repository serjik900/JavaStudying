package Class21;

public class Car {
void start(){
    System.out.println("Use the key to start the car");
}
void stop(){
    System.out.println("Use brakes to stop the car");
}
void park(){
    System.out.println("Park me manually");
}
}
class BMW extends Car{
    void start(){
        System.out.println("Use push button to start me");
    }
    void stop(){
        super.stop();
        System.out.println("Use auto-braking");
    }
}
class Toyota extends Car{
    void start(){
        System.out.println("push me to start");
    }
}
class Tesla{

    void start(){
        System.out.println("Use the APP to start");
    }
    void stop(){
        System.out.println("Use AI and AutoBraking to stop mew");
    }
    void park(){
        System.out.println("I can auto park myself");
    }

}
