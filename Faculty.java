package inheritance;
public class Faculty extends Employee {
    private String officeHourse;
    private String rank;
    
    
    public Faculty(String name, String address, String phonenumber, String emailaddress, String office, double salary , String officeHourse, String rank) {
        super(name, address, phonenumber, emailaddress, office, salary);
        this.officeHourse = officeHourse;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t"  + "OfficeHourse " + officeHourse + "\n\t"  + "Rank: " + rank;
    }
    
    
}
