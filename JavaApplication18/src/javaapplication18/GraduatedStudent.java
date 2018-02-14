package javaapplication18;
public class GraduatedStudent extends Student {
    private String thesis;
    private String underGradeGPAX;

    public GraduatedStudent() {
    }

    public GraduatedStudent(String thesis, String underGradeGPAX) {
        this.thesis = thesis;
        this.underGradeGPAX = underGradeGPAX;
    }

    public GraduatedStudent(String thesis, String underGradeGPAX, long stdID, String stdName) {
        super(stdID, stdName);
        this.thesis = thesis;
        this.underGradeGPAX = underGradeGPAX;
    }

    @Override
    public String toString() {
        return super.toString() + "GraduatedStudent{" + "thesis=" + thesis + ", underGradeGPAX=" + underGradeGPAX + '}';
    }
    
    
}
