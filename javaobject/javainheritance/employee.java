
import java.util.Scanner;

public class employee
{
    private int empId;
    private String empName;
    private int empAge;
    private Address empAdd = new Address();



    // Declare object of scanner class
    Scanner sin = new Scanner(System.in);

    // write code to accept employee details
    public void acceptEmpDetails()
    {
        System.out.println("Accepting employee details");
        System.out.println("********************************");
        
        System.out.println("Enter employee Id");
        empId = sin.nextInt();

        System.out.println("Enter employee Name");
        empName = sin.next();

        System.out.println("Enter employee Age");
        empAge = sin.nextInt();

        System.out.println("Enter employee address");
        
        System.out.println("addressId");
        empAdd.addId = sin.nextInt();

        System.out.println("Street No");
        empAdd.streetNo = sin.next();

        System.out.println("City");
        empAdd.City = sin.next();

        System.out.println("State");
        empAdd.state = sin.next();

        System.out.println("Country");
        Address.Country = sin.next();

        System.out.println("Zip Code");
        empAdd.zipcode = sin.next();

        System.out.println("********************************");

    }

    // write code to display employee details
    public void displayEmpDetails()
    {

        System.out.println("Display employee details");
        System.out.println("********************************");
        System.out.println("Employee Id " + empId);
        System.out.println("Employee Name " + empName);
        System.out.println("Employee Age " + empAge);
        System.out.println("Employee Address ");
        System.out.println("Address Id " + empAdd.addId);
        System.out.println("Street No " + empAdd.streetNo);
        System.out.println("City " + empAdd.City);
        System.out.println("State " + empAdd.state);
        System.out.println("Country " + empAdd.Country);
        System.out.println("ZipCode " + empAdd.zipcode);


    }
}
