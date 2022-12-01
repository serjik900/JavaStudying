package Class14;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class HW2 {
    void evenOrOdd(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else if(num%2!=0){
            System.out.println(num+" is odd");
        }

    }

    public static void main(String[] args) {

        HW2 obj= new HW2();
        obj.evenOrOdd(4);
    }
}
