import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        CourseCatalog catalog = new CourseCatalog();
        
        Scanner file = new Scanner(new File("courses.csv"));

        file.nextLine();

        while (file.hasNextLine()) {
            String line = file.nextLine();

            String[] data = line.split(",", -1);

            String courseCode = data[0];
            String courseName = data[1];
            int creditHours = Integer.parseInt(data[2]);
            String prerequisiteField = data[3].trim();
            
            Course course = new Course(courseName, courseCode, creditHours);

            if (!prerequisiteField.isEmpty()) {
                for (String prerequisite : prerequisiteField.split("\\|")) {
                    String prerequisiteCode = prerequisite.trim();

                    if (!prerequisiteCode.isEmpty()) {
                        course.addPrerequisite(prerequisiteCode);
                    }
                }
            }

            catalog.addCourse(course);
        }

        ArrayList<Course> courses = catalog.getAllCourses();
        courses.sort(Comparator.comparing(course -> course.getCourseCode()));

        for (Course course : courses) {
            System.out.println(course +"\n");
        }
        
        file.close();
    } 
}
