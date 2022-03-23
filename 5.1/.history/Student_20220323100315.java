public class Student {
    private String name;
    private String id;
    public Student() {
        name = null;
        id = "-1";
    }

    public Student(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void clone(Student student) {
        this.name = student.name;
        this.id = student.getId();
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    
}
