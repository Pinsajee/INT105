package javaapplication18;
public class Student {
    protected long stdID;
    protected String stdName;

    public Student() {
    }

    public Student(long stdID, String stdName) {
        this.stdID = stdID;
        this.stdName = stdName;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdName=" + stdName + '}';
    }
    
    
}
