public class UniversityManager {
    private String universityName;
    public Subject[] subjectArray = new Subject[10];
    public int subjectIndex = 0;
    public int generalId = 1;

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
            if (s != null && s.getId() == id) {
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
}
