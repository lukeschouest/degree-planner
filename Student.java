import java.util.HashSet;

public class Student {
    private String major;
    private int yearStarted;
    private int completedCredits;
    private int minCredits;
    private int maxCredits;
    private HashSet<String> completedCourses;
    private HashSet<String> inProgressCourses;

    public Student (String major, int yearStarted, int completedCredits, int minCredits, int maxCredits) {
        this.major = major;
        this.yearStarted = yearStarted;
        this.completedCredits = completedCredits;
        this.minCredits = minCredits;
        this.maxCredits = maxCredits;
        this.completedCourses = new HashSet<>();
        this.inProgressCourses = new HashSet<>();
    }

    public String getMajor() {
        return this.major;
    }

    public int getYearStarted() {
        return this.yearStarted;
    }
    
    public int getCompletedCredits() {
        return this.completedCredits;
    }

    public int getMinCredits() {
        return this.minCredits;
    }

    public int getMaxCredits() {
        return this.maxCredits;
    }

    public HashSet<String> getCompletedCourses() {
        return this.completedCourses;
    }

    public void addCompletedCourse(String...courseCode) {
        for (String course : courseCode) {
            completedCourses.add(course);
        }
    }

    public boolean hasCompletedCourse(String courseCode) {
        return this.completedCourses.contains(courseCode);
    }

    public void addInProgressCourse(String...courseCode) {
        for (String course : courseCode) {
            inProgressCourses.add(course);
        }
    }
    
    public HashSet<String> getInProgressCourses() {
        return new HashSet<>(inProgressCourses);
    }

    @Override 
    public String toString() {
        return "Major: " + major + "\n"
        + "Year Started: " + yearStarted + "\n"
        + "Completed Credits: " + completedCredits + "\n" 
        + "Desired Credits per semester: " + minCredits + "-" + maxCredits + "\n" 
        + "Completed Courses: " + completedCourses; 
    }
}