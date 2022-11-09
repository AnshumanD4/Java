import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input ");
        String name = scanner.next();

        System.out.println("Hello : " + name );

        System.out.println("Enter your age :" );
        byte age = scanner.nextByte();
        scanner.nextLine();


        System.out.println("Enter your city");
        String city = scanner.nextLine();

        System.out.println("Enter your salary");
        String salary = scanner.nextLine();
        System.out.println("Age = " + age);
        System.out.println("city = " + city);
        System.out.println("salary = " + salary);
        
        scanner.close();
    }

}
