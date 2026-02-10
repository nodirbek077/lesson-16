import java.time.LocalDate;

public class Event {
    private Integer id;
    private String name;
    private Professor professor;
    private LocalDate createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Integer getProfessorId(){
        return professor.getId();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", professor=" + professor +
                ", createdDate=" + createdDate +
                '}';
    }
}
