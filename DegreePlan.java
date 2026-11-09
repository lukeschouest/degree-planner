import java.util.ArrayList;

public class DegreePlan {

    public boolean meetsPrerequisites(Student student,Course course) {
        return getMissingPrerequisites(student, course).isEmpty();
    }

    public ArrayList<String> getMissingPrerequisites(Student student, Course course) {
        ArrayList<String> missingPrerequisites = new ArrayList<>();

        for (String prereq : course.getPrerequisites()) {
            if (!student.hasCompletedCourse(prereq)) {
                missingPrerequisites.add(prereq);
            }
        }

        return missingPrerequisites;
    }

}
