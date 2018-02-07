package inheritance;
public class Employee extends Person {
    protected String office;
    protected double salary;

    public Employee() {
    }
    
    
    public Employee(String name , String address , String phonenumber , String emailaddress , String office, double salary) {
        super(name , address , phonenumber , emailaddress);
        this.office = office;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tOffice: " + this.office + "\n\tSalary: " + this.salary;
    }
    
}
