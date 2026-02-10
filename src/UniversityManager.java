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

    //Professor
    private Professor[] professorArray = new Professor[10];
    private int professorIndex = 0;

    //Student
    private Student[] studentArray = new Student[10];
    private int studentIndex = 0;

    //Exam
    private Exam[] examList = new Exam[10];
    private int examIndex = 0;

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

    public Subject getSubjectById(Integer id) {
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

    /*
        Professor
     */

    public Professor createProfessor(String name, String surname, Integer age, String birthDate, Integer subjectId, Double salary) {
        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found!");
            return null;
        }

//        Professor professor = new Professor(generalId++,name,surname,age, birthDate,salary,subject);
        Professor professor = new Professor();
        professor.setId(generalId++);
        professor.setName(name);
        professor.setSurname(surname);
        professor.setAge(age);
        professor.setBirthDate(birthDate);
        professor.setSubject(subject);
        professor.setSalary(salary);

        if (professorArray.length == professorIndex) {
            Professor[] newArray = new Professor[professorArray.length * 2];
            for (int i = 0; i < professorArray.length; i++) {
                newArray[i] = professorArray[i];
            }
            professorArray = newArray;
        }
        professorArray[professorIndex++] = professor;
        return professor;
    }

    public Professor getProfessorById(Integer id) {
        for (Professor professor : professorArray) {
            if (professor != null && professor.getId().equals(id)) {
                return professor;
            }
        }
        return null;
    }

    public Professor getProfessorByNameAndBySurname(String name, String surname) {
        for (Professor professor : professorArray) {
            if (professor != null && professor.getName().equals(name) && professor.getSurname().equals(surname)) {
                return professor;
            }
        }
        return null;
    }

    public Professor[] getProfessorListBySubjectId(Integer subjectId) {

        Professor[] tempArray = new Professor[professorIndex++];
        int tempIndex = 0;
        for (Professor professor : professorArray) {
            if (professor != null && professor.getSubject().getId().equals(subjectId)) {
                tempArray[tempIndex++] = professor;
            }
        }

        return tempArray;
    }

    /*
     * Student
     */
    public Student createStudent(String name, String surname, Integer age, String birthDate, Integer level) {
        Student student = new Student();
        student.setId(generalId++);
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setBirthDate(birthDate);
        student.setLevel(level);

        if (studentArray.length == studentIndex) {
            Student[] newArr = new Student[studentArray.length * 2];
            for (int i = 0; i < studentArray.length; i++) {
                newArr[i] = studentArray[i];
            }
            studentArray = newArr;
        }
        studentArray[studentIndex++] = student;
        return student;
    }

    public Student getStudentById(Integer id) {
        for (Student student : studentArray) {
            if (student != null && student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Student[] getStudentListByLevel(Integer level) {
        Student[] tempArray = new Student[studentIndex];
        int tempIndex = 0;
        for (Student student : studentArray) {
            if (student != null && student.getLevel().equals(level)) {
                tempArray[tempIndex++] = student;
            }
        }
        return tempArray;
    }

    public Student addSubjectToStudent(Integer studentId, Integer subjectId) {
        Student student = getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found");
            return null;
        }

        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found");
            return null;
        }

        student.addSubject(subject);
        subject.addStudent(student);

        return student;
    }

    public Student[] getStudentListBySubjectId(Integer subjectId) {
        //first way
        /*Student[] tempArr = new Student[10];
        int tempIndex = 0;
        for (Student student : studentArray) {
            if (student == null)
                continue;
            for (Subject subject : student.getSubjectArray()) {
                if (subject != null && subject.getId().equals(subjectId)) {
                    tempArr[tempIndex++] = student;
                }
            }
        }
        return tempArr;
*/
        //solve this method second way
        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found. Mazgi");
            return new Student[0];
        }

        return subject.getStudentArray();
    }

    /*
     * Exam
     */
    public Exam createExam(Integer studentId, Integer subjectId, Integer grade) {
        Student student = getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found");
            return null;
        }

        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found");
            return null;
        }

        Exam exam = new Exam();
        exam.setId(generalId++);
        exam.setStudent(student);
        exam.setSubject(subject);
        exam.setGrade(grade);
        exam.setCreatedDate(LocalDate.now());

        if (examList.length == examIndex) {
            Exam[] newArray = new Exam[examList.length * 2];
            for (int i = 0; i < examList.length; i++) {
                newArray[i] = examList[i];
            }
            examList = newArray;
        }
        examList[examIndex++] = exam;
        return exam;
    }

    public Exam[] getStudentExamList(Integer studentId) {
        Exam[] tempArr = new Exam[10];
        int tempIndex = 0;
        for (int i = 0; i < examList.length; i++) {
            if (examList[i] != null && examList[i].getStudentId().equals(studentId)) {

                if (examList.length == examIndex) {
                    Exam[] newArray = new Exam[examList.length * 2];
                    for (int j = 0; j < examList.length; j++) {
                        newArray[j] = examList[j];
                    }
                    examList = newArray;
                }
                tempArr[tempIndex++] = examList[i];
            }
        }
        return tempArr;
    }

    public Student[] getStudentListByExamSubjectId(Integer subjectId) {
        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found.");
            return new Student[0];
        }

        Student[] studentList = getStudentListBySubjectId(subjectId);
        for (Student student : studentList) {
            if (student != null) {
                Exam[] studentExamList = getStudentExamList(student.getId());
                return studentExamList != null ? studentList : null;
            }
        }

        return null;
    }

    public Exam[] getStudentListByExamGrate(Integer subjectId, Integer grade) {
        Student[] tempStudent = new Student[10];
        int tempArray = 0;

        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Subject not found.");
            return null;
        }

        Student[] studentList = getStudentListBySubjectId(subjectId);
        for (Student student : studentList) {
            if (student == null) {
                System.out.println("Student not found.");
                break;
            }

            Exam[] studentExamList = getStudentExamList(student.getId());
            for (Exam exam : studentExamList) {
                if (exam == null) {
                    System.out.println("Exam not found.");
                    break;
                }

                if (exam.getGrade().equals(grade)) {
                    return examList;
                }
            }
        }

        return null;
    }
}