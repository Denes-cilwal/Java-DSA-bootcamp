

public class Introduction {
    public static void main(String[] args) {
          Employee emp1 ; // just declare object still in stack memory
           emp1 =  new Employee(); // in heap memory
            emp1.name =  "david";
            emp1.salary = 2345678.9f;
            emp1.roomNo =  23;

            // we are assigning value to class properties like this,
            // cant we allocate value to it during object creation.
            // new Employee() - yes we can do it in constructors function
            // here we are assigning value 1 by 1 , that's where constructor comes in assign at once and mandatory
            //   emp1.name =  "david";
            //            emp1.salary = 2345678.9f;
            //            emp1.roomNo =  23;


            System.out.println(emp1);
    }


}

class Employee {
    // instance variables - inside class outside method
    int roomNo;
    String name;
    float salary ;

}




