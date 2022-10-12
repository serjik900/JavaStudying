package Class16;

public class Teacher {
String name, lastName;
int experience;
String subject;
double salary;
static String school;

/*how to create a constructor?
*   1. Name of the constructor should be as classname;
*  2.no return types not even void;
* */
//    constructir below initialize instance variables
    Teacher(String fname, String lName){
        name=fname;
        lastName=lName;

    }
    void print(){
        System.out.println(name+" "+lastName);
    }

}
