public class Security extends Person{

    private String militaryRank;

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    @Override
    public String toString() {
        return "Security{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                ", militaryRank='" + militaryRank + '\'' +
                '}';
    }
}
