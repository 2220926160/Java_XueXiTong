public class Subject {
    private String subjectID;
    private String subjectName;

    public Subject() {
    }

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject [subjectID=" + subjectID + ", subjectName=" + subjectName + "]";
    }

}
