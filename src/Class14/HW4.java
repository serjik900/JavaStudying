package Class14;

import java.util.Scanner;

public class HW4 {
    void language(String language){

        if(language.equalsIgnoreCase("english")){
            System.out.println("Hello!");
        }else if(language.equalsIgnoreCase("spanish")){
            System.out.println("Hola!");
        }else if(language.equalsIgnoreCase("russian")){
            System.out.println("Привет!");
        }else if(language.equalsIgnoreCase("Hindi")){
            System.out.println("अरे");
        }else if(language.equalsIgnoreCase("arabic")){
            System.out.println("يا");
        }else if(language.equalsIgnoreCase("serbian")){
            System.out.println("Хеј");
        }else if(language.equalsIgnoreCase("swahili")){
            System.out.println("Habari");

        }
    }
    public static void main(String[] args) {
        HW4 obj=new HW4();
        obj.language("serBian");
    }
}
