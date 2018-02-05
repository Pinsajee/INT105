package student;

public class Faculty {
    private String facultyname;
    private String university;
    
    public Faculty() {
    }
    
    public Faculty(String facultyname, String university) {
        this.facultyname = facultyname;
        this.university = university;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Faculty :  " + facultyname + ", University : " + university;
    }
            
}
