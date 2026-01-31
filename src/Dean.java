import java.time.LocalDate;

public class Dean extends Person {
    private String faculty;
    private LocalDate employedDate;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(LocalDate employedDate) {
        this.employedDate = employedDate;
    }

/*    @Override
    public String toString() {
        return "Dean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", salary=" + salary +
                ", employedDate=" + employedDate +
                '}';
    }*/
}
