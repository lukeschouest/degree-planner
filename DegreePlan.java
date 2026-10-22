public class DegreePlan {
    
    public boolean meetsPrerequisites(Student student,Course course) {
        
        for(String prereq : course.getPrerequisites()) {
           
            if(!student.hasCompletedCourse(prereq)) {
                return false;
            }

        }
        
        return true;
    }
}
