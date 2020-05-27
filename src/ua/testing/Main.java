package ua.testing;

/**
 * <h1>Arrays MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-06
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
