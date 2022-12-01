package class13;

public class Recap {
    public static void main(String[] args) {
        String str="hello";
        //toUpperCase
        str.toUpperCase();
        System.out.println(str);//hello
        System.out.println("------------");
        str=str.toUpperCase();
        System.out.println(str);//HELLO4

        //length()->gives the size of the string
        str.length();
        System.out.println(str);
//charAt()->Returns the char value at specified index
        char letter=str.charAt(2);
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(letter);
        //indexof()-Returns the index within this strung of the first
        int index=str.indexOf(lastCharacter);
        System.out.println(str.indexOf('a'));//-1
      //isEmpty()
      boolean empty=str.isEmpty();
        System.out.println(empty);
        //trim() remote spaces before and after string

    }
}
