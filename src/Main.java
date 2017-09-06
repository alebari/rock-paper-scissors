import javax.swing.*;

/**
 * Created by Alessandra on 06.09.2017.
 */
public class Main {

    public static void main(String s[]) {
        JFrame frame = new JFrame("Schere Stein Papier");
        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new MainView());

        frame.setVisible(true);
    }
}
