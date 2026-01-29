public class Main {
    public static void main(String[] args) {
        UniversityManager university = new UniversityManager("Mazgi");

        /*UniversityManager university1 = new UniversityManager("Mazgi");
        System.out.println(university1.getUniversityName());

        UniversityManager university2 = new UniversityManager("ABS");
        System.out.println(university2.getUniversityName());*/

        /*Subject subjectMath = university.createSubject("Math", 2);
        Subject subjectJava = university.createSubject("Java", 2);
        Subject subjectIT = university.createSubject("IT", 2);
*/
        /*Subject subject = university.createSubject("IT", 2);
        System.out.println(subjectMath.getName());*/

        /*Subject subject = university.getSubjectById(subjectJava.getId());
        System.out.println(subject.getName());*/

        /*Subject subject = university.getSubjectByName("Math2");
        System.out.println(subject);*/

        /*
         * Dean
         */
        Dean dean1 = university.createDean("Ali", "Aliyev", 18, "27.01.2002", "Math", 12.1);
        Dean dean2 = university.createDean("Vali", "Valiyev", 20, "20.06.2012", "IT", 10.1);
        Dean dean3 = university.createDean("Ali", "Aliyev", 18, "27.01.2002", "Mathe", 22.1);

//        System.out.println(university.getDeanById(dean1.getId()));
        System.out.println(university.getDeanEmployedDateById(dean1.getId()));
    }
}
