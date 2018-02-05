package student;
public class ClassStudent {
    private long id;
    private String name;
    private Address address;
    private Faculty faculty;

    public ClassStudent() {
    }

    public ClassStudent(long id, String name, Address address, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "ClassStudent{" + "id=" + id + ", name=" + name + ", address=" + address + ", faculty=" + faculty + '}';
    }
    
}
