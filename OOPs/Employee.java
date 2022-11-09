package OOPs;
public class Employee {
    int EmpId;
    // string Name;
    int salary;
    // strict DepId;

public static void main(String[] args) {
    Employee Ram = new Employee();
    Employee shyam = new Employee();

    Ram.EmpId = 101;
    Ram.salary = 45000;
    shyam.EmpId = 102;
    shyam.salary = 55000;
// will print the hashcode of the object
    System.out.println(Ram);
    System.out.println(shyam);
    System.out.println(Ram.EmpId);
    System.out.println(Ram.salary);
    System.out.println(shyam.EmpId);
    System.out.println(shyam.salary);

}
}