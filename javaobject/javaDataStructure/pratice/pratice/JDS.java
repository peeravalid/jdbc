package pratice;

import java.util.ArrayList;

public class JDS {
    public static void main(String[] args){

        ArrayList<String> empname = new ArrayList<String>();
        ArrayList<Integer> empage = new ArrayList<Integer>();
        ArrayList<Double> empsalary = new ArrayList<Double>();

        empname.add("deepu") ;
        empage.add(24) ;
        empsalary.add(50.00);

        empname.add("vignesh") ;
        empage.add(25) ;
        empsalary.add(55.00);

        empname.add("jamal") ;
        empage.add(44) ;
        empsalary.add(70.00);

        for(String name:empname)
        {
            System.out.println("Name");
        }

         for(Integer age:empage)
        {
            System.out.println("age");
        }

        for(Double salary:empsalary) {
            System.out.println("Salary");
        }


    }
}
