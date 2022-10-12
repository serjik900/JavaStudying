package class18;
class Main {
	 static int countA(String s ){

            int count=0;
            char aChar='a';


            for (int i = 0; i < s.length(); i++) {
        if (s.toLowerCase().charAt(i) == aChar) {
        count++;
        }}

        return count;
        }

//test case below (dont change):
public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
        }