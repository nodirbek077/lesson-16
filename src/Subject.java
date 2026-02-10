public class Subject {
    private Integer id;
    private String name;
    private int semester;

    private Student[] studentArray = new Student[10];
    private int studentIndex = 0;

    public void addStudent(Student student) {
        if (studentArray.length == studentIndex) {
            Student[] newArr = new Student[studentArray.length * 2];
            for (int i = 0; i < studentArray.length; i++) {
                newArr[i] = studentArray[i];
            }
            studentArray = newArr;
        }

        studentArray[studentIndex++] = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }
}
