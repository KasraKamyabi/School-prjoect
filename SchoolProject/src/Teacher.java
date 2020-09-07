public class Teacher {
    private String Name;
    private String Course;
    private String Section;
    public Teacher (String Name, String Age, String Course , String Section )

    {
        this.Name = Name;
        this.Course = Course;
        this.Section = Section;

    }

    public String getName() {
        return Name;
    }

    public String getCourse() {
        return Course;
    }

    public String getSection() {
        return Section;
    }
    public String toString() {
        return "name: " + Name  +
                ", course: " + Course +
                ", section: " + Section;
    }
}
