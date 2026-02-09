public class Main {
    public static void main(String[] args) {
        /*
           University
         */
        UniversityManager university = new UniversityManager("Mazgi");

        /*
           Subject
         */
        /*UniversityManager university1 = new UniversityManager("Mazgi");
        System.out.println(university1.getUniversityName());

        UniversityManager university2 = new UniversityManager("ABS");
        System.out.println(university2.getUniversityName());*/

        Subject subjectMath = university.createSubject("Math", 2);
        Subject subjectJava = university.createSubject("Java", 2);
        Subject subjectIT = university.createSubject("IT", 2);
        /*Subject subject = university.createSubject("IT", 2);
        System.out.println(subjectMath.getName());*/

        /*Subject subject = university.getSubjectById(subjectJava.getId());
        System.out.println(subject.getName());*/

//        Subject subject = university.getSubjectByName("Math2");
//        System.out.println(subjectJava);

        /*
         * Dean
         */
        /*Dean dean1 = university.createDean("Ali", "Aliyev", 18, "27.01.2002", "Math", 12.1);
        Dean dean2 = university.createDean("Vali", "Valiyev", 20, "20.06.2012", "IT", 10.1);
        Dean dean3 = university.createDean("Ali", "Aliyev", 18, "27.01.2002", "Mathe", 22.1);
*/
//        System.out.println(university.getDeanById(dean2.getId()));
//        System.out.println(university.getDeanEmployedDateById(dean1.getId()));

//        System.out.println(dean1);

        /*
          Security
         */
        /*Security security1 = university.createSecurity("Nodirbek", "Nurqulov", 29, "1996-06-21", 2500.0, "General");
        Security security2 = university.createSecurity("Lazizbek", "Nurqulov", 39, "1996-06-21", 2500.0, "General");
        Security security3 = university.createSecurity("Nodirbek", "Nurqulov", 49, "1996-06-21", 2500.0, "Mayyor");
//        System.out.println(security);

        Security[] securityArrayTemp = university.getSecurityListByMilitaryRank("General");
        for (Security security : securityArrayTemp) {
            if (security != null) {
                System.out.println(security);
            }
        }*/

        /*
         * Professor
         */
        Professor professor1 = university.createProfessor("Alibek", "Aliyev", 35, "21.01.1996", subjectJava.getId(), 3400.0);
        Professor professor2 = university.createProfessor("Nodirbek", "Nodirbek", 38, "21.06.1996", subjectJava.getId(), 5000.0);
        Professor professor3 = university.createProfessor("Malika", "Sulaymonova", 40, "01.09.2000", subjectMath.getId(), 1400.0);

        /*System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(professor3);

        Professor professorById = university.getProfessorById(professor1.getId());
        System.out.println(professorById);

        Professor professorByNameAndBySurname = university.getProfessorByNameAndBySurname("Alibek", "Aliyev");
        System.out.println(professorByNameAndBySurname);
*/
        Professor[] professorListBySubjectId = university.getProfessorListBySubjectId(subjectJava.getId());
        for (Professor professor : professorListBySubjectId) {
            if (professor != null){
                System.out.println(professor);
            }
        }

        /*
           Student
         */
        Student student1 = university.createStudent("Nodirbek", "Nurqulov", 23, "21.06.1996", 4);
        Student student2 = university.createStudent("Lazizbek", "Nurqulov", 27, "09.11.1998", 2);
        Student student3 = university.createStudent("Xasan", "Nurqulov", 20, "27.10.2000", 1);

        System.out.println(student1.getName());
        System.out.println(student2);
        System.out.println(student3);
    }
}
