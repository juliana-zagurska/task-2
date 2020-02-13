package out;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
        controller.process(model, view, 5, 15);
    }
}
