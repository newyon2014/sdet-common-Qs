package JDK8ToJDK15;

public class JDK8ToJDK15 {
    /*
          ************************************************************
          ************************* JDK 1.9 **************************
          ************************************************************

        // JShell
        *  jshell --enable-preview
        *  jshell> int x = 10
        *  jshell> System.out.println(x)

        //Factory method for immutable collections:
        * List<Integer> list = Arrays.asList(1,2,3,4,5) - Old Way
        * List<String> language =List.Of("java,"Python","Ruby,"JS")
        * lang.Stream().forEach(e -> System.out.println(e))


          ************************************************************
          ************************* JDK 1.10 *************************
          ************************************************************

         // Var - no data type specification
         * int x = 10 -> Old Way
         * String y = "Hello" -> Old Way
         * var x = 10 , System.out.println(x + 10) --> Prints 20
         * var x = "10" , System.out.println(x + 10) --> Prints 1010
         *
         * var h = new hashSet<String>(); --> h will be hash set reference
         * h.add("Interview").
         *
         * var list = new ArrayList<String>();
         * list.add("tom");


          ************************************************************
          ************************* JDK 1.12 *************************
          ************************************************************

          *  New Switch Case
          * Old Way
                  * String browser ="chrome";
                  * switch(browser){
                        case "chrome": System.out.println("This is chrome browser")
                            break:
                        case "ff": System.out.println("This is firefox browser")
                            break
                       default: System.out.println("No valid browser selected")
                             break

           *  New Way -
                  * var n =3;
                  * var m = switch(n){
                        case "1": System.out.println("One)
                            break:
                        case "1": System.out.println("Two")
                            break
                        case "3": System.out.println("Three")
                            break
                       default: System.out.println("Number not Found")
                             break


          ************************************************************
          ************************* JDK 1.13 *************************
          ************************************************************


          *  Multi Line String support
          * var response = """ {
                          "name","Tom",
                          "age","20",
                          "place","LA",
                      }""";

           * System.out.println(response") --> will print the following json format.
                                                No escape char needed
                          {
                          "name","Tom",
                          "age","20",
                          "place","LA",
                          }


          ************************************************************
          ************************* JDK 1.14 *************************
          ************************************************************

          * record key word ; Data classes ; No need to create a complete class
          * remove boilerplate code

          * Old Way
                    public class Employee {
                          public Employee (String name, int age , String place){
                              this.name = name;
                              this.age = age;
                              this.place = place;
                       }
          * New Way
                      record Employee(String name, int age , String place){}

          * Creating object of the class ( applies the same for both case - old and new )
                 Employee employee = new Employee("peter",24,"SFO");
                 System.out.println(employee.name)
                 System.out.println(employee.age)

          * Instance of
          * Old Way - You have to cast
                  * Object ob = new String ("Interview");
                  * if(ob instanceOf String){
                        System.out.println((String)ob.length())
                     }

           * New Way - No need to cast
           * Object ob = new String ("Interview");
                  * if(ob instanceOf String){
                        System.out.println(ob.length())
                     }


          ***********************************************************
          ************************* JDK 1.15 *************************
          ************************************************************


          *  Sealed Interface
          * public sealed interface Bank permits HSBCBank , ChaseBank {
          *           String name();
          *    }
          * public final class HSBCBank implements Bank {
                      public String name(){
                         returns "HSBC Bank is Created";
                       };
           }
           public final class ChaseBank implements Bank {
                      public String name(){
                         returns "Chase Bank is Created";
                       };
           }
           public final class hdfc implements Bank {
                      public String name(){
                         returns "Chase Bank is Created";
                       };
           } --> returns an error message - class is not allowed to extend sealed class : bank


     */
}
