import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        CourseCatalog catalog = new CourseCatalog();
        
        Scanner file = new Scanner(new File("courses.csv"));

        file.nextLine();

        while (file.hasNextLine()) {
            String line = file.nextLine();

            String[] data = line.split(",");

            String courseCode = data[0];
            String courseName = data[1];
            int creditHours = Integer.parseInt(data[2]);

            Course course = new Course(courseName, courseCode, creditHours);

            catalog.addCourse(course);
        }

        // System.out.println(catalog.getAllCourses());

        Student stu1 = new Student("Computer Science", 2024, 15, 12, 16);

        Course cou1 = new Course("Software 1", "CSCI 1581", 3);
        Course cou2 = new Course("Software 2", "CSCI 1583",1);
        cou2.addPrerequisite("CSCI 1581");
        cou2.addPrerequisite("CSCI 1000");


        stu1.addCompletedCourse("CSCI 1581");
        DegreePlan test = new DegreePlan();

        boolean eligible = test.meetsPrerequisites(stu1, cou2);

        


        System.out.println("Checking: " + cou2.getCourseName() + " (" + cou2.getCourseCode() + ")");
        System.out.println("Prerequisites: " + cou2.getPrerequisites());
        if (eligible) {
            System.out.println("Result: Eligible to take this course.");
        } else {
            System.out.println("Result: Not eligible yet.");
            System.out.println("Missing: " + test.getMissingPrerequisites(stu1, cou2));
        }

        file.close();
    } 
}
