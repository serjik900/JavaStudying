package Constructor;

class Main {

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    public static String maxLength(String[] array) {
        int maxLength1 = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength1) {
                maxLength1 = s.length();
                longestString = s;
            }
        }
        return longestString;
    }}
