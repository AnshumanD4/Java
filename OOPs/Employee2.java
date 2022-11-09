package OOPs;

public class Employee2 {
    int empId;
    String name;
    double salary;
    String department; 
    public void showemp(){
        //this = refers to current object
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
    public void takeinput(int empId, String name, double salary, String department){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public static void main(String[] args) {
        Employee2 Ram = new Employee2();
        Employee2 shyam = new Employee2();

        Ram.takeinput(101, " Anshuman ", 450000  , "CSE");
        shyam.takeinput(102, " Diwakar ", 450000  , "CSE");
        
        Ram.showemp();
        shyam.showemp();

    }
}
