public class Professor extends Person{
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /*@Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", subject=" + subject +
                ", salary=" + salary +
                '}';
    }*/
}
