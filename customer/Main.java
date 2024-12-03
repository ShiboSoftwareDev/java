import java.util.*;

 public class Main {
     public static void main(String[] args) {
         Name name = new Name("Ahmed", "Amir", "Alshaybani");
         Date birthDate = new Date(5, "April", 2003);
         Customer customer = new Customer(1001, name);
         customer.setBirthDate(birthDate);

         System.out.print(customer.toString());
         System.out.print(customer.getBirthDate().toString());
     }
 }
