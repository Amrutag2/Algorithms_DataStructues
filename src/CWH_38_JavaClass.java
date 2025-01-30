

class Employee{
    int id;
    int salary;
  String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and My name is "+name);
    }
    public int get_salary(){
        return salary;
    }

}
public class CWH_38_JavaClass {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee(); //Instantiating a new employee Object
        Employee mark = new Employee(); //Instantiating a new employee Object
        //setting sttributes
        harry.id = 23;
        harry.name = "happy";
        harry.salary = 34;

        mark.id = 28;
        mark.name = "MMJ";
        mark.salary=98;

        //printing the attributtes
        harry.printDetails();
        mark.printDetails();

        int salary = harry.get_salary();
        System.out.println(salary);


    }

}
