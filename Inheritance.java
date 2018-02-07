package inheritance;
public class Inheritance {
    public static void main(String[] args) {
//        Student student = new Student("Pinsajee" , "199/107 M.7 Soi SAO Bangchalong Subdistrict Bangchalong District Bangphli Samutprakarn 10540" , "0895014348" , "pinsajee.edu@mail.kmutt.ac.th" , Student.Status.freshman);
//        Person person = new Person("Pinsajee" , "199/107 M.7 Soi SAO Bangchalong Subdistrict Bangchalong District Bangphli Samutprakarn 10540" , "0895014348" , "pinsajee.edu@mail.kmutt.ac.th");
//        System.out.println(student);
//        System.out.println("\n" + "Generated Email: " + student.genEmail());
//        System.out.println(person);
//        System.out.println("\n" + "Generated Email: " + person.genEmail());
          
          Faculty faculty = new Faculty("Pinsajee" , "KMUTT" , "0895014348" , "pinsajee.edu@mail.kmutt.ac.th" , "3th floor SIT" , 100000 , "8:00-16:00" , "Profressor");
          System.out.println(faculty);
          System.out.println("\t\n" + faculty.genEmail());
    
    }
    
    
    
}
