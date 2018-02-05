package student;
public class TestStudent {
    public static void main(String[] args) {
        Address address = new Address("199/107" , "Bang Phil" , "Samutprakan");
        Faculty faculty = new Faculty("School of Information Technology" , "KMUTT");
        ClassStudent student = new ClassStudent(60130500109L , "Pinsajee" , address , faculty);
        address.setAddressname("199/107");
        address.setCity("Bang Phil");
        address.setProvince("Samutprakan");
        faculty.setFacultyname("School of information Technology");
        faculty.setUniversity("KMUTT");
        System.out.println("Address : " + address.getAddressname() + " " + address.getCity() + " " + address.getProvince());
        System.out.println("Faculty : " + faculty.getFacultyname() + " University : " + faculty.getUniversity());
    }
    
}
