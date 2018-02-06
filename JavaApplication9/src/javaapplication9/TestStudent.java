package student;
public class TestStudent {
    public static void main(String[] args) {
        Address address = new Address("199/107" , "Bang Phil" , "Samutprakan");
        Faculty faculty = new Faculty("School of Information Technology" , "KMUTT");
        Student student = new Student(60130500109L , "Pinsajee" , address , faculty);
//        address.setAddress("199/107");
//        address.setCity("Bang Phil");
//        address.setProvince("Samutprakan");
//        faculty.setFacultyname("School of Information Technology");
//        faculty.setUniversity("KMUTT");
        System.out.println("Address : " + address.getAddress()+ " " + address.getCity() + " " + address.getProvince());
        System.out.println("Faculty : " + faculty.getFacultyname() + " University : " + faculty.getUniversity());
    }
    
}
