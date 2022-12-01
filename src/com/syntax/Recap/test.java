package Recap;

class RevEachWordInSentense {

    public static void main(String args[]) {
       String[] sentence="Hello my name is Sergey".split(" ");

       String reverseString="";


        for(int i=0; i<sentence.length;i++){
            String word=sentence[i];

            String reverseWord="";

        for (int j=word.length()-1;j>=0;j--){
reverseWord+=word.charAt(j);
        }

reverseString+=reverseWord+" ";


    }
        System.out.println(reverseString);
}}