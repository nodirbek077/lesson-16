public class Student extends Person {
    private Integer level;

    private Subject[] subjectArray = new Subject[10];
    private int subjectIndex = 0;

    public void addSubject(Subject subject) {
        if (subjectArray.length == subjectIndex) {
            Subject[] newArr = new Subject[subjectArray.length * 2];
            for (int i = 0; i < subjectArray.length; i++) {
                newArr[i] = subjectArray[i];
            }
            subjectArray = newArr;
        }
        subjectArray[subjectIndex++] = subject;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Subject[] getSubjectArray() {
        return subjectArray;
    }

    public void setSubjectArray(Subject[] subjectArray) {
        this.subjectArray = subjectArray;
    }

    public int getSubjectIndex() {
        return subjectIndex;
    }

    public void setSubjectIndex(int subjectIndex) {
        this.subjectIndex = subjectIndex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
