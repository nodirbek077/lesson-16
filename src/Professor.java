public class Professor extends Employee{
    private Subject subject;

    //shu yerda constructorni ham ishlatrib ketishimiz mumkin agar parentda parameterli konstruktor qo'shilgan bo'lsa
    /*public Professor(Integer id, String name, String surname, Integer age, String birthDate, Double salary, Subject subject) {
        super(id, name, surname, age, birthDate, salary);
        this.subject = subject;
    }*/

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
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
    }
}
