public class Main {
    public static void main(String[] args) {
        Course tester = new Course("Software & Design", "CSCI 1581", 3);
        
        tester.addPrerequisite("CSCI 1000");

        System.out.println(tester);
        
    }
}
