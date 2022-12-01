package class13;

public class Recap2 {
    public static void main(String[] args) {
        String textFromApp=" Enroll today   ";
        String textFromUserStory= "Enroll today";
        if(textFromApp.trim().equals(textFromUserStory)) {//trimming the spaces
            System.out.println("Text is matching");
        }else{
            System.out.println("Text doesn`t match");
        }
    }
}
