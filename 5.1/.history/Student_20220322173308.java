public class Student {
    private String name;
    private String id;
    private Integer age;

    public Student() {
        name = null;
        idSum++;
        id =  Integer.toString(idFirst + idSum);
        age = 18;
    }

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
}
