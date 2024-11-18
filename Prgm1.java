import java.util.*;
class Employee
{
    double gross;
    double it;
    double da;
    double bs;
    String empname;
    
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        empname=sc.next();
        System.out.println("Enter the IT imposed:");
        it=sc.nextDouble();
        System.out.println("Enter the DA:");
        da=sc.nextDouble();
        System.out.println("Enter the Basic salary:");
        bs=sc.nextDouble();
    }
    double calNetSal()
    {
        gross=bs+(da/100.0)*bs;
        System.out.println("Gross Salary : "+gross);
        double netsal=gross-(it/100.0)*gross;
        return netsal;
    }
}
class Prgm1
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.read();
        System.out.println("Net salary :"+e1.calNetSal());
    }
}