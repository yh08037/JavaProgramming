public class UseCourse {
    public static void main(String[] args) {
        Course course = new Course("Java");
        System.out.println(course.getCourseName());
        course.addStudent("Dohun");
        course.addStudent("Daeheon");
        course.addStudent("Jimin");
        System.out.print(course.getNumberOfStudents() + " ");
        for ( int i = 0; i < course.getNumberOfStudents(); i++ ) {
            String[] tmp = course.getStudents();
            System.out.print(tmp[i] + " ");
        }
        System.out.println();
        course.dropStudent("Daeheon");
        System.out.print(course.getNumberOfStudents() + " ");
        for ( int i = 0; i < course.getNumberOfStudents(); i++ ) {
            String[] tmp = course.getStudents();
            System.out.print(tmp[i] + " ");
        }
        System.out.println();
    }
}
