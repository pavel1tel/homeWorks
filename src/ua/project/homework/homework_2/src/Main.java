package ua.project.homework.homework_2.src;


public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(0, 100);
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
