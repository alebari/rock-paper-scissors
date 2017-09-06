import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

/**
 * Created by Alessandra on 06.09.2017.
 */
public class MainView extends JPanel {

    private Game game = new Game();

    private JLabel lblPlayer1Won = createJLabel("");
    private JLabel lblPlayer2Won = createJLabel("");
    private JLabel lblDraw = createJLabel("");

    private int space = 5;

    public MainView() {

        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridLayout());

        JPanel components = new JPanel(new BorderLayout(space, space));

        JPanel pOverview = new JPanel(new GridLayout(0, 1, space, space));

        JPanel pPlayer = new JPanel(new GridLayout(2, 2, space, space));

        pPlayer.add(createJLabel("Spieler 1 (Stein):"));
        pPlayer.add(createJLabel("Spieler 2:"));
        pPlayer.add(lblPlayer1Won);
        pPlayer.add(lblPlayer2Won);

        pOverview.add(createJLabel("Spiele gewonnen:"));
        pOverview.add(pPlayer);
        pOverview.add(createJLabel("Spiele unentschieden:"));
        pOverview.add(lblDraw);

        components.add(pOverview, BorderLayout.CENTER);

        JButton startGame = new JButton("Spiel starten");
        startGame.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                game.startGame();

                lblPlayer1Won.setText(Integer.toString(game.getPlayer1Won()));
                lblPlayer2Won.setText(Integer.toString(game.getPlayer2Won()));
                lblDraw.setText(Integer.toString(game.getDraw()));

                game.resetGame();
            }
        });

        components.add(startGame, BorderLayout.SOUTH);

        this.add(components);
    }

    private JLabel createJLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setVerticalAlignment(SwingConstants.CENTER);
        return lbl;
    }
}
