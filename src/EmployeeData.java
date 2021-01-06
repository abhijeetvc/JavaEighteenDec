import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeData {

    void showEmployeeData(){
        List<Employee> list=new ArrayList();

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<2;i++){
            System.out.println("Enter Employee Id: ");
            int id=sc.nextInt();
            System.out.println("Enter Employee Name: ");
            String name=sc.next();
            System.out.println("Enter Employee City: ");
            String city=sc.next();
            Employee e=new Employee(id,name,city);
            list.add(e);
        }

        System.out.println("Employee Data: "+list);
    }
    public static void main(String[] args) {
       EmployeeData ed=new EmployeeData();
       ed.showEmployeeData();

    }
}

class Employee{
    int id;
    String name;
    String city;
    public Employee(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}