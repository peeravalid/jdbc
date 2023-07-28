import java.util.ArrayList;

public class JDS2 
{
    public static void main(String[] args) {

        ArrayList<String> empName = new ArrayList<String>();
        ArrayList<Integer> empAge = new ArrayList<Integer>();
        ArrayList<Double> empSalary = new ArrayList<Double>();


        empName.add("John");
        empAge.add(25);
        empSalary.add(1234.44);

        empName.add("Tim");
        empAge.add(22);
        empSalary.add(1334.44);

        empName.add("Sam");
        empAge.add(23);
        empSalary.add(2234.44);

        empName.add("Rim");
        empAge.add(24);
        empSalary.add(3234.44);

        empName.add("Jim");
        empAge.add(25);
        empSalary.add(4234.44);

        // for(int i=0;i<empName.size();i++)
        // {
        //     System.out.println(empName.get(i));
        //     System.out.println(empAge.get(i));
        //     System.out.println(empSalary.get(i));
        // }

        for(String name:empName)
        {
            System.out.println(name);
        }

        for(Integer age:empAge)
        {
            System.out.println(age);
        }

        for(Double salary:empSalary)
        {
            System.out.println(salary);
        }
    }
}
