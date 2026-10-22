public class Main {
    public static void main(String[] args) {
        Course tester = new Course("Software & Design", "CSCI 1581", 3);
        Student student1 = new Student("Computer Science", 2024, 35, 12, 15);
        CourseCatalog cata1 = new CourseCatalog();
        DegreePlan p1 = new DegreePlan();

        cata1.addCourse(tester);

        System.out.println(cata1.getCourse("CSCI 1581"));

        tester.addPrerequisite("CSCI 1000", "CSCI 1200");

        student1.addCompletedCourse("CSCI 1000","CSCI 1200");

        System.out.println(p1.meetsPrerequisites(student1, tester));



        



        
    }
}
