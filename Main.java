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

        System.out.println(catalog.getAllCourses());


        file.close();
    } 
}
