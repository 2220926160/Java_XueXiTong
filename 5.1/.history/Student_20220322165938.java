public class Student {
    private final int idFirst = 0; // start id
    private static Integer idSum = 0; // number of people
    private String name;
    private String id;
    private int age;

    public Student() {
        name = null;
        idSum++;
        id =  toString(idFirst + idSum);
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

    public static int getIdFirst() {
        return idFirst;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
    }

}
