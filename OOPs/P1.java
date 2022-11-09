package OOPs;
public class P1 {
    int EmpId;
    // string Name;
    int salary;
    // strict DepId;

public static void main(String[] args) {
    Employee Ram = new Employee();
    System.out.println(Ram);

    Ram.EmpId = 101;
    Ram.salary = 45000;

    System.out.println(Ram.EmpId);
    System.out.println(Ram.salary);

}
}