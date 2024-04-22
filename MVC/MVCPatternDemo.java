package MVC;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // fetch student record
        Student model = new Student();
        model.setName("Robert");
        model.setRollNo("10");
        // Create a view : to write student details on console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,
                view);
        controller.updateView();
        // update model data
        controller.setStudentName("John");
        controller.updateView();
    }
}