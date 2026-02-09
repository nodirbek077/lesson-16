public class Person {
    protected Integer id;
    protected String name;
    protected String surname;
    protected Integer age;
    protected String birthDate;

    //bunga shunaqa qilib parameterli konstruktorni ham berib ketsak bo'ladi bu ham bir variant
    /*public Person(Integer id, String name, String surname, Integer age, String birthDate, Double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.salary = salary;
    }*/

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
