package inheritance;
public class Person { // Parent Class
    protected String name;
    protected String address;
    protected String phonenumber;
    protected String emailaddress;

    public Person() {
    }
    
    public Person(String name, String address, String phonenumber, String emailaddress) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
    
    public String genEmail() {
        return this.name.toLowerCase() + "@sit.kmutt.ac.th";
    }
    
    
    @Override
    public String toString() {
        return this.name + "\n\tAddress: " + this.address  + "\n\tPhonenumber: " + this.phonenumber 
                + "\n\tE-mail address: " + this.emailaddress;
    }
    
    
}
