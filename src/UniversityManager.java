import java.security.PublicKey;
import java.time.LocalDate;

public class UniversityManager {
    private String universityName;
    //subject
    private Subject[] subjectArray = new Subject[10];
    private int subjectIndex = 0;

    private int generalId = 1;

    //dean
    private Dean[] deanArray = new Dean[10];
    private int deanIndex = 0;

    //Security
    private Security[] securityArray = new Security[10];
    private int securityIndex = 0;

    public UniversityManager(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    /*
     * Subject
     */
    public Subject createSubject(String name, int semester) {
        Subject subject = new Subject();
        subject.setId(generalId++);
        subject.setName(name);
        subject.setSemester(semester);

        Subject exists = getSubjectByName(name);
        if (exists != null) {
            System.out.println("Subject name exists!");
            return null;
        }

        if (subjectArray.length == subjectIndex) {
            Subject[] newArray = new Subject[subjectArray.length * 2];
            for (int i = 0; i < subjectArray.length; i++) {
                newArray[i] = subjectArray[i];
            }
            subjectArray = newArray;
        }
        subjectArray[subjectIndex++] = subject;
        return subject;
    }

    public Subject getSubjectById(int id) {
        for (Subject s : subjectArray) {
            if (s != null && s.getId().equals(id)) {
                return s;
            }
        }

        return null;
    }

    public Subject getSubjectByName(String name) {
        for (Subject subject : subjectArray) {
            if (subject != null && subject.getName().equals(name)) {
                return subject;
            }
        }
        return null;
    }

    /*
     * Dean
     */
    public Dean createDean(String name, String surname, Integer age, String birthDate, String faculty, Double salary) {
        //check Dean exists
        Dean exists = getDeanByFaculty(faculty);
        if (exists != null) {
            System.out.println("Dean from this faculty exists");
            return null;
        }

        Dean dean = new Dean();
        dean.setId(generalId++);
        dean.setName(name);
        dean.setSurname(surname);
        dean.setAge(age);
        dean.setBirthDate(birthDate);
        dean.setFaculty(faculty);
        dean.setSalary(salary);
        dean.setEmployedDate(LocalDate.now());

        if (deanArray.length == deanIndex) {
            Dean[] newArray = new Dean[deanArray.length * 2];
            for (int i = 0; i < deanArray.length; i++) {
                newArray[i] = deanArray[i];
            }
            deanArray = newArray;
        }
        deanArray[deanIndex++] = dean;
        return dean;
    }

    public Dean getDeanByFaculty(String faculty) {
        for (Dean dean : deanArray) {
            if (dean != null && dean.getFaculty().equals(faculty)) {
                return dean;
            }
        }
        return null;
    }

    public Dean getDeanById(Integer id) {
        for (Dean dean : deanArray) {
            if (dean != null && dean.getId().equals(id)) {
                return dean;
            }
        }
        return null;
    }

    public LocalDate getDeanEmployedDateById(Integer id) {
        for (Dean dean : deanArray) {
            if (dean != null && dean.getId().equals(id)) {
                return dean.getEmployedDate();
            }
        }
        return null;
    }

    /*
       Security
     */
    public Security createSecurity(String name, String surname, Integer age, String birthDate, Double salary, String militaryRank) {
        Security security = new Security();
        security.setId(generalId++);
        security.setName(name);
        security.setSurname(surname);
        security.setAge(age);
        security.setBirthDate(birthDate);
        security.setSalary(salary);
        security.setMilitaryRank(militaryRank);

        if (securityArray.length == securityIndex) {
            Security[] newArray = new Security[securityArray.length * 2];
            for (int i = 0; i < securityArray.length; i++) {
                newArray[i] = securityArray[i];
            }
            securityArray = newArray;
        }
        securityArray[securityIndex++] = security;
        return security;
    }

    public Security[] getSecurityListByMilitaryRank(String militaryRank) {

        Security[] tempArray = new Security[securityIndex];
        int index = 0;
        for (Security security : securityArray) {
            if (security != null && security.getMilitaryRank().contains(militaryRank)) {
//                System.out.println(security);
                tempArray[index++] = security;

            }
        }

        return tempArray;
    }
}
