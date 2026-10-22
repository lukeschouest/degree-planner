import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CourseCatalog {
    private HashMap<String, Course> courses;

    public CourseCatalog() {
        this.courses = new HashMap<>(); 
    }

    public void addCourse(Course course) {
        this.courses.put(course.getCourseCode(), course);
    }

    public Course getCourse(String courseCode) {
        return this.courses.get(courseCode); 
    }

    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> allCourses = new ArrayList<>(courses.values());
        return allCourses;   
    }

}
