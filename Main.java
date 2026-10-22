public class Main {
    public static void main(String[] args) {
        Course tester = new Course("Software & Design", "CSCI 1581", 3);
        Student student1 = new Student("Computer Science", 2024, 35, 12, 15);

        student1.addCompletedCourse("CSCI 1581","CSCI 2120","CSCI 2121");
      
        tester.addPrerequisite("CSCI 1000");

        System.out.println(student1);

        System.out.println(student1.hasCompletedCourse("CSCI 2025"));
        
    }
}
