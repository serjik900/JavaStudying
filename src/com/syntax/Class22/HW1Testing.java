package Class22;

public class HW1Testing {
    public static void main(String[] args) {
       Student[] students={new CollegeStudent(), new SyntaxStudent(),new SchoolStudent()};
       for(Student s:students){
           s.studying();
       }
SchoolStudent ad=new SchoolStudent();
       ad.play();
    }
}
