package asign1;
/*         Exp No 3
        Write a program that would print the information
        (name, year of joining, salary, address) of three
        employees by creating a class named 'Employee'.
        The output should be as follows
        Name    Year of Joining  Address
        ---------------------------------
        Robert  2001 			 Kurla
        Mahesh  2002			 Bandra                           */


class Employee {
    String name;
    int year;
    int salary;
    String address;
}
public class useemployee{
    public static void main(String[] args){

        Employee a = new Employee();
        Employee b  = new Employee();
        Employee c = new Employee();

        a.name = "granel";
        a.year = 2001;
        a.address = "Kurla";

        b.name = "kaushik";
        b.year = 2002;
        b.address = "Bandra";

        c.name = "vendra";
        c.year = 2024;
        c.address = "Panvel";

        System.out.println(" Name    Year of Joining  Address");
        for (int i = 0 ;i<45; i++){
            System.out.print("-");
        }
        System.out.println(" ");
        System.out.println(" "+a.name+"      "+a.year+"          "+a.address);
        System.out.println(" "+b.name+"      "+b.year+"          "+b.address);
        System.out.println(" "+c.name+"      "+c.year+"          "+c.address);

    }
}