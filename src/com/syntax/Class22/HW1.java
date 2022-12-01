package Class22;

public class HW1 {
}
class Student{
    void studying(){
        System.out.println("You have to study to be smart");
    }

}
class SyntaxStudent extends Student{
@Override
    void studying(){
    System.out.println("You have to practice to be smart");
}
}
class CollegeStudent extends Student{
@Override
    void studying(){
    System.out.println("You have to read books");
}
}
class SchoolStudent extends Student{
@Override
    void studying(){
    System.out.println("You have to be awake at the class");
}
void play(){
    System.out.println("You can play PS5 after studying");
}
}