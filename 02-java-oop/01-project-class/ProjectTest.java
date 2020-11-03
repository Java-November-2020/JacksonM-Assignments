public class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project();
        // p.Project();
        String result = p.elevatorPitch("Project", "Test If the Elevator Pitch is working");
        System.out.println(result);
        String coding = p.Project("Coding Dojo");
        System.out.println(coding);
        String nameDesc = p.Project("Java OOP ", "Awesome");
        System.out.println(nameDesc);
    }
}
