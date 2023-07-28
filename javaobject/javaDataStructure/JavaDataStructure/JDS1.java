package JavaDataStructure;

public class JDS1 {
    
    public static void main(String[] args) {
    Arraylist  empDetails = new Arraylist();

         empDetails.add("sujith");
         empDetails.add("25");
         empDetails.add("Male");
         empDetails.add("Hyderabad");
         empDetails.add("India");


         empDetails.add("Gouthami");
         empDetails.add("26");
         empDetails.add("Female");
         empDetails.add("Hyderabad");
         empDetails.add("India");


         empDetails.add("sujith gouthami");
         empDetails.add("0");
         empDetails.add("Male and female");
         empDetails.add("Hyderabad");
         empDetails.add("India");
        
         for(int i=0;i<empDetails.size();i++)
         {
         System.out.println(empDetails.get(i));
         }
    }
}
