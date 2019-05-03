public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    Course(String courseName) {
        this.courseName = courseName;
        students = new String[100];
        numberOfStudents = 0;
    }

    String getCourseName() {
        return courseName;
    }

    void addStudent(String student) {
        students[numberOfStudents++] = student;
    }

    void dropStudent(String student) {
        for ( int i = 0; i < numberOfStudents; i++ ) {
            if ( students[i].equals(student) ) {
                for ( int j = i; j < numberOfStudents - 1; j++ ) {
                    students[j] = students[j+1];
                }
                break;
            }
        }
        numberOfStudents--;
    }

    String[] getStudents() {
        return students;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }
}
