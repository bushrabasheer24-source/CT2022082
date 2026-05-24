package Q5;

public class Main {

    public static void main(String[] args) {

        // Lecturer Object
        Lecturer lec = new Lecturer();
        lec.setLecturerName("Kesavan Selvarajah");
        lec.setCourseTeaching("Object Oriented Programming");

        // Course Object
        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CTEC 22043");
        course.setLecturer(lec);

        // Student Object
        Student stu = new Student();
        stu.setStudentName("Bushra");
        stu.setDegreeName("ICT");
        stu.setCourseFollowing("OOP");

        // Display Details
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());

        System.out.println("Student Name: " + stu.getStudentName());
        System.out.println("Degree Name: " + stu.getDegreeName());
        System.out.println("Course Following: " + stu.getCourseFollowing());
    }
}
