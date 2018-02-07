package inheritance;

public class Student extends Person {
    public static enum Status{freshman, sophomore, junior, senior};
    public Status status;

    public Student(String name , String address , String phonenumber , String emailaddress , Status status) {
        super(name , address , phonenumber , emailaddress);
        this.status = status;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tStatus: " + this.status;
    }
        }