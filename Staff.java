package inheritance;
public class Staff extends Employee {
    private String titel;
    
    
    public Staff(String name, String address, String phonenumber, String emailaddress, String office, double salary , String titel) {
        super(name, address, phonenumber, emailaddress, office, salary);
        this.titel = titel;
    }
    @Override
    public String toString() {
        return super.toString() + "title: " + this.titel;
    }
}
