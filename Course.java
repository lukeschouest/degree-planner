import java.util.ArrayList;
public class Course {

    private String courseName;
    private String courseCode;
    private int creditHour;
    private ArrayList<String> prerequisites;

    public Course (String courseName, String courseCode, int creditHour) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHour = creditHour;
        this.prerequisites = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
   }
 
    public String getCourseCode() {
        return this.courseCode;
    }

    public int getCreditHour() {
        return this.creditHour;
    }

    public ArrayList<String> getPrerequisites() {
        return this.prerequisites;
    }

    public void addPrerequisite(String...prerequisite) {
        for(String prereq : prerequisite) {
            prerequisites.add(prereq);
        }
    }

    @Override 
    public String toString() {
        return courseName + ", " + courseCode + ", " + creditHour + "\n" + prerequisites;
    }
    
}