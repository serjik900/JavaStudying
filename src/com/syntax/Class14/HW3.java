package Class14;

public class HW3 {
    void palindrome(String word){
        StringBuilder temp= new StringBuilder(word);
temp.reverse();
String word1= temp.toString();

      if(word.equals(word1)){
          System.out.println(word1+ " is palindrome");
      }else{
          System.out.println(word+" is not palindrome");
      }
    }

    public static void main(String[] args) {
        HW3 obj=new HW3();
        obj.palindrome("dad");

    }
}
