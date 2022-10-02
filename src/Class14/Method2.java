package Class14;

public class Method2 {
    void printManyTimes(int times){
        for (int i=0; i<times;i++){
            System.out.println("Hello java");
        }
    }
void printCustomWordManyTimes (String word,int times){
    for (int i=0; i<times;i++){
        System.out.println(word);
}}
    public static void main(String [] args) {
        Method2 md=new Method2();
        //md.printManyTimes(20);
        md.printCustomWordManyTimes("Syntax easy",3);
    }
}
