import GUI.GUI;

public class Main {
    public static void main(String[] args) {
         GUI window = new GUI("Window");
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}
